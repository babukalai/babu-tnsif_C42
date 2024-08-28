package com.tnsif.day3;

abstract class value1 {
	abstract void one();
}

class value2 extends value1 {
	public void one() {
		System.out.println("Abstract method in abstarct class");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		value2 val = new value2();
		val.one();
	}
}
