package com.example.Thi.DAO;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.example.Thi.entity.Order;
import com.example.Thi.entity.Order;
public class OrderDAO {
	private static final Map<Integer, Order> empMap = new HashMap<Integer, Order>();
	static {
		initEmps();

	}
	private static void initEmps() {
		Order oder1 = new Order(1, "SP1", 100000);
		Order oder2 = new Order(2, "SP2", 200000);
		Order oder3 = new Order(3, "SP3", 300000);
		empMap.put(oder1.getOrderId(), oder1);
		empMap.put(oder2.getOrderId(), oder2);
		empMap.put(oder3.getOrderId(), oder3);
		
	}
	public Integer getMaxEmpID() {
		Set<Integer> keys = empMap.keySet();
		Integer max = 0;
		for (Integer key : keys) {
			if (key > max) {
				max = key;
			}
		}
		return max;
	}
	public Order addEmployee(Order orderForm) {
		Integer orderID = this.getMaxEmpID() + 1;
		orderForm.setOrderId(orderID);

		empMap.put(orderForm.getOrderId(), orderForm);
		return orderForm;
	}
}
