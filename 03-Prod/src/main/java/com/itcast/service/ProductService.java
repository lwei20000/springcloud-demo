package com.itcast.service;

import com.itcast.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> selectProducts(Integer id);
}
