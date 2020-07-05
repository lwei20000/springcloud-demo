package com.itcast.controller;

import com.itcast.entity.Prod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdController {

    @GetMapping("/searchProd")
    public String searchOrder() {
        return "/searchProd";
    }

    @GetMapping("/searchProd/{orderId}")
    public Prod searchOrder(@PathVariable Integer orderId) {
        return new Prod();
    }
}
