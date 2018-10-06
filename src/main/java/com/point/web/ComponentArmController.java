package com.point.web;

import com.point.entity.ComponentArmEntity;
import com.point.entity.GridDataJsonModel;
import com.point.entity.ProcessResultsJsonModel;
import com.point.mapper.ComponentArmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class ComponentArmController {

    @Autowired
    private ComponentArmMapper componentArmMapper;

    @GetMapping("/ComponentArmAdd")
    public ModelAndView componentArmAdd(Model model, @ModelAttribute ComponentArmEntity componentArmEntity) {
        model.addAttribute("ComponentArmEntity", new ComponentArmEntity());
        return new ModelAndView( "ComponentArmAdd");
    }

    @GetMapping("/ComponentArmList")
    public ModelAndView componentArmList() {
        return new ModelAndView("ComponentArmList");
    }

    @RequestMapping(value="/deletearm/{id}")
    public ProcessResultsJsonModel delete(@PathVariable("id") Long id) {
        ProcessResultsJsonModel result = new ProcessResultsJsonModel<>();
        componentArmMapper.delete(id);
        result.setStatus("1");
        return result;
    }

    @RequestMapping("/getComponentArm")
    public GridDataJsonModel getComponentArm() {
        GridDataJsonModel model = new GridDataJsonModel();
        List<ComponentArmEntity> list=componentArmMapper.getAll();
        model.setStatus("success");
        model.setData(list);
        model.setTotals(list.size());
        return model;
    }

    @PostMapping("/ComponentArmAdd")
    public String greetingSubmit(@ModelAttribute ComponentArmEntity componentArmEntity, HttpServletResponse response) {
        try {
            componentArmMapper.insert(componentArmEntity);
            response.sendRedirect("/ComponentArmList");
        } catch (IOException e1) {
        }
        return null;
    }
}
