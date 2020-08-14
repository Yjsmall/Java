package com.small.object;

/**
 * @author smallYJ
 */
public class Static01 {
    static {
        System.out.println("0. 静态代码块");
        System.out.println("-----------");
    }

    {
        System.out.println("1.匿名代码块");
    }

    public Static01() {
        System.out.println("2.构造方法");
    }

    public static void main(String[] args) {
        Static01 static01 = new Static01();
        System.out.println("-----------");
        Static01 static02 = new Static01();
    }
}
