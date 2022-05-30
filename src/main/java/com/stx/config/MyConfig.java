package com.stx.config;

import com.stx.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

//配置类==配置文件
@Configuration//告诉spring这是一个配置类
@ComponentScan(value = "com.stx",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
})
public class MyConfig {
    @Bean("hello")//给容器中注册一个bean，类型：默认返回值类型，id默认方法名
    public User user(){
        return new User(23,"牛");
    }
    String name ="li";
}
