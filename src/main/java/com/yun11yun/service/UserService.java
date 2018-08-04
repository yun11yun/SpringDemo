package com.yun11yun.service;

import com.yun11yun.bean.User;
import com.yun11yun.util.SpringUtils;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {

    public User queryWithName(String name) {
        User user = (User) SpringUtils.getBean("user");
        if (Objects.equals(name, user.getName())) {
            return user;
        }
        return null;
    }

}
