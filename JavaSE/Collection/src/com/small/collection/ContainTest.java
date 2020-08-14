package com.small.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.StringTokenizer;

/**
 * @author smallYJ
 */
public class ContainTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        User u1 = new User("小明");
        User u2 = new User("小明");

        c.add(u1);
        boolean contains = c.contains(u2);
        System.out.println(contains);

        String s1 = new String("张三");
        String s2 = new String("张三");

        c.add(s1);
        System.out.println(c.contains(s2));

        System.out.println("是否删除成功:"  + c.remove(u1) + "是否包含s2:" + c.contains(u2));
    }
}

class User{
    private String name;

    public User() {
    }
    public User(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name);
    }
}
