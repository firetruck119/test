package com.point.newPDF.security.config;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AccessDeniedServletHandler implements AccessDeniedHandler {

    private static final String DEF_ERROR_PAGE_PATH="/403";

    @Override

    public void handle(HttpServletRequest request, HttpServletResponse response,

                       AccessDeniedException accessDeniedException) throws IOException, ServletException {

        response.sendRedirect(DEF_ERROR_PAGE_PATH);

    }

}