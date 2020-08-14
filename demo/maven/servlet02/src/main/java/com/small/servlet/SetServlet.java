package com.small.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetServlet extends HttpServlet{
    /**
     *
     */
    private static final long serialVersionUID = 3993230651542118104L;

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        final ServletContext context = this.getServletContext();

        context.setAttribute("username", "名字");
    }
    
}