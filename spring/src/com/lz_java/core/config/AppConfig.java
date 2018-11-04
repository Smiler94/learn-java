package com.lz_java.core.config;

import com.lz_java.core.service.JdbcDaoSupportUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {
    @Bean(name="userService")
    public JdbcDaoSupportUserService userService()
    {
        JdbcDaoSupportUserService jds = new JdbcDaoSupportUserService();

        jds.setDataSource(this.dataSource());
        return jds;
    }

    @Bean(name="dataSource")
    public DriverManagerDataSource dataSource()
    {
        DriverManagerDataSource dm = new DriverManagerDataSource();
        dm.setDriverClassName("com.mysql.jdbc.Driver");
        dm.setUrl("jdbc:mysql://localhost:3306/mybatis");
        dm.setUsername("root");
        dm.setPassword("root");

        return dm;
    }
}
