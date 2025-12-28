package com.java.threads;

public class MultiThreadDemo {
	public static void main(String[] args) {
		System.out.println("Main method execution started...");
		
		BankingActivity t1 = new BankingActivity();
		PrintingActivity t2 = new PrintingActivity();
		AdditionActivity t3 = new AdditionActivity();
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Main method execution completed...");
	}
}
