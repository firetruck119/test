package com.point.newPDF.security.entity;

import com.point.newPDF.entity.UserEntity;
import com.point.newPDF.entity.VerificationEntity;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Slf4j
@Data
public class MyUserDetails implements UserDetails {
    private String username;
    private String password;
    private String name;
    private String ipaddress;
    private List<String> roleList;
    private VerificationEntity verificationCode;

    public MyUserDetails(UserEntity user, List<String> authorities,VerificationEntity entity) {
        this.username=user.getUsername();
        this.password=user.getPassword();
        this.name=user.getUserrealname();
        this.ipaddress=user.getIpaddress();
        this.roleList=authorities;
        this.verificationCode=entity;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (roleList == null || roleList.size() < 1) {
            return AuthorityUtils.commaSeparatedStringToAuthorityList("");
        }
        StringBuilder roles = new StringBuilder("ROLE_");
        roles.append(StringUtils.join(roleList,'.'));
        List<GrantedAuthority> authorityList = AuthorityUtils.commaSeparatedStringToAuthorityList(roles.toString());
        return authorityList;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
