package com.example.altiora.demoAltiora.module.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.altiora.demoAltiora.module.order.entity.Order;
import com.example.altiora.demoAltiora.module.order.service.OrderService;
import com.example.altiora.demoAltiora.util.base.entity.BaseError;

@RestController
@RequestMapping(value = "order", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "getAll", method = RequestMethod.GET)
	public ResponseEntity<?> getAll() {
		List<Order> orders = orderService.getAll();
		return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ResponseEntity<?> saveAdminUser(@RequestBody Order newOrder) {
		try {			
			return new ResponseEntity<Order>(orderService.save(newOrder), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(new BaseError(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}

}
