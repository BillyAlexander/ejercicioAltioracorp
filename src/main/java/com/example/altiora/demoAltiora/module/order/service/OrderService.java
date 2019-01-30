package com.example.altiora.demoAltiora.module.order.service;

import java.util.List;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.altiora.demoAltiora.module.order.entity.Order;
import com.example.altiora.demoAltiora.module.order.repository.OrderRepo;
import com.example.altiora.demoAltiora.util.base.entity.BaseService;

@Service
public class OrderService extends BaseService<Order> {
	public OrderService() {
		super(Order.class);
	}

	@Autowired
	private OrderRepo orderRepo;
	
	public List<Order> getAll() {
		List<Order> orders = orderRepo.findAll();
		return orders;
	}
	
	public Order save(Order newOrder) {
		Order order = orderRepo.save(newOrder);
		return order;
	}
	
	public void deleteLogicById(int id) throws ServletException {
		Order order = orderRepo.getOne(id);
		if(order != null) {
			order = changeStatus(order);
		}
	}
}
