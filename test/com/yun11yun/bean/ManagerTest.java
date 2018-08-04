package com.yun11yun.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ManagerTest {

    @Autowired
    private Manager manager;

    @Test
    public void testInitialize() {
        assertNotNull("The Manager's bean should not be null.", manager);
        assertNull("The name property of the Manager's bean should be null",manager.getName());
    }
}