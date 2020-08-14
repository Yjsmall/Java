package com.small;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "se",urlPatterns = "/se02")
public class Session02 extends HttpServlet{
    /**
     *
     */
    private static final long serialVersionUID = 4554552066510594764L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=uft-8");

        HttpSession session = req.getSession();

        String name = (String)session.getAttribute("name");
        System.out.println(name);
        
    }
    
}