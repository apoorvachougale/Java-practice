package com.java.threads;

import java.util.Scanner;

public class Activity extends Thread {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();

		if (name.equals("bank")) {
			banking();
		} else if (name.equals("add")) {
			addition();
		} else {
			printing();
		}
	}

	public void banking() {
		Scanner sc = new Scanner(System.in);
		int pwd = 1234;
		System.out.println("Enter password:");
		int input = sc.nextInt();
		if (input == pwd) {
			System.out.println("Access your account");
		} else {
			System.out.println("Wrong password");
		}
		sc.close();
	}

	public void addition() {
		int a = 10;
		int b = 20;
		System.out.println("Addition is: " + (a + b));
	}

	public void printing() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("This is multi threading...");
		}

	}
	
}
