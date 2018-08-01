package com.yun11yun.dao;

import com.yun11yun.bean.Phone;
import org.springframework.stereotype.Repository;

@Repository("phoneDao")
public class PhoneDao {

    public void save(Phone phone) {
        System.out.println(phone.getNumber());
    }
}
