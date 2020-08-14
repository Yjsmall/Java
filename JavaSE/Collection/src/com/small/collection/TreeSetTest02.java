package com.small.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author smallYJ
 * 创建TreeSet集合,需要比较器
 * 放在TreeSet/TreeMap集合中的key部分元素要进行排序
 *
 * 第一种:放在集合中的元素实现java.lang.Comparable接口
 * 第二种:在构造TreeSet和TreeMap集合的时候给他传入一个比较器对象.
 * Comparable和Comparator怎么选择???
 *  当比较规则不会发生改变的时候,或者说当比较规则只有一个时候----Comparable接口
 *  比较规则有多个,并且需要多个比较规则之间频繁切换----Comparator接口
 *
 *  Comparator接口的设计符合OCP原则
 * 三种方式
 * Comparator:两种方式
 * Comparable:一种方式
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<Tortoise> tortoises = new TreeSet<>(new TortoiseComparator());

        tortoises.add(new Tortoise(1000));
        tortoises.add(new Tortoise(900));
        tortoises.add(new Tortoise(1230));

        for (Tortoise t : tortoises) {
            System.out.println(t);
        }

        //匿名内部类
        TreeSet<Tortoise> tortoises1 = new TreeSet<>(new Comparator<Tortoise>() {
            @Override
            public int compare(Tortoise t1, Tortoise t2) {
                return t1.getAge() - t2.getAge();
            }
        });
    }
}

class Tortoise {
    private int age;

    public Tortoise(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String s = "Tortoise{" +
                "age=" + age +
                '}';
        return s;
    }
}

class TortoiseComparator implements Comparator<Tortoise> {

    @Override
    public int compare(Tortoise tortoise, Tortoise t1) {
        return tortoise.getAge() - t1.getAge();
    }
}
