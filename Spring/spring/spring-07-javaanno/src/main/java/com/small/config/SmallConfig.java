package com.small.config;

import com.small.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author smallYJ
 * 这个也会Spring容器托管,注册到容器中,因为他本事就是一个@Component
 * @Configuration 代表这是一个配置类,就和之前beans.xml
 */
@Configuration
@ComponentScan("com.small.pojo")
@Import(Config2.class)
public class SmallConfig {

    /**
     * 注册一个bean,就相当于之前bean标签
     * 方法名字----bean文件中的id
     * 返回值----bean标签中的class
     * @return 就是返回注入bean的对象!
     */
    @Bean
    public User getUser(){
        return new User();
    }
}
