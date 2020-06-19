package com.point.newPDF.security.config;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationDetailsSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsService authUserDetailsService;
    @Autowired
    private AuthenticationDetailsSource<HttpServletRequest, WebAuthenticationDetails> authenticationDetailsSource;
    @Bean
    AccessDeniedServletHandler accessDeniedServletHandler(){
        return new AccessDeniedServletHandler();
    };
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.exceptionHandling().accessDeniedHandler(accessDeniedServletHandler());
        http.authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers(
//                        "/css/**",
//                        "/fonts/**",
//                        "/js/**",
//                        "/login/**",
//                        "/403",
//                        "/getCurrentUserName"
//                ).permitAll() //默认不拦截静态资源的url pattern （2）
                .and().authorizeRequests().anyRequest().permitAll()//.authenticated()
                .and().headers().frameOptions().disable()
                .and().formLogin().loginPage("/login").authenticationDetailsSource(authenticationDetailsSource)// 登录url请求路径 (3)
                .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                                        Authentication authentication) throws IOException, ServletException {
                        response.setContentType("application/json;charset=utf-8");
                        RequestCache cache = new HttpSessionRequestCache();
                        SavedRequest savedRequest = cache.getRequest(request, response);
                        String url=null;
                        if (savedRequest!=null){
                             url= savedRequest.getRedirectUrl();
                        }
                        PrintWriter W=response.getWriter();
                        Map map=new HashMap();
                        map.put("url",url);
                        W.print(JSONObject.toJSONString(map));
                    }
                })
                .and() // 登录成功跳转路径url(4)
                .logout().logoutSuccessUrl("/").permitAll()
        .and().sessionManagement().invalidSessionUrl("/login");
    }

    @Bean
    public LoginAuthenticationProvider provider() {
        return new LoginAuthenticationProvider();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(authUserDetailsService); // （6）
        auth
                //添加自定义的认证管理类
                .authenticationProvider(provider());
    }

}