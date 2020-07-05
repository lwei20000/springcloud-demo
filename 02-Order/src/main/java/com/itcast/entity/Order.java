package com.itcast.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Integer id;

    private String orderNumber;

    public Integer getId() {
        return id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
