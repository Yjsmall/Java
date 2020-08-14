package com.small.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author smallYJ
 */
public class ListTest {
    public static void main(String[] args) {
        List l = new ArrayList();

        //添加元素,默认向末尾添加,索引从0开始
        for (int i=0; i < 5; i++){
            l.add(i);
        }

        l.add(1,"small");
        l.add(4,"small");

        Iterator it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-------");

        //通过下标返回元素
        for (int i = 0; i < l.size(); i++) {
            Object o = l.get(i);
            System.out.println(o);
        }
        System.out.println("------");

        //获取元素第一次出现的索引
        System.out.println(l.indexOf(1));

        //获取元素最后一次出现的索引
        System.out.println(l.lastIndexOf("small"));

        //通过下标修改值
        l.set(4,"Second");

        //通过下标删除
        l.remove(4);
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i)+" ");
        }
    }
}
