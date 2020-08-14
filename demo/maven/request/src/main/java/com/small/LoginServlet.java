package com.small;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "login",urlPatterns = "/login")
public class LoginServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //中文乱码问题
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        String pwd = req.getParameter("password");
        String[] hobby = req.getParameterValues("hobby");
        System.out.println("++++++++++");
        System.out.println(username);
        System.out.println(pwd);
        System.out.println(Arrays.toString(hobby));
        System.out.println("++++++++++");

        //通过请求转发
        //这里的 / 代表当前web应用
        req.getRequestDispatcher("/success.jsp").forward(req,resp);
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    /**
     *
     */
    private static final long serialVersionUID = -1184191100131679894L;
    
}