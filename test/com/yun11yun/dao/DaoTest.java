package com.yun11yun.dao;

import com.yun11yun.bean.Phone;
import com.yun11yun.util.SpringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class DaoTest {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PhoneDao phoneDao;

    @Test
    public void testSaveAOP() {
        userDao.save();

        Phone phone = SpringUtils.getBean("phone", Phone.class);
        phoneDao.save(phone);
    }

    @Test
    public void testQueryMethod() {
        userDao.queryById("123");
    }
}