package com.yun11yun.service;

import com.yun11yun.bean.Phone;
import com.yun11yun.dao.PhoneDao;

public class PhoneServerImpl implements PhoneService {

    private PhoneDao phoneDao;

    @Override
    public void save(Phone phone) {

    }

    public PhoneDao getPhoneDao() {
        return phoneDao;
    }

    public void setPhoneDao(PhoneDao phoneDao) {
        this.phoneDao = phoneDao;
    }
}
