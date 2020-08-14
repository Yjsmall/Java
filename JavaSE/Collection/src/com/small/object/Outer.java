package com.small.object;

/**
 * @author smallYJ
 */
public class Outer {
    private int id = 10;
    void out(){
        System.out.println("Outer外部类方法");
    }

    public class Inner{
        public void in(){
            System.out.println("Inner内部类");
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.in();
    }
}
