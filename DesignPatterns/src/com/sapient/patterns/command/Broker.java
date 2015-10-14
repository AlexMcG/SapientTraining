package com.sapient.patterns.command;

import java.util.List;

public class Broker {
	List<Order> orders;
	
	void takeOrders(Order order){
		orders.add(order);
	}
	void placeOrder(){
		for (Order order: orders) {
			order.execute();
		}
		orders.clear();
	}
}
