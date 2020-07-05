package com.itcast.controller;

import com.itcast.client.ProdClient;
import com.itcast.entity.Order;
import com.itcast.entity.Product;
import com.itcast.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private ProdClient prodClient;

    @Autowired
    private OrderService orderService;

    @GetMapping("/searchOrder")
    public String searchOrder() {

        // 查询order
        Order order = orderService.selectOrderById(1);

        // 调用product服务
        Product product = prodClient.searchProd(11);

        return "/searchOrder"+product.toString();
    }
}
