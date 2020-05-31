package com.point.newPDF.security.config;


import java.nio.file.AccessDeniedException;

public class LoginAuthenticationException extends AccessDeniedException {

    public LoginAuthenticationException(String msg) {
        super(msg);
    }

    public LoginAuthenticationException(LoginError error) {
        super(error.errStr,null,error.id+"");
    }
}
