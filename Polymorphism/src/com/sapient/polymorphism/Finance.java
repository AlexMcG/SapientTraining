package com.sapient.polymorphism;

class Finance{
	public void processSalary(Employee employee) {
		employee.netSalary();
		if (employee instanceof Confirmed) {
			Confirmed conf = (Confirmed) employee; //Downcast
			conf.transport();
		}
	}
}