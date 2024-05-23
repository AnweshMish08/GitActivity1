package com.acc.lkm.InheritanceDemo;

public class Organisation {
	String facility = "KDC";
	Organisation(int id) {
		System.out.println(id);
	}
	public Organisation() {
		System.out.println("Accenture");
	}
	public void details(String name, String location) {
		System.out.println(name + " " + location);
	}
}
