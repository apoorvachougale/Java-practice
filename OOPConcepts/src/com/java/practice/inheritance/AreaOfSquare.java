package com.java.practice.inheritance;

public class AreaOfSquare extends AreaShape{
	int length;
	
	public AreaOfSquare(int length) {
		this.length = length;
	}

	int calculateArea() {
		int area = length*length;
		return area;
	}
}
