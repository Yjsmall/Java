package com.small;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "redirect",urlPatterns = "/red")
public class RedirectServlet extends HttpServlet{
    /**
     *
     */
    private static final long serialVersionUID = -7159649971455480918L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 重定向相当于两个步骤
         * resp.setHeader("location","/respose/image");
         * resp.setStatus(302);
         */
        resp.sendRedirect("/respose/image");
        
    }
    
}