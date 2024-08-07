package com.order.com.order.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.order.com.order.model.Order;

@RestController
@RequestMapping("/order")
public class OrderRestController {

	@GetMapping("/get")
	public List<Order> getAllOrder(){
		List<Order> orderList = Arrays.asList(new Order(1l, "peanuts", 100d), new Order(2l,"buttermilk",20d));
		return orderList;
	}
	
}
