package com.tnsif.day3;

class Demo {
	
	String name;
	int rollNo;
	static String teacherName;
	
	void display() {
		System.out.println("Student's Name : "+name);
		System.out.println("Student's RollNo : "+rollNo);
		System.out.println("Student's TeacherName : "+teacherName);
	}
		
		static {
			Demo.teacherName = "Malar";
		}
}

public class StaticDemo {
	static void method() {
		System.out.println("Static keyword in this method");
	}
	public static void main(String[] args) {
		Demo s1 = new Demo();
		Demo s2 = new Demo();
		
		s1.name = "George";
		s1.rollNo =  1001;
		
		s2.name = "Arivu";
		s2.rollNo = 1002;
		
		s1.display();
		s2.display();
		
		method();
	}
}
