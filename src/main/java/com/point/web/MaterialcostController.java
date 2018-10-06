package com.point.web;

import com.point.entity.GridDataJsonModel;
import com.point.entity.Materialcost;
import com.point.entity.ProcessResultsJsonModel;
import com.point.mapper.MaterialcostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class MaterialcostController {

    @Autowired
    private MaterialcostMapper materialcostMapper;

    @GetMapping("/MaterialcostList")
    public ModelAndView componentpostList() {
        return new ModelAndView( "MaterialcostList");
    }

    @ResponseBody
    @RequestMapping("/saveMaterialcost")
    public ProcessResultsJsonModel saveMaterialcost(@RequestParam(value = "id", defaultValue = "0") int id,
                                          @RequestParam(value = "unitprice", defaultValue = "0") BigDecimal unitprice,
                                          @RequestParam(value = "remark", defaultValue = "") String remark) {
        ProcessResultsJsonModel result = new ProcessResultsJsonModel<>();
        Materialcost entity = materialcostMapper.selectByPrimaryKey(id);
        entity.setUnitprice(unitprice);
        entity.setRemark(remark);
        materialcostMapper.updateByPrimaryKey(entity);
        result.setStatus("1");
        return result;
    }

    @RequestMapping("/getMaterialcost")
    public GridDataJsonModel getMaterialcost() {
        GridDataJsonModel model = new GridDataJsonModel();
        List<Materialcost> list=materialcostMapper.selectByExample(null);
        model.setStatus("success");
        model.setData(list);
        model.setTotals(list.size());
        return model;
    }

}
