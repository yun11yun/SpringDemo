package com.yun11yun.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public void save() {
        System.out.println("user save()");
    }

    public void queryById(String id) {
        System.out.println("UserDao's queryById is run");
    }

}
