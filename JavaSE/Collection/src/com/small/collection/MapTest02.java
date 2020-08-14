package com.small.collection;

import java.util.*;

/**
 * @author smallYJ
 */
public class MapTest02 {
    public static void main(String[] args) {
        //First: 获取所有的key,通过遍历key,来遍历value
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"zhaoliu");


        //遍历Map集合
        //获取所有的key,是一集合
        Set<Integer> keys = map.keySet();

        //迭代器
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            //取出一个key
            Integer key = it.next();
            //通过key获取value
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        //foreach
        for (Integer key : keys){
            System.out.println(key + "=" + map.get(key));
        }


        //第二种方式:Set<Map.Entry<K,V>> entrySet();
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it2 = set.iterator();
        while (it2.hasNext()){
            Map.Entry<Integer, String> entry = it2.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        for (Map.Entry<Integer,String> node : set){
            System.out.println(node.getKey()+"="+node.getValue());
        }

    }
}
