package com.itcast.controller;

import com.itcast.entity.Product;
import com.itcast.service.ProductService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProdController {

    @Autowired
    private ProductService productService;

    @GetMapping("/searchProd/{orderId}")
    public List<Product> searchProd(@PathVariable Integer orderId) {
        List<Product> productList = productService.selectProducts(orderId);
        return productList == null ? new ArrayList<Product>():productList;
    }
}
