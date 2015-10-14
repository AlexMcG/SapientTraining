package com.sapient.patterns.command;

public class MainApp {
	public static void main(String[] args) {
		Stock stock = new Stock();
		
		BuyStock buyStockOrder = new BuyStock(stock);
		SellStock sellStockOrder = new SellStock(stock);
		
		Broker broker = new Broker();
		broker.takeOrders(buyStockOrder);
		broker.takeOrders(sellStockOrder);
		
		broker.placeOrder();
	}
}
