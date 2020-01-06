package com.spring.boot.learning.hateoas.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.spring.boot.learning.hateoas.dto.Customer;
import com.spring.boot.learning.hateoas.dto.Order;

@Service
public class OrderService {
	  private HashMap<String, Customer> customerMap;
	    private HashMap<String, Order> customerOneOrderMap;
	    private HashMap<String, Order> customerTwoOrderMap;
	    private HashMap<String, Order> customerThreeOrderMap;

	    public OrderService() {

	        customerMap = new HashMap<>();
	        customerOneOrderMap = new HashMap<>();
	        customerTwoOrderMap = new HashMap<>();
	        customerThreeOrderMap = new HashMap<>();

	        customerOneOrderMap.put("001A", new Order("001A", 150.00, "milk", 25));
	        customerOneOrderMap.put("002A", new Order("002A", 250.00, "sugar", 15));

	        customerTwoOrderMap.put("002B", new Order("002B", 550.00, "bread", 325));
	        customerTwoOrderMap.put("002B", new Order("002B", 450.00, "butter", 525));

	        final Customer customerOne = new Customer("10A", "samarth", "Oracle");
	        final Customer customerTwo = new Customer("20B", "saif", "accenture");
	        final Customer customerThree = new Customer("30C", "shakil", "accenture");

	        customerOne.setOrders(customerOneOrderMap);
	        customerTwo.setOrders(customerTwoOrderMap);
	        customerThree.setOrders(customerThreeOrderMap);
	        customerMap.put("10A", customerOne);
	        customerMap.put("20B", customerTwo);
	        customerMap.put("30C", customerThree);

	    }

	    public List<Order> getAllOrdersForCustomer(final String customerId) {
	        return new ArrayList<>(customerMap.get(customerId).getOrders().values());
	    }

	    public Order getOrderByIdForCustomer(final String customerId, final String orderId) {
	        final Map<String, Order> orders = customerMap.get(customerId).getOrders();
	        Order selectedOrder = orders.get(orderId);
	        return selectedOrder;
	    }

}
