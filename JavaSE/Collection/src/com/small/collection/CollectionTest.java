package com.small.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author smallYJ
 */
public class CollectionTest{
    public static void main(String[] args) {
        Collection c = new ArrayList();

        //自动装箱
        c.add(1200);
        c.add(3.14);
        c.add(true);
        c.add(new Object());

        //获取元素的个数
        System.out.println("元素的个数是" + c.size());

        //清空集合
        c.clear();
        System.out.println("元素的个数是" + c.size());

        c.add("hello");
        c.add("world");
        c.add(1);

        //判断当前元素是否包含
        boolean flag = c.contains("hello");
        System.out.println(flag);

        //删除元素
        System.out.println("删除元素是否成功:" + c.remove(0));
        System.out.println("删除元素是否成功:" + c.remove("hello"));
        System.out.println("元素的个数是" + c.size());

        //判断集合元素是否为空
        System.out.println(c.isEmpty());

        //转换成数组
        for (Object ob : c.toArray()) {
            System.out.print(ob+" ");
        }
    }
}
