package com.acc.lkm.JavaDay2;

import java.util.Date;

public class Car {
	String car_name;
	Date date_of_purchase;

	public Car(String car_name, Date date_of_purchase) {
		super();
		this.car_name = car_name;
		this.date_of_purchase = date_of_purchase;
	}

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public Date getDate_of_purchase() {
		return date_of_purchase;
	}

	public void setDate_of_purchase(Date date_of_purchase) {
		this.date_of_purchase = date_of_purchase;
	}

}
