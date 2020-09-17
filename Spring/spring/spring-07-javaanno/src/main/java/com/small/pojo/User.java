package com.small.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author smallYJ
 * @component 这个注解,说明把这个类
 */
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("smallYJ")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

