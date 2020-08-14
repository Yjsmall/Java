package com.small.listenner;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author smallYJ
 */
public class OnlineCountListener implements HttpSessionListener {
    /**
     * 创建session监听;
     * 一旦创建session就会触发这个事件
     * @param httpSessionEvent
     */
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        ServletContext ctx = httpSessionEvent.getSession().getServletContext();
        Integer onlineCount = (Integer) ctx.getAttribute("OnlineCount");

        if (onlineCount == null){
            onlineCount = new Integer(1);
        } else {
            int count = onlineCount.intValue();

            onlineCount = new Integer(count + 1);
        }

        ctx.setAttribute("OnlineCount",onlineCount);


    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        ServletContext ctx = httpSessionEvent.getSession().getServletContext();

        System.out.println(httpSessionEvent.getSession().getId());

        Integer onlineCount = (Integer) ctx.getAttribute("OnlineCount");

        if (onlineCount == null){
            onlineCount = new Integer(1);
        } else {
            int count = onlineCount.intValue();

            onlineCount = new Integer(count - 1);
        }

        ctx.setAttribute("OnlineCount",onlineCount);

        /**
         * Session销毁
         * 手动 getSession().invalidate
         * 自动 web.xml
         *
         */
    }
}
