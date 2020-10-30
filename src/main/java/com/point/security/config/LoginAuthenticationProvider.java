package com.point.security.config;


import com.point.common.Consts;
import com.point.entity.PermissionCode;
import com.point.entity.PermissionCodeExample;
import com.point.mapper.PermissionCodeMapper;
import com.point.security.entity.MyUserDetails;
import com.point.security.error.LoginAuthenticationException;
import com.point.security.service.LightSwordUserDetailService;
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
import java.util.Date;
import java.util.List;

import static com.point.security.error.LoginError.*;


public class LoginAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    private LightSwordUserDetailService userDetailService;

    @Autowired
    private PermissionCodeMapper permissionCodeMapper;

    @SneakyThrows
    @Override
    public Authentication authenticate(Authentication authentication) {
        // http请求的账户密码
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        String ipaddress = ((CustomWebAuthenticationDetails) authentication.getDetails()).getRemoteAddress();
        String verificationCode = ((CustomWebAuthenticationDetails) authentication.getDetails()).getVerificationCode();
        // 数据库根据用户名查询
        MyUserDetails user = (MyUserDetails) userDetailService.loadUserByUsername(username);
        try {
            if (user == null) {
                throw new LoginAuthenticationException("用户名" + username + "未注册");
            }
            if (!user.getPassword().equals(password)) {
                throw new LoginAuthenticationException(ERROR_PASSWORD);
            }
            if (!((user.getIpaddress().equals("donotneedipaddress") && user.getLevel() == 2)))
                if (!user.getIpaddress().equals(ipaddress)) {
                    if (StringUtils.isEmpty(verificationCode)) {
                        throw new LoginAuthenticationException(ERROR_IP);
                    } else if (user.getVerificationCode() == null) {
                        if (user.getRoleList().get(0).equals("OWERN"))
                            throw new LoginAuthenticationException(ERROR_HIGHESTAUTHORITY);
                        else
                            throw new LoginAuthenticationException(ERROR_NOVERIFI);
                    } else if (!user.getVerificationCode().getCode().equals(verificationCode)) {
                        throw new LoginAuthenticationException(ERROR_VERIFICATION);
                    } else if (Duration.between(user.getVerificationCode().getCreatetime(), LocalDateTime.now()).toMinutes() > 30) {
                        throw new LoginAuthenticationException(ERROR_VERIFICATIONTIME);
                    }
                }
        } catch (LoginAuthenticationException e) {

            throw e;
        }
        setTempPermission(user);
        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
        return new UsernamePasswordAuthenticationToken(user, password, authorities);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }

    private void setTempPermission(MyUserDetails user) {
        if (user.getLevel() == 3) {
            PermissionCodeExample permissionCodeExample = new PermissionCodeExample();
            PermissionCodeExample.Criteria criteria = permissionCodeExample.createCriteria();
            criteria.andUseridEqualTo(user.getId());
            criteria.andCheckflagEqualTo(1);
            permissionCodeExample.setOrderByClause(" changelasttime desc limit 1 ");
            List<PermissionCode> list = permissionCodeMapper.selectByExample(permissionCodeExample);
            if (list.size() > 0) {
                if (new Date().getTime() - list.get(0).getCreatetime().getTime() < 1000 * 60 * Consts.PERMISSION_MINUTES) {
                    user.getRoleList().add(Consts.TEMP_OWERN);
                }
            }
        }
    }
}
