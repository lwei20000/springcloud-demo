package com.itcast.service;

import com.itcast.entity.Order;

public interface OrderService {

    Order selectOrderById(Integer id);
}
