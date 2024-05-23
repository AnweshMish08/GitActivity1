package com.acc.lkm.accessdemo;

import com.acc.lkm.JavaDay1.*;

public class AccessModifierDemo {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = new Car();
		car.start();
		car2.start();
		System.out.println(car.details("BMW", "Black", new java.util.Date(), "X5"));
		System.out.println(car.details("BMW", "White", new java.util.Date(), "X5"));
	}
}
