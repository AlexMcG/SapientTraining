package com.sapient.polymorphism;

public class MainApp {
	public static void main(String[] args){
		Finance finance = new Finance();
		
		Employee employee = HR.recruit("C"); //Upcast
		if(employee != null) {
			finance.processSalary(employee);
		} 
		if(employee != null) {
			finance.processSalary(employee);
		}
	}
}
