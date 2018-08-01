package com.yun11yun.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MyServiceTest {

    @Autowired
    private MyService myService;

    @Test
    public void printName() {
        myService.printName();
    }

    @Test
    public void printURL() {
    }

    @Test
    public void printThrowException() {
    }
}