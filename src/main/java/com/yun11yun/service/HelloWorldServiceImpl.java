package com.yun11yun.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService  {

    public void print() {
        System.out.println("hello, ssh!");
    }
}
