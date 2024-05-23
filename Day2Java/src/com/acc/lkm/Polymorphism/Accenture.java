package com.acc.lkm.Polymorphism;

public class Accenture extends DynamicUpCasting {
	void project(long projid) {
		System.out.println("Hii");
		System.out.println(projid);
	}
	
	void project(String proj) {
		System.out.println(proj);
	}
	
	void stream(String name) {
		System.out.println(name);
	}
	
	void set() {
		System.out.println("Method of Child");
	}

	{
		System.out.println(EID);
	}

	public static void main(String[] args) {
		DynamicUpCasting dynamicUpCasting = (DynamicUpCasting)new Accenture(); // UpCasting
		DynamicUpCasting dynamicUpCasting2 = (DynamicUpCasting)new Accenture(); // UpCasting
		dynamicUpCasting.project(54679L);
		dynamicUpCasting.set();
		dynamicUpCasting2.set();
//		dynamicUpCasting.stream("Java")
		// DownCasting
		Accenture accenture = (Accenture)dynamicUpCasting;
		accenture.project(44);
		accenture.EID = 67789L;
		accenture.project("Hybris");
	}
}
