package com.itcast.controller;

import com.itcast.client.ProdClient;
import com.itcast.entity.Order;
import com.itcast.entity.Product;
import com.itcast.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private ProdClient prodClient;

    @Autowired
    private OrderService orderService;

    @GetMapping("/searchOrder/{orderId}")
    public String searchOrder(@PathVariable Integer orderId) {

        // 本服务内方法的调用
        Order order = orderService.selectOrderById(orderId);

        // 其他服务方法的调用，通过feign
        List<Product> productList = prodClient.searchProd(order.getId());
        return order.toString() + productList.toString();
    }
}
