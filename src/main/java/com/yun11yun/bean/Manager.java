package com.yun11yun.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

@Repository("manager")
@Scope(value = "prototype") // 设置作用范围
public class Manager implements Human {

    @Value("manager")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void say() {
        System.out.println("画大饼!");
    }
}
