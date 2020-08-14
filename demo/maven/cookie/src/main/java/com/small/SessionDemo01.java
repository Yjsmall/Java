package com.small;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet(name = "session",urlPatterns = "se01")
public class SessionDemo01 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=uft-8");

        //得到session
        HttpSession session = req.getSession();

        //给session存东西
        session.setAttribute("name", "小YJ");

        //获取session的ID
        String id = session.getId();

        //判断session存在
        if (session.isNew()) {
            resp.getWriter().write("session创建成功,Id:"+id);
        }else{
            resp.getWriter().write("session在服务器存在了id:"+id);
        }

        //session创建做了什么事情
        

    }

    /**
     *
     */
    private static final long serialVersionUID = 3793340035130658343L;
    
}