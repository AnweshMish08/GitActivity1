package com.acc.lkm.JavaDay2;

public class Driver {
	String driver_name;
	Car car;

	public Driver(String driver_name, Car car) {
		super();
		this.driver_name = driver_name;
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getDriver_name() {
		return driver_name;
	}

	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}
	public static void main(String[] args) {
		Car car = new Car("BMW", new java.util.Date(System.currentTimeMillis()));
		Driver driver = new Driver("Mohan", car);
		System.out.println("Driver Name : " + driver.getDriver_name() + "\n" + "Car Name : " + car.getCar_name() + "\n" + "Purchase Date : " + car.getDate_of_purchase());
	}
}
