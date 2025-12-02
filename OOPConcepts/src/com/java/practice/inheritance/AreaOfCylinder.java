package com.java.practice.inheritance;

public class AreaOfCylinder extends AreaShape{
	int radius;
	int height;
	public AreaOfCylinder(int radius, int height) {
		this.height=height;
		this.radius = radius;
	}

	double calculateArea() {
		return 2*3.14*radius*(radius+height);
	}
}
