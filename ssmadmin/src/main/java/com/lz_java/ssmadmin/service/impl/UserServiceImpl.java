package com.lz_java.ssmadmin.service.impl;

import com.lz_java.ssmadmin.dao.UserDao;
import com.lz_java.ssmadmin.entity.User;
import com.lz_java.ssmadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    public User login(User user) {
        return userDao.login(user);
    }
}
