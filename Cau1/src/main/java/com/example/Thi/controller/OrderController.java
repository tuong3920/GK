package com.example.Thi.controller;

import com.example.Thi.entity.Order;
import com.example.Thi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.util.List;

@RestController
@RequestMapping("/")
public class OrderController {

	@Autowired
	private OrderService orderService;


	@RequestMapping(value = "/Order", method = RequestMethod.POST, produces = {
			org.springframework.http.MediaType.APPLICATION_JSON_VALUE,
			org.springframework.http.MediaType.APPLICATION_ATOM_XML_VALUE })
	@ResponseBody
	public Order addOrder(@RequestBody Order orderForm) {
		return orderService.addOrder(orderForm);
	}


    
}
