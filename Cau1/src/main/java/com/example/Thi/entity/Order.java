package com.example.Thi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "OrderDB")
public class Order {
	private Integer OrderId;
	private String Name;
	private double Price;
	public Order() {
	}
	public Order(int orderId, String name, double price) {
		OrderId = orderId;
		Name = name;
		Price = price;
	}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderId",unique = true,nullable = false)
    public Integer getOrderId() {
    	return OrderId;
    }
	public void setOrderId(Integer orderId) {
		OrderId = orderId;
	}
	@Column(name = "Name",unique = true,nullable = false,length = 255)
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Column(name = "Price",unique = true,nullable = false)
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	
	
	
    
}
