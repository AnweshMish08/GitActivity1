package com.acc.lkm.CompositionDemo;

public class Car {
 private String model;
 private Engine engine;

 public Car(String model, Engine engine) {
     this.model = model;
     this.engine = engine;
 }

 public void start() {
     engine.startEngine();
     System.out.println("Car with model " + model + " started.");
 }
}
