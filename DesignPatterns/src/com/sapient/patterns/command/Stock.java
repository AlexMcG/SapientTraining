package com.sapient.patterns.command;

public class Stock {
	String name = "AlexStock";
	int quantity = 10;
	
	void buy() {
		System.out.println("Bought " + quantity + " stocks of " + name + ".");
	}
	
	void sell() {
		System.out.println("Sold " + quantity + " stocks of " + name + ".");
	}
}
