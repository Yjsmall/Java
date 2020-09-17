package com.small.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 自动生生代理类
 * @author smallYJ
 */
public class ProxyInvocationHandler implements InvocationHandler {
    /**
     * 被代理的接口
     */
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    /**
     * 生成得到代理类
     * @return
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(),this);
    }

    /**
     * 处理代理实例,并返回结果
     * @param proxy
     * @param method
     * @param args
     * @return 处理代理实例,并返回结果
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质,就是反射机制实现
        seeHouse();
        Object result = method.invoke(rent, args);
        fee();
        return result;
    }

    public void seeHouse(){
        System.out.println("中介带人去看房字");
    }

    public void fee(){
        System.out.println("收中介费");
    }


}
