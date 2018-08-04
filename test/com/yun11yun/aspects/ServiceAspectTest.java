package com.yun11yun.aspects;

import com.yun11yun.service.HelloWorldService;
import com.yun11yun.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ServiceAspectTest {

    @Autowired
    private HelloWorldService helloWorldService;

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        assertNotNull(helloWorldService);
        helloWorldService.print();
    }

    @Test
    public void testSaveMethod() {
        assertNotNull(helloWorldService);
        helloWorldService.save(null);
    }

    @Test
    public void testAfterReturningSaveMethod() {
        assertNotNull(helloWorldService);
        helloWorldService.save("some");
    }

    @Test
    public void testAround() {
        assertNotNull(userService);
        userService.queryWithName("wentao");
    }
}