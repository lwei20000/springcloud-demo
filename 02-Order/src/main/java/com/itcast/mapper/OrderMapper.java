package com.itcast.mapper;

import com.itcast.entity.Order;

public interface OrderMapper {
    Order selectOrderById(Integer id);
}