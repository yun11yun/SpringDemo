package com.yun11yun.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserTest {

    @Autowired
    private User user;

    @Test
    public void test() {
        assertEquals("15771701854", user.getPhone().getNumber());
    }

    @Test
    public void testOtherPhones() {
        assertEquals(1, user.getOtherPhones().size());
        assertEquals("18078576435", user.getOtherPhones().get(0).getNumber());
    }
}