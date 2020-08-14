package com.small.factory.method;

import com.small.factory.simple.CarFactory;

/**
 * @author smallYJ
 * 如果增加一个车,就要添加一个 大众车和一个大众工厂
 */
public class Consumer {
    public static void main(String[] args) {
        Car car = new WuLingFactory().getCar();
        Car car1 = new TeslaFactory().getCar();

        car.name();
        car1.name();

    }
}
