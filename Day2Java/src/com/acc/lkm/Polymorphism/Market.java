package com.acc.lkm.Polymorphism;

public class Market {
	final String org;
	public Market() {
		org = "Accenture";
		System.out.println(org);
	}
	double marketRevenue(double rev) {
		return rev;
	}
}
