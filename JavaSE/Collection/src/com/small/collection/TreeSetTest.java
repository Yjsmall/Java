package com.small.collection;

import java.util.TreeSet;

/**
 * @author smallYJ
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("wangwu");
        ts.add("zhaoliu");

        for (String s : ts){
            //按照字典顺序,升序
            System.out.println(s);
        }

        Person p1 = new Person("Java",32);
        Person p2 = new Person("C",30);
        Person p3 = new Person("C++",12);
        Person p4 = new Person("python",40);
        Person p5 = new Person("你好",40);

        //ClassCastException
        TreeSet<Person> people = new TreeSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        for (Person p : people){
            System.out.println(p);
        }
    }
}
class Person implements Comparable<Person>{
    private int age;
    private String name;

    public Person(){
    }

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 需要这个方法编写比价逻辑,或者比较规则,按照什么比较!
     * @param person
     * @return 正数 负数 0
     * c1.compareTo(c2)
     * this--->c1
     * person--->c2
     */
    @Override
    public int compareTo(Person person) {
        if (this.age == person.age){
            //年龄相同,安装名字升序排列
            //String 已经继承接口,重写了方法
            return this.name.compareTo(person.name);
        } else {
            return this.age - person.age;
        }
    }

    @Override
    public String
    toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
