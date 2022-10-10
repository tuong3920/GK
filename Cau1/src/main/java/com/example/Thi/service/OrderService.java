package com.example.Thi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Thi.DAO.OrderDAO;
import com.example.Thi.entity.Order;

@Service
public class OrderService {
	@Autowired
	private OrderDAO orderDAO;
	
	public Order addOrder(Order orderForm) {
		return orderDAO.addEmployee(orderForm);
	}
}
