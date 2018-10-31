package com.lz_java.core.service;

import com.lz_java.core.dao.UserDao;
import com.lz_java.core.model.User;
import com.lz_java.core.model.UserRowMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class JdbcDaoSupportUserService extends JdbcDaoSupport implements UserDao{
    @Override
    public User findUserById(int id) {
        String sql = "select * from user where id = ? ";

        User user = (User) getJdbcTemplate().queryForObject(sql, new Object[] {id}, new UserRowMapper());

        return user;
    }

    @Override
    public User findUserById2(int id) {
        String sql = "select * from user where id = ? ";

        User user = (User) getJdbcTemplate().queryForObject(sql, new Object[] {id}, new BeanPropertyRowMapper(User.class));

        return user;
    }

    @Override
    public void insert(User user) {
        String sql = "insert into user (name,age) values(?, ?)";

        getJdbcTemplate().update(sql, new Object[] {user.getName(), user.getAge()});
    }

    public List<User> findAll() {
        String sql = "select * from user";

        List<User> users = getJdbcTemplate().query(sql, new BeanPropertyRowMapper<>(User.class));
        return users;
    }

    public String findNameById(int id) {
        String sql = "select name from user where id = ?";

        String name = getJdbcTemplate().queryForObject(sql, new Object[] {id}, String.class);

        return name;
    }
}
