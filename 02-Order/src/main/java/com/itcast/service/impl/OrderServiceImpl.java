package com.itcast.service.impl;

import com.itcast.entity.Order;
import com.itcast.mapper.OrderMapper;
import com.itcast.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order selectOrderById(Integer id) {
        return orderMapper.selectOrderById(id);
    }
}
