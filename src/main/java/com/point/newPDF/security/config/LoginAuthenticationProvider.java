package com.point.newPDF.security.config;


import com.point.newPDF.security.entity.MyUserDetails;
import com.point.newPDF.security.service.LightSwordUserDetailService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

import static com.point.newPDF.security.config.LoginError.*;

public class LoginAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    private LightSwordUserDetailService userDetailService;

    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse("2020-05-20 16:07:05",df);
        Duration d=Duration.between(ldt,LocalDateTime.now());
        System.out.println(d);
    }
    @SneakyThrows
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
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
        Duration d=Duration.between(user.getVerificationCode().getCreatetime(),LocalDateTime.now());
        if(!user.getIpaddress().equals(ipaddress)){
           if(verificationCode==null){
               throw new LoginAuthenticationException(ERROR_IP);
           }else if(d.toMinutes()>30){
               throw new LoginAuthenticationException(ERROR_VERIFICATIONTIME);
           }else if(!user.getVerificationCode().getCode().equals(verificationCode)){
               throw new LoginAuthenticationException(ERROR_VERIFICATION);
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
