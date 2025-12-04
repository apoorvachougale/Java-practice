package com.kodnest.java.methods;


public class MethodDemo {
	public static void main(String[] args) {
		System.out.println("Start");
		MethodDemo.add(10,20);
	}
	public static int add(int a, int b) {
		int c = a+b;
		return c;
	}
}
