package com.small.pojo;

/**
 * @author smallYJ
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }

    public void show(){
        System.out.println("Hello,"+ str);
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + str + '\'' +
                '}';
    }
}
