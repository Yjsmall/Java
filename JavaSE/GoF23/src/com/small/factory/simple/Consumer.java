package com.small.factory.simple;

/**
 * @author smallYJ
 */
public class Consumer {
    public static void main(String[] args) {
        /**
         * 接口,所有的实现类!工厂
         * Car car1 = new WuLing();
         * Car car2 = new Tesla();
         * 不应该消费者去new(创建一个车),如果一个车要传入1k参数,消费者很麻烦
         * 告诉车工厂我要什么车,车工厂去管理内部细节
         */

        //使用工厂创建,不用管细节
        Car car1 = CarFactory.getCar("五菱");
        Car car2 = CarFactory.getCar("特斯拉");


        car1.name();
        car2.name();

    }
}
