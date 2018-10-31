package com.lz_java.core.service;

import com.lz_java.core.dao.UserDao;
import com.lz_java.core.model.User;
import com.lz_java.core.model.UserRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcDaoSupportUserService extends JdbcDaoSupport implements UserDao{
    @Override
    public User findUserById(int id) {
        String sql = "select * from user where id = ? ";

        User user = (User) getJdbcTemplate().queryForObject(sql, new Object[] {id}, new UserRowMapper());

        return user;
    }

    @Override
    public void insert(User user) {
        String sql = "insert into user (name,age) values(?, ?)";

        getJdbcTemplate().update(sql, new Object[] {user.getName(), user.getAge()});
    }
}
