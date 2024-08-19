package com.tnsif.workout;

public class Operators {
	public static void main(String args[]) {
		int num1 = 10;
		int num2 = 20;
		int num0 = 10;
		System.out.println("num1 and num2 value before the operations: " + num1 + " " + num2);

		int num3 = ++num1 + num2 + num1--;
		System.out.println("num3 value after the process: " + num3);

		int num4 = num3++ + num1 + num2--;
        System.out.println("num4 value after the process: " + num4);

		System.out.println("num1,num2,num3,num4 values are after the process: " + num1 + " " + num2 + " " + num3 + " " + num4);
				
	    num0 = (10 == num0) ? 1 : 0;	
		System.out.println(num0);
	}
}