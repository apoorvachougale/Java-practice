package com.java.composition;

public class Car {

	String brand;
	int cost;
	public Car(String brand, int cost) {
		
		this.brand = brand;
		this.cost = cost;
	}
	Engine e = new Engine("Petrol", 60);

}
