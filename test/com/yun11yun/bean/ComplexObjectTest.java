package com.yun11yun.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ComplexObjectTest {

    @Autowired
    private ComplexObject child;

    @Test
    public void test() {
        assertEquals("administrator@example.com", child.getAdminEmails().getProperty("administrator"));
        assertEquals("sales@example.com", child.getAdminEmails().getProperty("sales"));
        assertEquals("support@example.co.uk", child.getAdminEmails().getProperty("support"));
    }
}