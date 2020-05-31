package com.point.newPDF.controller;

import com.point.common.CustomerException;
import com.point.newPDF.Service.UsersInfoService;
import com.point.newPDF.entity.RoleEntity;
import com.point.newPDF.entity.UserEntity;
import com.point.newPDF.security.entity.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserManagerController {

    @Autowired
    UsersInfoService userService;

    @GetMapping("/usermanager")
    public String getWeb(Model model) {
        model.addAttribute("mainHtml", "usermanager");
        model.addAttribute("pdfname", "usermanager");
        return "newHtml/home";
    }

    @PostMapping("/usermanager/insertUser")
    @ResponseBody
    public String insertUser( @RequestBody UserEntity user) throws Exception {
        userService.insertUser(user);
        return "newHtml/home";
    }

    @PostMapping("/usermanager/updataUser")
    @ResponseBody
    public String updataUser( @RequestBody UserEntity user) throws Exception {
        MyUserDetails currentUser=getCurrentUser();
        if(user.getLevel()>=getCurrentUserLevel()){
            throw new CustomerException("没有权限");
        }
        userService.updataUser(user);
        return "";
    }
    @PostMapping("/usermanager/deleteUser")
    @ResponseBody
    public void deleteUser(@RequestBody UserEntity user) throws CustomerException {
        MyUserDetails currentUser=getCurrentUser();
        if(user.getLevel()>=getCurrentUserLevel()){
            throw new CustomerException("没有权限");
        }
        userService.deleteById(user);
    }

    @GetMapping("/usermanager/getUserList")
    @ResponseBody
    public Object getAllUser(){
        return userService.getAll(getCurrentUserLevel());
    }

    @GetMapping("/usermanager/getRoleList")
    @ResponseBody
    public Object getRoleList(){
        return RoleEntity.getRoleNameListUnderLevel(1);
    }

    @GetMapping("/getCurrentUser")
    @ResponseBody
    public MyUserDetails getCurrentUser(){
        Authentication authentication =SecurityContextHolder.getContext().getAuthentication();
        return (MyUserDetails) authentication.getPrincipal();
    }
    @PostMapping("/getCurrentUserName")
    @ResponseBody
    @Primary
    public Object getCurrentUserName(){
        Authentication authentication =SecurityContextHolder.getContext().getAuthentication();
        MyUserDetails user=((MyUserDetails)authentication.getPrincipal());
        return  user.getUsername()+"-"+user.getName();
    }
    private int getCurrentUserLevel(){
        RoleEntity entity=RoleEntity.valueOf(getCurrentUser().getRoleList().get(0));
        return entity.getLevel();
    }
}
