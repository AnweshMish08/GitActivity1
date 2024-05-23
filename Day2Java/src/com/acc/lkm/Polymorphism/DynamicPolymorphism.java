package com.acc.lkm.Polymorphism;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		Market europe, functions, market;
		europe = new Europe(); // UpCasting
		functions = new Functions();
		market = new Market();
		System.out.println(market.marketRevenue(11.56));
		System.out.println(functions.marketRevenue(16.96));
		System.out.println(europe.marketRevenue(37.16));
	}
}
