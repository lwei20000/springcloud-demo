package com.itcast.client;

import com.itcast.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("PROD")
public interface ProdClient {

    @RequestMapping(value="/searchProd", method = RequestMethod.GET)
    String searchProd();

    @RequestMapping(value="/searchProd/{orderId}",method = RequestMethod.GET)
    Product searchProd(@PathVariable(value="orderId") Integer orderId);
}
