package com.spring.boot.learning.hateoas.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.learning.hateoas.dto.Customer;

@Service
public class CustomerService {

    private HashMap<String, Customer> customerMap;

    public CustomerService() {

        customerMap = new HashMap<>();

        final Customer customerOne = new Customer("10A", "samarth", "Oracle");
        final Customer customerTwo = new Customer("20B", "saif", "accenture");
        final Customer customerThree = new Customer("30C", "shakil", "accenture");

        customerMap.put("10A", customerOne);
        customerMap.put("20B", customerTwo);
        customerMap.put("30C", customerThree);

    }

    public List<Customer> allCustomers() {
        return new ArrayList<>(customerMap.values());
    }

    public Customer getCustomerDetail(final String customerId) {
        return customerMap.get(customerId);
    }

}
