package com.itcast.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itcast.entity.Product;
import com.itcast.service.ProductService;

@RestController
public class ProdController {

    @Autowired
    private ProductService productService;

    @GetMapping("/searchProd")
    public String searchProd() {
        List<Product> productList =  productService.selectProducts(1);
        return productList.toString();
    }

    @GetMapping("/searchProd/{orderId}")
    public Product searchProd(@PathVariable Integer orderId) {
    	  List<Product> productList =  productService.selectProducts(1);
    	  if(productList==null ||  productList.size()==0) {
    		  return new Product();
    	  }
    	  return productList.get(0);
    }
}
