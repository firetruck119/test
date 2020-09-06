package com.point.newPDF.controller;

import com.point.common.Consts;
import com.point.common.CustomerException;
import com.point.entity.PermissionCode;
import com.point.entity.PermissionCodeExample;
import com.point.mapper.PermissionCodeMapper;
import com.point.newPDF.Service.MailService;
import com.point.newPDF.Service.UsersInfoService;
import com.point.newPDF.entity.RoleEntity;
import com.point.newPDF.entity.UserEntity;
import com.point.newPDF.entity.VerificationEntity;
import com.point.security.entity.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@Controller
public class LoginController {

    @Autowired
    private UsersInfoService service;

    @Autowired
    MailService mailService;

    @Autowired
    private PermissionCodeMapper permissionCodeMapper;

    @GetMapping("/login")
    public String login() {
        return "login/login";
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

    @PostMapping("/login/getCurrentUpUser")
    @ResponseBody
    public Object getCurrentUpUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        MyUserDetails myUserDetails = (MyUserDetails) authentication.getPrincipal();
        List<UserEntity> users = service.getUpUserByUsername(myUserDetails.getUsername());
        Iterator<UserEntity> i = users.iterator();
        List<String> names = new ArrayList<>();
        while (i.hasNext()) {
            UserEntity u = i.next();
            names.add(u.getUsername() + "-" + u.getUserrealname());
        }
        return names;
    }

    @PostMapping("/login/checkPermission")
    @ResponseBody
    public Object checkPermission(@RequestParam("code") String code) throws CustomerException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        MyUserDetails myUserDetails = (MyUserDetails) authentication.getPrincipal();
        UserEntity user = service.getUserByUsername(myUserDetails.getUsername());
        PermissionCodeExample permissionCodeExample = new PermissionCodeExample();
        PermissionCodeExample.Criteria criteria = permissionCodeExample.createCriteria();
        criteria.andUseridEqualTo(user.getId());

        permissionCodeExample.setOrderByClause(" changelasttime desc limit 1 ");
        List<PermissionCode> list = permissionCodeMapper.selectByExample(permissionCodeExample);
        PermissionCode permissionCode = list.size()>0?list.get(0):null;

        if(permissionCode==null||
                new Date().getTime() - permissionCode.getCreatetime().getTime()>1000*60*Consts.PERMISSION_MINUTES)
            throw new CustomerException("请先选择上级账号并发送验证码");
        if (!permissionCode.getCode().equals(code))
            throw new CustomerException("验证码不正确或者并不是最新验证码");
        permissionCode.setCheckflag(1);
        permissionCodeMapper.updateByPrimaryKeySelective(permissionCode);
        if(!myUserDetails.getRoleList().contains(Consts.TEMP_OWERN)){
            myUserDetails.getRoleList().add(Consts.TEMP_OWERN);
        }
        // 生成新的认证信息
        Collection<? extends GrantedAuthority> authorities = myUserDetails.getAuthorities();
        Authentication newAuth = new UsernamePasswordAuthenticationToken(authentication.getPrincipal(),
                authentication.getCredentials(), authorities);
        SecurityContextHolder.getContext().setAuthentication(newAuth);
        return null;
    }

    @PostMapping("/login/sendPermission")
    @ResponseBody
    public Object sendPermission(@RequestParam("upusername") String upusername) throws CustomerException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        MyUserDetails myUserDetails = (MyUserDetails) authentication.getPrincipal();
        UserEntity user = service.getUserByUsername(myUserDetails.getUsername());
        upusername = upusername.split("-")[0];
        UserEntity upuser = service.getUserByUsername(upusername);
        if (upuser.getLevel() <= user.getLevel())
            throw new CustomerException("登录用户等级高于获得验证码用户等级");
        String code= StringUtils.randomAlphanumeric(5);
        PermissionCode permissionCode=new PermissionCode();
        permissionCode.setUserid(user.getId());
        permissionCode.setCode(code);
        permissionCodeMapper.insertSelective(permissionCode);
        mailService.sendPermissionMail(
                upuser.getUsername() + "-" + upuser.getUserrealname(),
                user.getUsername() + "-" + user.getUserrealname(),
                upuser.getEmailaddress(),
                code);
        return null;
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
    public Object error403(HttpServletResponse response) throws IOException {
        response.setStatus(403);
//        response.getWriter().append("server error");
        return "login/403";
    }
    @GetMapping("/home")
    public Object loginH() {
        return "newHtml/home";
    }

    @GetMapping("/")
    public Object home() {
        return "login/login";
    }
}
