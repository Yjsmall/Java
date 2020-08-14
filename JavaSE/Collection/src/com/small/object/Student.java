package com.small.object;

/**
 * @author smallYJ
 */
public class Student extends Person{
    @Override
    public void run() {
        System.out.println("子类---run");
    }

    public void name(){
        System.out.println("My name is Student");
    }
}
