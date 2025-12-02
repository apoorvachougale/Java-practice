package com.java.practice.inheritance;

public class AreaOfCircle extends AreaShape{
	double radius;
	
	public AreaOfCircle(double radius) {
		this.radius = radius;
	}

	double calculateArea() {
		return Math.PI * radius *radius;
	}
}
