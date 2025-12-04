package com.kodnest.java.objectorientation;

public class FanApp {
	public static void main(String[] args) {
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		
		f1.color = "Black";
		f1.cost = 15000;
		f1.brand = "GM";
		
		f2.color = "Maroon";
		f2.cost = 24999;
		f2.brand = "Crompton";
		
		f1.rotate();
		f1.giveAir();
		
		f2.rotate();
		f2.giveAir();
	}
}
