package com.acc.lkm.InheritanceDemo;

public class Trainer extends Organisation {
	public Trainer() {
		super(200);
		System.out.println("Training on Java");
	}
	public void training(String stream) {
		System.out.println(stream);
	}
}
