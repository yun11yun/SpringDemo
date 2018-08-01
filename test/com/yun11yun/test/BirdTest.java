package com.yun11yun.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BirdTest {

    @Autowired
    private Bird bird;

    @Test
    public void test() {
        assertNotNull(bird);
        assertEquals("animal", bird.getName());
    }
}