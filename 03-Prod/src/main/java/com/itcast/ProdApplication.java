package com.itcast;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.itcast.mapper")  // mybatis的注解，作用是用于扫描mybatis的mapper接口
public class ProdApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProdApplication.class, args);
    }
}
