package com.small.pojo;

/**
 * @author smallYJ
 */
public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT被创建了");
    }

    public void show(){
        System.out.println("name:" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
