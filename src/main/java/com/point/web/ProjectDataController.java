package com.point.web;

import com.point.entity.ProjectColumnDefinition;
import com.point.entity.ProjectData;
import com.point.mapper.ProjectColumnDefinitionMapper;
import com.point.mapper.ProjectDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class ProjectDataController {
    @Autowired
    ProjectDataMapper projectDataMapper;

    @Autowired
    ProjectColumnDefinitionMapper projectColumnDefinitionMapper;

    @GetMapping("/ProjectColumnDefinitionAdd")
    public ModelAndView projectColumnDefinitionAdd() {
        ModelAndView modelAndView = new ModelAndView("ComponentList");
        return modelAndView;
    }

    @PostMapping("/ProjectColumnDefinitionAdd")
    public String addProjectColumnDefinition(@ModelAttribute ProjectColumnDefinition projectColumnDefinition, HttpServletResponse response) {
        try {
            projectColumnDefinitionMapper.insert(projectColumnDefinition);
            response.sendRedirect("/ProjectColumnDefinitionList");
        } catch (IOException e1) {
        }
        return null;
    }
}
