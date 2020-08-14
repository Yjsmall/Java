package com.small.factory.method;

/**
 * @author smallYJ
 */
public class WuLingFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
