package com.small.factory.abstract1;

public class XiaomiIphone implements IphoneProduct{
    @Override
    public void start() {
        System.out.println("小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米手机");
    }

    @Override
    public void callup() {
        System.out.println("小米手机");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米手机");
    }
}
