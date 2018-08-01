package com.yun11yun.test;

import com.yun11yun.util.SpringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class FactoryMethodComponentTest {

    @Test
    public void doWork() {
        TestBean testBean = (TestBean) SpringUtils.getBean("testBean");
        assertNotNull(testBean);
        assertEquals("test", testBean.getName());
    }
}