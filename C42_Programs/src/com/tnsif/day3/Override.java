package com.tnsif.day3;

class One {
	void disp(int c) {
		System.out.println("The disp method is one class");
	}
}

class Two extends One {
	void disp(int c) {
		System.out.println(c);
	}
}

public class Override {

	public static void main(String[] args) {
		
		Two t = new Two();
		t.disp(28);
	}

}
