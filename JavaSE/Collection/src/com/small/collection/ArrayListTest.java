package com.small.collection;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author smallYJ
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List list1 = new ArrayList();


        List list2 = new ArrayList(20);
        List link = new LinkedList();
        String a = "small";
        String b = a.substring(2);
        System.out.println(b);
    }

}
