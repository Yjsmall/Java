package com.small.demo04;

import com.small.demo03.Rent;

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
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 生成得到代理类
     * @return
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
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
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(String msg){
        System.out.println("执行了" + msg + "方法");
    }

}
