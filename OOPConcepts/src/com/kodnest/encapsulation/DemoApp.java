package com.kodnest.encapsulation;

public class DemoApp {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.setPageNo(100);
		System.out.println("Book with " +d.getPageNo()+ " is 100 Rs.");
	}
}
