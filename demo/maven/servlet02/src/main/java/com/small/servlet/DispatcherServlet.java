package com.small.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "demo",urlPatterns = "/demo04")
public class DispatcherServlet extends HttpServlet{
    /**
     *
     */
    private static final long serialVersionUID = -5957657635931834904L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入demo04文件");
        ServletContext context = this.getServletContext();//转发的请求路径
        RequestDispatcher requestDispatcher = context.getRequestDispatcher("/gp");//调用forward实现请求转发
        requestDispatcher.forward(req, resp);

    }
        
    
}