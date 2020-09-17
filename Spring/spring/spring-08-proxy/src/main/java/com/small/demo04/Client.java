package com.small.demo04;

import com.small.demo02.UserService;
import com.small.demo02.UserServiceImpl;

/**
 * @author smallYJ
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();

        proxy.delete();
    }
}
