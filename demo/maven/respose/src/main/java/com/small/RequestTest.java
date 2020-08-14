package com.small;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "request",urlPatterns = "/request")
public class RequestTest extends HttpServlet{
    /**
     *
     */
    private static final long serialVersionUID = -5438104446273110306L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username+":"+password);
        resp.sendRedirect("/resposea/success.jsp");

        
    }
    
}