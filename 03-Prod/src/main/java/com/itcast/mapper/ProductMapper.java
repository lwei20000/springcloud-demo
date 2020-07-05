package com.itcast.mapper;

import com.itcast.entity.Product;

import java.util.List;

public interface ProductMapper {
    List<Product> selectProducts(Integer orderId);
}
