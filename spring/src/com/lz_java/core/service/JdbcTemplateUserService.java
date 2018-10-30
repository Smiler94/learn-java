package com.lz_java.core.service;

import com.lz_java.core.dao.UserDao;
import com.lz_java.core.model.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcTemplateUserService implements UserDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void insert(User user) {
        String sql = "insert into user(name,age) values (?,?)";

        jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(sql, new Object[] { user.getName(), user.getAge()});
    }

    @Override
    public User findUserById(int id) {
        return null;
    }
}
