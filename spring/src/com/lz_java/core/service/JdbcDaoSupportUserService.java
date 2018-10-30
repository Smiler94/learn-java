package com.lz_java.core.service;

import com.lz_java.core.dao.UserDao;
import com.lz_java.core.model.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcDaoSupportUserService extends JdbcDaoSupport implements UserDao{
    @Override
    public User findUserById(int id) {
        return null;
    }

    @Override
    public void insert(User user) {
        String sql = "insert into user (name,age) values(?, ?)";

        getJdbcTemplate().update(sql, new Object[] {user.getName(), user.getAge()});
    }
}
