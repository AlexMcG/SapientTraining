package com.sapient.polymorphism;

class HR{
	public static Employee recruit(String empType){
		if(empType.equals("I")){
			return new Intern();
		} else if (empType.equals("C")){
			return new Confirmed();
		} else if (empType.equals("T")) {
			return new Contract();
		}
		return null;
	}
}