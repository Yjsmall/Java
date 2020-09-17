package com.small.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.print.DocFlavor;

/**
 * @author smallYJ
 * @Component 组件
 * 相当于<bean id="user" class="com.small.pojo.User"/>
 */
@Component
@Scope("prototype")
public class User {
//    public String name = "smallY";
    @Value("smallYJ")
    public String name;
}
