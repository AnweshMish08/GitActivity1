package com.acc.lkm.JavaDay1;

public class Car {
	public int yearModel;
    private String brand;
    public int priceModel;
    private int numberModel;

    public Car(String b, int year, int price, int number)
    {
        yearModel = year;
        brand = b;
        priceModel = price;
        numberModel = number;      
    }

    public int getYear()                
    {
        return yearModel;
    }

    public String getBrand()
    {
        return brand;
    }

    public int getPrice()
    {
        return priceModel;
    }

    public int getNumber()
    {
        return numberModel;
    }
    
    public void start() {
    	System.out.println("Car Starts");
    }
    
    public void stop() {
    	System.out.println("Car Stops");
    }
    
    public void drive() {
    	System.out.println("Car drives");
    }
    
    public static void main(String[] args)
    {    
        Car car1 = new Car("Ford", 2013, 20000, 1292);
        Car car2 = new Car("Audi", 2012, 25000, 2289);

        System.out.println("This car is : " + car1.getBrand() + ", Year : " + car1.getYear() + ", Price : " + car1.getPrice() + ", Model Number : " + car1.getNumber());
        System.out.println("This car is : " + car2.getBrand() + ", year " + car2.getYear() + ", price " + car2.getPrice() + ", Model Number : " + car1.getNumber());
        
        System.out.println("Car Actions Are : ");
        car1.start();
        car1.stop();
        car1.drive();
   }
}
