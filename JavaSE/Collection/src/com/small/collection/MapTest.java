package com.small.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author smallYJ
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");

        //通过key获取value
        String value = map.get(2);
        System.out.println(value);

        //获取键值对的数量
        System.out.println("键值对的数量为" + map.size());

        //通过key删除k-v
        map.remove(2);
        System.out.println(map.size());

        //contains 方法底层都是调用equals,自定义要重写
        //判断包含某个key
        System.out.println(map.containsKey(4));

        //判断包含某个value
        System.out.println(map.containsValue("lisi"));

        //获取所有的value
        Collection<String> values = map.values();
        for (String v : values){
            System.out.print(v + " ");
        }

        //清空map集合
        map.clear();
        System.out.println(map.size());

        //判断是否为空
        System.out.println(map.isEmpty());
        
    }
}
