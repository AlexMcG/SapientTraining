package com.sapient.client.cui;

class Process{
	public int[] create() {
		int[] num;
		num = new int[10];
		num[3]=6;
		num[7]=9;
		return num;
	}
	
	public void display(int[] src){
		for(int data : src){
			System.out.println(data);
		}
	}
}

public class MainApp {
	public static void main(String[] args) {
		System.out.println("Begin");
		/*
		int[] num;		//Not on stack because not initialized
		num = null;		//Can be set to null because it is a reference variable
		
		num = new int[10];
		
		int ref[];
		
		ref = num;
		
		ref[4] = 5;
		
		
		//because ref and num point to the same reference, changing one will change the other
		//arrays are designed this way because to help the garbage collector. once there are no more
		//references the whole array is deallocated.
		System.out.println(num[4]);
		 */
		Process p = new Process();
		
		int[] result = p.create();
		
		p.display(result);
	}
}
