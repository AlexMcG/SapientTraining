package com.sapient.patterns.command;

public class BuyStock implements Order {
	Stock stock;
	
	BuyStock(Stock stock){
		this.stock = stock;
	}
	public void execute(){
		this.stock.buy();
	}
}
