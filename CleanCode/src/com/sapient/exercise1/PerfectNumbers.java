package com.sapient.exercise1;

import java.util.Set;

public class PerfectNumbers {
	protected Set<Integer> divisors = null;
	
	public static void main(String[] args) {
		System.out.println(perfectNumber(6));
		System.out.println(perfectNumber(8));
		System.out.println(perfectNumber(24)); //1 2 3 4 6 8 12
		System.out.println(perfectNumber(28)); //1 2 4 7 14
	}
	
	public static void validate(int input) {
		if (input < 1) {
			throw new IllegalArgumentException("Input must be positive.");
		}
	}
	
	public static void factors(int input) {
		
	}
	
	public static boolean perfectNumber(int input) {
		int sum = 0;
		for (int counter = 1; counter < input; counter++) {
			if(input % counter == 0) {
				sum += counter;
			}
		}
		return sum == input;
	}
}
