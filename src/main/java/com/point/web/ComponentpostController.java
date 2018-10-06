package com.point.web;

import com.point.entity.Componentpost;
import com.point.entity.GridDataJsonModel;
import com.point.entity.ProcessResultsJsonModel;
import com.point.mapper.ComponentpostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class ComponentpostController {

   @Autowired
    private ComponentpostMapper componentpostMapper;

    @GetMapping("/ComponentpostAdd")
    public ModelAndView componentpostAdd(Model model, @ModelAttribute Componentpost componentpost) {
        model.addAttribute("componentpost", new Componentpost());
        return new ModelAndView("ComponentpostAdd");
    }

    @GetMapping("/ComponentpostList")
    public ModelAndView componentpostList() {
        return new ModelAndView( "ComponentpostList");
    }

    @RequestMapping(value="/deletepost/{id}")
    public ProcessResultsJsonModel delete(@PathVariable("id") Integer id) {
        ProcessResultsJsonModel result = new ProcessResultsJsonModel<>();
        componentpostMapper.deleteByPrimaryKey(id);
        result.setStatus("1");
        return result;
    }

    @RequestMapping("/getComponentpost")
    public GridDataJsonModel getComponentpost() {
        GridDataJsonModel model = new GridDataJsonModel();
        List<Componentpost> list=componentpostMapper.selectByExample(null);
        model.setStatus("success");
        model.setData(list);
        model.setTotals(list.size());
        return model;
    }

    @PostMapping("/ComponentpostAdd")
    public String greetingSubmit(@ModelAttribute Componentpost componentpost, HttpServletResponse response) {
        try {
            componentpostMapper.insert(componentpost);
            response.sendRedirect("/ComponentpostList");
        } catch (IOException e1) {
        }
        return null;
    }
}
