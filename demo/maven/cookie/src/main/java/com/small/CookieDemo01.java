package com.small;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//保存用户上一次访问时间
@WebServlet(name = "cookie",urlPatterns = "/ck1")
public class CookieDemo01 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //服务器,告诉你,你来的时间,把这个时间封装未一个信件,你带,我就知道你来了

        req.setCharacterEncoding("utf-16");
        resp.setCharacterEncoding("utf-16");

        PrintWriter out = resp.getWriter();

        //Cookie,服务器端从客户端获取
        Cookie[] cookies = req.getCookies();

        //判断cookie是否为空
        if (cookies != null) {
            out.write("你上一次访问的时间是:");

            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("lastLoginTime")) {
                   //获取cookie的值 
                   long lastLoginTime = Long.parseLong(cookie.getValue());
                   Date date = new Date(lastLoginTime);
                   out.write(date.toLocaleString());
                }
            }

        } else{
            out.write("这是你第一来");
        }

        //服务器客户端响应一个cookie
        Cookie cookie = new Cookie("lastLoginTime", System.currentTimeMillis()+"");

        //cookie有效期为一天
        cookie.setMaxAge(24*60*60);

        resp.addCookie(cookie);


    }

    /**
     *
     */
    private static final long serialVersionUID = 5921047587852822070L;
    
}