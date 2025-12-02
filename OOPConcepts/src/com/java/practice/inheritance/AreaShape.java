package com.java.practice.inheritance;

public class AreaShape {
	String name;
	int area;
	public AreaShape(String name, int area) {
		super();
		this.name = name;
		this.area = area;
	}
	public AreaShape() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
}
