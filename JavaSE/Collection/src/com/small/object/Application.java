package com.small.object;

/**
 * @author smallYJ
 */
public class Application {
    public static void main(String[] args) {

        //Student :自己 && 继承父类
        Student s1 = new Student();
        s1.run();
        s1.name();

        //Person 可以指向子类,但是不能调用子类独有方法
        Person s2 = new Student();
        s2.run();
        s2.eat();
        ((Student) s2).name();
    }
}
