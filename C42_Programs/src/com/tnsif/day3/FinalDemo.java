package com.tnsif.day3;

class Manager {
	void show() {
		System.out.println("Show method in parent class");
	}
}
class Employee extends Manager {
	void show() {
		System.out.println("Show method in child class");
	}
}
public class FinalDemo {
	public static void main(String[] arge) {
		
		//final int a = 10;
		//a = 20;
		//System.out.println(a);
		
		Employee emp = new Employee();
		emp.show();
	}
}