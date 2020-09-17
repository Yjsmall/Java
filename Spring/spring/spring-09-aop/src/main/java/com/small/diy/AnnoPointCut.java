package com.small.diy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author smallYJ
 */
@Aspect
public class AnnoPointCut {
    @Before("execution(* com.small.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("before");
    }
}
