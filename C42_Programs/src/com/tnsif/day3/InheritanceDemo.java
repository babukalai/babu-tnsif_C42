package com.tnsif.day3;

public class InheritanceDemo {
	
	//Single Inheritance
	public static void main(String[] args) {
		Puppy puppy = new Puppy();
		puppy.bark();
		puppy.sleep();
		
		Car c = new Car();
		c.drive();
		c.start();
		
		Bike b = new Bike();
		b.ride();
		b.drive();
		b.start();
		
		Rose r = new Rose();
		r.bloom();
		r.blooming();
		
		Tulip t = new Tulip();
		t.bloom();
		t.bud();
	}
}
       //parent class
        class Dog {
			void bark() {
				System.out.println("The dog is barking");
			}
		}
        //child class
		class Puppy extends Dog {
			void sleep() {
				System.out.println("The puppy is sleeping");
			}
		}
		
		
		
	//Multilevel Inheritance
		//Chain Level
		//child class 1
		class Vehicle {
			void start() {
				System.out.println("The vehicle is started");
			}
		}
		//child class 2
		class Car extends Vehicle {
			void drive() {
				System.out.println("The bike is ride by rider");
			}
		}
		//child class 3
		class Bike extends Car {
			void ride() {
				System.out.println("The bike is ride by rider");
			}
		}
		
		
		
	//Hierarchical Ingeritance
		//parent class
		class Flowers {
			void bloom() {
				System.out.println("The flowers is bloom");
			}
		}
		//child class 1
		class Rose extends Flowers {
			void blooming() {
				System.out.println("The rose is blooming");
			}
		}
		//child class 2
		class Tulip extends Flowers {
			void bud() {
				System.out.println("The tulip is in bud stage");
			}
		}