package com.itcast.client;

import com.itcast.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@FeignClient("PROD")
public interface ProdClient {
    @RequestMapping(value="/searchProd/{orderId}",method = RequestMethod.GET)
    public List<Product> searchProd(@PathVariable Integer orderId);
}
