package com.spring.boot.learning.hateoas.dto;

import java.util.Map;

import org.springframework.hateoas.ResourceSupport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer extends ResourceSupport {
	    private String customerId;
	    private String customerName;
	    private String companyName;
	    private Map<String, Order> orders;
	    public Customer(final String customerId, final String customerName, final String companyName) {
	        super();
	        this.customerId = customerId;
	        this.customerName = customerName;
	        this.companyName = companyName;
	    }
}
