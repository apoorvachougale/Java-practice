package com.java.practice.inheritance;

public class AreaOfRectangle extends AreaShape{
	
	int length;
	int width;
	
	public AreaOfRectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	int calculateArea() {
		return length*width;
	}
}
