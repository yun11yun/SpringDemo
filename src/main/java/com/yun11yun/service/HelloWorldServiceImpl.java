package com.yun11yun.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService  {

    public void print() {
        System.out.println("hello, ssh!");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("private method in helloworldService classs");
    }

    public boolean save(String param) {
        if (param == null) {
            return false;
        }

        System.out.println("helloworld save method is running");
        return true;

    }
}
