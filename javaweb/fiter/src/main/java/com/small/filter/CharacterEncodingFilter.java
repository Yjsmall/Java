package com.small.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author smallYJ
 */
public class CharacterEncodingFilter implements Filter {
   @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("初始化成功");
    }

    /**
     * 1. 顾虑中的所有代码,过滤特定请求的时候都会执行
     * 2. 必须让过滤器继续同行
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=UTF-8");

        System.out.println("CharacterEncodingFilter执行前");

        //让我们过滤器继续走,不写这里就会被拦截
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("执行后");

    }

    @Override
    public void destroy() {
        System.out.println("销毁成功");

    }
}
