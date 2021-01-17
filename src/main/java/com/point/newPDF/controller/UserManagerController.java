package com.point.newPDF.controller;

import com.point.common.Consts;
import com.point.common.CustomerException;
import com.point.newPDF.Service.UsersInfoService;
import com.point.newPDF.entity.RoleEntity;
import com.point.newPDF.entity.UserEntity;
import com.point.security.error.UserException;
import com.point.security.entity.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.point.security.error.UserError.ERROR_NOTENUUGHLEVEL;


@Controller
public class UserManagerController {

    @Autowired
    UsersInfoService userService;

    @GetMapping("/usermanager")
//    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_OWERN')")
    public String getWeb(Model model) {
        model.addAttribute("mainHtml", "usermanager");
        model.addAttribute("pdfname", "usermanager");
        return "newHtml/home";
    }

    public int getRoleLevelByString(String role){
        return RoleEntity.getRoleByString(role).getLevel();
    }
    public int getRoleLevelByRoleString(String role){
        return RoleEntity.valueOf(role).getLevel();
    }
    @PostMapping("/usermanager/insertUser")
    @ResponseBody
    public String insertUser(@RequestBody UserEntity user, HttpServletRequest req) throws Exception {
        MyUserDetails cuser=getCurrentUser();
        if(getRoleLevelByString(user.getRole())>=getRoleLevelByRoleString(cuser.getRoleList().get(0)))
            throw new UserException(ERROR_NOTENUUGHLEVEL);
        if(user.getIpaddress().isEmpty())user.setIpaddress(req.getRemoteAddr());
        userService.insertUser(user);
        return "";
    }

    @PostMapping("/usermanager/updataUser")
    @ResponseBody
    public String updataUser( @RequestBody UserEntity user,HttpServletRequest req) throws Exception {
        MyUserDetails currentUser=getCurrentUser();
        if(!currentUser.getUsername().equals(user.getUsername())&&RoleEntity.getRoleByString(user.getRole()).getLevel()>=currentUser.getLevel()){
            throw new CustomerException("没有权限");
        }
        if(user.getIpaddress().isEmpty())user.setIpaddress(req.getRemoteAddr());
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
        MyUserDetails user=getCurrentUser();
        String rolename=user.getRoleList().get(0);
        int level=RoleEntity.valueOf(rolename).getLevel();
        return RoleEntity.getRoleNameListUnderLevel(level);

    }

    @GetMapping("/getCurrentUser")
    @ResponseBody
    public MyUserDetails getCurrentUser(){
        Authentication authentication =SecurityContextHolder.getContext().getAuthentication();
        return (MyUserDetails) authentication.getPrincipal();
    }

    @GetMapping("/getCurrentUserLevel")
    @ResponseBody
    public Integer getUserLevel(){
        return getCurrentUserLevel();
    }

    @GetMapping("/getPermitsAboveAdmin")
    @ResponseBody
    public List<String> getPermitsAboveAdmin(){
        List<String> result = new ArrayList<>();
        Arrays.stream(Consts.OWERN_PERMITS).forEach(x->result.add(x));
        Arrays.stream(Consts.ADMIN_PERMITS).forEach(x->result.add(x));
        return result;
    }

    @GetMapping("/getPermitsAboveSuperUser")
    @ResponseBody
    public List<String> getPermitsAboveSuperUser(){
        List<String> result = new ArrayList<>();
        Arrays.stream(Consts.OWERN_PERMITS).forEach(x->result.add(x));
        Arrays.stream(Consts.ADMIN_PERMITS).forEach(x->result.add(x));
        Arrays.stream(Consts.SUPERUSER_PERMITS).forEach(x->result.add(x));
        return result;
    }

    @GetMapping("/getNoPermitsPages")
    @ResponseBody
    public List<String> getNoPermitsPages(){
        MyUserDetails user=getCurrentUser();
        String rolename=user.getRoleList().get(0);
        int level=RoleEntity.valueOf(rolename).getLevel();
        List<String> result = new ArrayList<>();
        if(level<=2) {
            Arrays.stream(Consts.OWERN_PERMITS).forEach(x -> result.add(x));
            Arrays.stream(Consts.ADMIN_PERMITS).forEach(x -> result.add(x));
        }
        if(level<=1) {
            Arrays.stream(Consts.SUPERUSER_PERMITS).forEach(x -> result.add(x));
        }
        return result;
    }



    @PostMapping("/getCurrentUserName")
    @ResponseBody
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
