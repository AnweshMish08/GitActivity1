package com.acc.lkm.InheritanceDemo;

public class Participant extends Organisation {
	String facility = "BDC";
	Participant() {
		super(500);
		System.out.println("Learning Java Inheritance");
		System.out.println(facility);
		System.out.println(super.facility);
	}

	void learning(String stream1, String stream2) {
		System.out.println(stream1 + " " + stream2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Participant participant = new Participant();
		Trainer trainer = new Trainer();
		participant.learning("Java", "Python");
//		participant.training("Java SE");
//		participant.org(100);
	}

}
