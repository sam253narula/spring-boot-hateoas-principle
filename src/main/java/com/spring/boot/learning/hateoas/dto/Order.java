package com.spring.boot.learning.hateoas.dto;

import org.springframework.hateoas.ResourceSupport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order extends ResourceSupport {
    private String orderId;
    private double price;
    private String productNamwe;
    private int quantity;

}
