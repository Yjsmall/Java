package com.small.object;

/**
 * @author smallYJ
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        USB iphone = new Iphone();
        iphone.read();
        iphone.write();
        System.out.println(USB.a);

    }
}

interface USB{
    int a = 100;
    /**
     * 读取内容
     */
    void read();

    /**
     * 写入内容
     */
    void write();
}

class Iphone implements USB{
    @Override
    public void read() {
        System.out.println("这是手机的读取口:USB");
    }

    @Override
    public void write() {
        System.out.println("这是手机的写入口");
    }
}
