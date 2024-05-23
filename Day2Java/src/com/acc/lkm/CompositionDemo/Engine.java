package com.acc.lkm.CompositionDemo;

class Engine {
	private String type;

	public Engine(String type) {
		this.type = type;
	}

	public void startEngine() {
		System.out.println(type + " engine started.");
	}

	public static void main(String[] args) {
		Engine engine = new Engine("V8");
		Car car = new Car("Toyota Camry", engine);
		car.start();
	}
}
