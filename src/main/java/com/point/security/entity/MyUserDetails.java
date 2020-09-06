package com.point.security.entity;

import com.point.newPDF.entity.UserEntity;
import com.point.newPDF.entity.VerificationEntity;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.thymeleaf.util.StringUtils;

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
    private Integer id;
    private Integer level;

    public MyUserDetails(UserEntity user, List<String> authorities,VerificationEntity entity) {
        this.username=user.getUsername();
        this.password=user.getPassword();
        this.name=user.getUserrealname();
        this.ipaddress=user.getIpaddress();
        this.roleList=authorities;
        this.verificationCode=entity;
        this.id = user.getId();
        this.level = user.getLevel();
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (roleList == null || roleList.size() < 1) {
            return AuthorityUtils.commaSeparatedStringToAuthorityList("");
        }
        String[] roles = new String[roleList.size()+1];
        for(int i = 0; i < roleList.size();i++) {
            roles[i] = "ROLE_" + roleList.get(i);
        }
        roles[roleList.size()] = "ROLE_"+name;
        List<GrantedAuthority> authorityList = AuthorityUtils.createAuthorityList(roles);

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

    public Integer getId() {
        return id;
    }

    public Integer getLevel() {
        return level;
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
