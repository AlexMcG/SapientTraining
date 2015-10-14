package com.sapient.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;


public class Customer {
	private Integer id;
	@NotEmpty
	private String name;
	@Range(min=18, max=60)
	private Integer age;
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}

	
	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return id + ":" + name + ":" + age + "]";
	}
}
