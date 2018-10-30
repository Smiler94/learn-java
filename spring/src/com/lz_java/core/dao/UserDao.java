package com.lz_java.core.dao;

import com.lz_java.core.model.User;

public interface UserDao {
    public void insert(User user);

    public User findUserById(int id);
}
