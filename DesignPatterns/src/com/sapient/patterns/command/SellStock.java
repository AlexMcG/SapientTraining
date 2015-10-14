package com.sapient.patterns.command;

public class SellStock implements Order{
	Stock stock;
	
	SellStock(Stock stock) {
		this.stock = stock;
	}
	public void execute(){
		this.stock.sell();
	}
}
