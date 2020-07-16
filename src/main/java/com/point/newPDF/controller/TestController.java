package com.point.newPDF.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @ResponseBody
    @RequestMapping(value="/callJs",produces = "text/html; charset=UTF-8")
    public String callJs()throws Exception{
        return "parent.alert('Hello Js');";
    }
    @GetMapping("/t")
    public String getMap(){
        return "test";
    }
}
