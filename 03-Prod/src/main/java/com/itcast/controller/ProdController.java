package com.itcast.controller;

import com.itcast.entity.Product;
import com.itcast.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.PrivateKey;
import java.util.List;

@RestController
public class ProdController {

    @Autowired
    private ProductService productService;

    @GetMapping("/searchProd")
    public String searchOrder() {
        List<Product> productList =  productService.selectOrderById(1);
        return productList.toString();
    }

    @GetMapping("/searchProd/{orderId}")
    public Product searchOrder(@PathVariable Integer orderId) {
        return new Product();
    }
}
