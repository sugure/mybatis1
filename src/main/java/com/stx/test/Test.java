package com.stx.test;

import com.stx.config.MyConfig;
import com.stx.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        //配置文件改配置类
        //类型获取
ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        User bean = (User) applicationContext.getBean(User.class);
        System.out.println(bean);
        //获取方法名，bean中可以定方法名的值。
        String[] beanNamesForType = applicationContext.getBeanNamesForType(User.class);
        for (String name:beanNamesForType) {
            System.out.println(name);
        }
    }

}
