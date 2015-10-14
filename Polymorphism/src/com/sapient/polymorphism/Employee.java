package com.sapient.polymorphism;

abstract class Employee{
	public abstract void netSalary();
}

class Intern extends Employee{
	public void netSalary(){
		System.out.println("Intern's Stipend");
	}
}

class Confirmed extends Employee{
	public void netSalary(){
		System.out.println("Confirmed Employee's Salary");
	}
	public void transport(){
		System.out.println("Transport confirmed.");
	}
}

class Contract extends Employee {
	public void netSalary() {
		System.out.println("Contract Employee's Salary");
	}
}
