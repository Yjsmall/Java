package com.small.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author smallYJ
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("abc");
        c.add("def");
        c.add(100);

        Iterator it = c.iterator();
        while (it.hasNext()){
            Object o = it.next();
            it.remove();
            System.out.println(o);
        }

        System.out.println(c.size());
    }

    /**
     * @author smallYJ
     * 1.
     */
    public static class FileInputStreamTest01 {
    }
}
