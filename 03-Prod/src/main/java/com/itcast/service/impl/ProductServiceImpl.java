package com.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itcast.entity.Product;
import com.itcast.mapper.ProductMapper;
import com.itcast.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public  List<Product> selectProducts(Integer id) {
        return productMapper.selectProducts(id);
    }
}
