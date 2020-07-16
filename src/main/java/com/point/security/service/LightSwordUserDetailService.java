package com.point.security.service;

import com.point.common.CustomerException;
import com.point.newPDF.Service.UsersInfoService;
import com.point.newPDF.entity.RoleEntity;
import com.point.newPDF.entity.UserEntity;
import com.point.newPDF.entity.VerificationEntity;
import com.point.security.entity.MyUserDetails;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LightSwordUserDetailService implements UserDetailsService  {

    @Autowired
    private UsersInfoService userService;

    @SneakyThrows
    @Override
    public UserDetails loadUserByUsername(String s) {
        UserEntity user=userService.getUserByUsername(s);
        if(user==null){
            return null;
        }
        VerificationEntity code=userService.selectVerificationByUserId(user.getId());
        List<String> authorities=new ArrayList<>();
        authorities.add(RoleEntity.getRoleByLevel(user.getLevel()).toString());
        authorities.add(s);
        return new MyUserDetails(user,authorities,code);
    }
}
