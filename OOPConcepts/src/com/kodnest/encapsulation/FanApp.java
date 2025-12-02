package com.kodnest.encapsulation;

public class FanApp {
	public static void main(String[] args) {
		Fan f = new Fan(3, "Crompton");
		System.out.println(f.noOfWings+ " " + f.brandName);
	}
}
