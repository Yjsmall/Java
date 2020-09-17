package com.small.demo01;

/**
 * @author smallYJ
 */
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东要出租房子了!");
    }
}
