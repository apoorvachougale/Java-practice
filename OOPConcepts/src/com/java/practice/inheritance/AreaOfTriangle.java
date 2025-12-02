package com.java.practice.inheritance;

public class AreaOfTriangle extends AreaShape{
	int len;
	int hei;
	public AreaOfTriangle(int len, int hei) {
		this.len= len;
		this.hei= hei;
	}
	double calculateArea() {
		return (len*hei)/2;
	}
}
