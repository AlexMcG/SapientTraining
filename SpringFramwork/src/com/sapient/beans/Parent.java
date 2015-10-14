package com.sapient.beans;

import java.util.Map;

public class Parent {
	private Map address;
	Child child;
	String name;
	String id;
	
	
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


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Child getChild() {
		return child;
	}


	public void setChild(Child child) {
		this.child = child;
	}


	public String toString() {
		return this.name;
	}
}
