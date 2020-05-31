package com.point.newPDF.controller;

import com.point.common.CustomerException;
import com.point.newPDF.Service.MailService;
import com.point.newPDF.Service.UsersInfoService;
import com.point.newPDF.entity.UserEntity;
import com.point.newPDF.entity.VerificationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private UsersInfoService service;

    @Autowired
    MailService mailService;

    @GetMapping("/login")
    public String login() {
        return "/login/login";
    }

    @PostMapping("/login/getUpUser")
    @ResponseBody
    public Object getUpUser(@RequestParam("username") String username) {
        List<UserEntity> users = service.getUpUserByUsername(username);
        Iterator<UserEntity> i = users.iterator();
        List<String> names = new ArrayList<>();
        while (i.hasNext()) {
            UserEntity u = i.next();
            names.add(u.getUsername() + "-" + u.getUserrealname());
        }
        return names;
    }

    @PostMapping("/login/sendVerification")
    @ResponseBody
    public Object sendVerification(@RequestParam("upusername") String upusername, @RequestParam("username") String username) throws CustomerException {
        upusername = upusername.split("-")[0];
        UserEntity upuser = service.getUserByUsername(upusername);
        UserEntity user = service.getUserByUsername(username);
        if (upuser.getLevel() <= user.getLevel())
            throw new CustomerException("登录用户等级高于获得验证码用户等级");
        String code= StringUtils.randomAlphanumeric(10);
        VerificationEntity entity=new VerificationEntity(user.getId(),code);
        service.insertVerification(entity);
        mailService.sendVerification(
                upuser.getUsername() + "-" + upuser.getUserrealname(),
                user.getUsername() + "-" + user.getUserrealname(),
                upuser.getEmailaddress(),
                code);
        return null;
    }
    @GetMapping("/403")
    public Object error403() {
        return "login/403";
    }
    @GetMapping("/")
    public Object home() {
        return "newHtml/home";
    }
}
