package com.lz_java.mapper;

import com.lz_java.entity.Order;
import com.lz_java.entity.User;

import java.util.List;

public interface UserMapper {
    public User getUserById(int id);
    public List<Order> getUserOrders(int user_id);
}
