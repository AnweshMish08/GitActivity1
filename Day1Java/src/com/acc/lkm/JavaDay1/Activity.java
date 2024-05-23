package com.acc.lkm.JavaDay1;

public class Activity {
	String name = "John";
	long sim1 = 1876543210;
	long sim2 = 1890678290;
	String role = "Operation Lead";
	
	public void detailsSim1(String name, String role, long sim1) {
		System.out.println(name);
		System.out.println(role);
		System.out.println(sim1);
	}
	public void detailsSim2(String name, String role, long sim1, long sim2) {
		System.out.println(name);
		System.out.println(role);
		System.out.println(sim1);
		System.out.println(sim2);
	}
	public static void main(String[] args) {
		Activity activity1 = new Activity();
		activity1.detailsSim1(activity1.name, activity1.role, activity1.sim1);
		Activity activity2 = new Activity();
		activity2.detailsSim2(activity2.name, activity2.role, activity2.sim1, activity2.sim2);
	}
}
