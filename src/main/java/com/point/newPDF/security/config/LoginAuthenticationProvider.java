package com.point.newPDF.security.config;


import com.point.newPDF.error.LoginAuthenticationException;
import com.point.newPDF.security.entity.MyUserDetails;
import com.point.newPDF.security.service.LightSwordUserDetailService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.thymeleaf.util.StringUtils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;

import static com.point.newPDF.error.LoginError.*;

public class LoginAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    private LightSwordUserDetailService userDetailService;

    @SneakyThrows
    @Override
    public Authentication authenticate(Authentication authentication){
        // http请求的账户密码
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        String ipaddress = ((CustomWebAuthenticationDetails) authentication.getDetails()).getRemoteAddress();
        String verificationCode = ((CustomWebAuthenticationDetails) authentication.getDetails()).getVerificationCode();
        // 数据库根据用户名查询
        MyUserDetails user = (MyUserDetails)userDetailService.loadUserByUsername(username);
        if(!user.getPassword().equals(password)){
            throw new LoginAuthenticationException(ERROR_PASSWORD);
        }
        if(!user.getIpaddress().equals(ipaddress)){
           if(StringUtils.isEmpty(verificationCode)){
               throw new LoginAuthenticationException(ERROR_IP);
           }else if(user.getVerificationCode()==null){
               if(user.getRoleList().get(0).equals("OWERN"))
                   throw new LoginAuthenticationException(ERROR_HIGHESTAUTHORITY);
               else
                    throw new LoginAuthenticationException(ERROR_NOVERIFI);
           }else if(!user.getVerificationCode().getCode().equals(verificationCode)){
               throw new LoginAuthenticationException(ERROR_VERIFICATION);
           }else if(Duration.between(user.getVerificationCode().getCreatetime(),LocalDateTime.now()).toMinutes()>30){
               throw new LoginAuthenticationException(ERROR_VERIFICATIONTIME);
           }
        }
        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
        return new UsernamePasswordAuthenticationToken(user, password, authorities);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
