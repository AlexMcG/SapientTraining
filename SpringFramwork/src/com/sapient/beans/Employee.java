package com.sapient.beans;

import java.util.Map;

public class Employee {
	int id;
	String name;
	private Map address;
	
	public Employee() {}
	
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
		
	}
	public Map getAddress() {
		return address;
	}
	public void setAddress(Map address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return name;
	}
}
