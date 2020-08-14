package com.small.factory.abstract1;

/**
 * @author smallYJ
 */
public class XiaomiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("小米路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("小米路由器");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器");
    }
}
