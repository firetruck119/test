package com.point.web;

import com.point.entity.*;
import com.point.mapper.ComponentMapper;
import com.point.mapper.MaterialcostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

@RestController
public class ComponentController {
    @Autowired
    private ComponentMapper componentMapper;
    @Autowired
    private MaterialcostMapper materialcostMapper;

    private Map<Integer,List<Integer>> columnList;

    public ComponentController(){
        columnList = new HashMap<>();
        columnList.put(1,Arrays.asList(1,2,13,14,19,29,33,35,37,38,39,44,45,47,63,64,65,66,67)) ;
        columnList.put(2,Arrays.asList(1,2,13,29,33,37,38,39,44,45,47,63,64,65,66,67)) ;
        columnList.put(3,Arrays.asList(1,2,9,12,16,18,28,29,33,37,38,39,42,44,45,47,63,64,65,66,67)) ;
        columnList.put(4,Arrays.asList(1,2,29,33,37,38,39,44,45,47,63,64,65,66,67)) ;
        columnList.put(5,Arrays.asList(1,2,15,16,21,29,33,35,37,38,39,45,47,49,63,64,65,66,67)) ;
        columnList.put(6,Arrays.asList(1,2,16,18,19,24,29,30,33,35,37,38,39,43,45,46,47,63,64,65,66,67)) ;
        columnList.put(7,Arrays.asList(1,2,10,14,16,18,24,25,29,30,31,33,35,37,38,39,45,47,63,64,65,66,67)) ;
        columnList.put(8,Arrays.asList(1,2,7,15,16,18,19,21,24,29,30,33,35,37,38,39,42,43,45,46,47,63,64,65,66,67)) ;
        columnList.put(9,Arrays.asList(1,2,16,18,21,24,29,30,33,35,37,38,39,42,43,45,46,47,63,64,65,66,67)) ;
        columnList.put(10,Arrays.asList(1,2,7,15,16,18,19,21,27,29,33,34,35,37,38,39,42,43,45,46,63,64,65,66,67)) ;
        columnList.put(11,Arrays.asList(1,2,13,22,29,32,33,37,38,39,63,64,65,66,67)) ;
        columnList.put(12,Arrays.asList(1,2,3,4,5,6,8,11,18,23,29,33,36,37,38,39,63,64,65,66,67)) ;
        columnList.put(13,Arrays.asList(1,2,17,20,29,33,37,38,39,63,64,65,66,67)) ;
        columnList.put(14,Arrays.asList(1,2,26,29,33,37,38,39,48,63,64,65,66,67)) ;
    }

    @GetMapping("/ComponentAdd")
    public ModelAndView componentAdd(Model model, @ModelAttribute Component component,@RequestParam(value = "type", defaultValue = "0") Integer type) {
        Component data = new Component();
        data.setComponenttype(type);
        model.addAttribute("component", data);
        switch (type){
            case 1 :
                data.setComponentname("大臂");
                break;
            case 2 :
                data.setComponentname("立柱");
                break;
            case 3 :
                data.setComponentname("底架");
                break;
            case 4 :
                data.setComponentname("配重");
                break;
            case 5 :
                data.setComponentname("吊船");
                break;
            case 6 :
                data.setComponentname("臂头");
                break;
            case 7 :
                data.setComponentname("回转机构");
                break;
            case 8 :
                data.setComponentname("起升机构");
                break;
            case 9 :
                data.setComponentname("运行机构");
                break;
            case 10 :
                data.setComponentname("玻璃起吊");
                break;
            case 11 :
                data.setComponentname("钢丝绳");
                break;
            case 12 :
                data.setComponentname("轨道");
                break;
            case 13 :
                data.setComponentname("液压系统");
                break;
            case 14 :
                data.setComponentname("电气系统");
                break;
        }

        return new ModelAndView("ComponentAdd");
    }

    @GetMapping("/ComponentList")
    public ModelAndView componentList() {
        ModelAndView modelAndView = new ModelAndView("ComponentList");
        return modelAndView;
    }

    @RequestMapping(value="/deletecomponent/{id}")
    public ProcessResultsJsonModel deleteComponent(@PathVariable("id") Integer id) {
        ProcessResultsJsonModel result = new ProcessResultsJsonModel<>();
        componentMapper.deleteByPrimaryKey(id);
        result.setStatus("1");
        return result;
    }

    @RequestMapping("/getComponent/{type}")
    public GridDataJsonModel getComponentByType(@PathVariable("type") Integer type) {
        GridDataJsonModel model = new GridDataJsonModel();
        ComponentExample example = new ComponentExample();
        ComponentExample.Criteria criteria = example.createCriteria();
        criteria.andComponenttypeEqualTo(type);
        List<Component> list=componentMapper.selectByExample(example);
        List<Materialcost> costList = materialcostMapper.selectByExample(null);
        Map<Integer,BigDecimal> materialcostMap= new TreeMap<>();
        for(Materialcost item: costList){
            materialcostMap.put(item.getId(),item.getUnitprice());
        }
        for(Component item:list){
            item.setMaterialcostList(new ArrayList<>(materialcostMap.values()));
        }
        model.setStatus("success");
        model.setData(list);
        model.setTotals(list.size());
        return model;
    }

    @RequestMapping("/getColumnList/{type}")
    public GridDataJsonModel getColumnList(@PathVariable("type") Integer type) {
        GridDataJsonModel model = new GridDataJsonModel();
        model.setStatus("success");
        model.setData(columnList.get(type));
        model.setTotals(columnList.get(type).size());
        return model;
    }

    @PostMapping("/ComponentAdd")
    public String greetingSubmit(@ModelAttribute Component component, HttpServletResponse response,@RequestParam(value = "type", defaultValue = "0") Integer type) {
        try {
            component.setComponenttype(type);
            componentMapper.insert(component);
            response.sendRedirect("/ComponentList?type="+type);
        } catch (IOException e1) {
        }
        return null;
    }

}
