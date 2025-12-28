package com.java.threads;

public class SingleThreadDemo {
	public static void main(String[] args) {
		System.out.println("Printing started....");
		for(int i=0; i<5; i++) {
			System.out.println("Kodnest");
		}
		System.out.println("Printing ended....");
		
		System.out.println("Addition started....");
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		System.out.println("Addition ended....");
		
		
	}
}
