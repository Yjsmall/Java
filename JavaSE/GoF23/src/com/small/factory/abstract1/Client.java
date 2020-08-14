package com.small.factory.abstract1;

/**
 * @author smallYJ
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("小米系列产品");
        //小米工厂

        XiaomiFactory xiaomifactory = new XiaomiFactory();
        IphoneProduct iphoneProduct = xiaomifactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendSMS();
    }
}
