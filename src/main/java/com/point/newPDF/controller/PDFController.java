package com.point.newPDF.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PDFController {
    @GetMapping("/pdf/{pdfname}")
    public String getWeb(Model model, @PathVariable("pdfname") String pdfname){
        model.addAttribute("mainHtml","pdf");
        model.addAttribute("pdfname",pdfname);
        return "newHtml/home";
    }
}
