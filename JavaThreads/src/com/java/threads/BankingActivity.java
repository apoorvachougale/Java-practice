package com.java.threads;

import java.util.Scanner;

public class BankingActivity extends Thread{
	@Override
	public void run() {
		
		System.out.println("Banking activity started....");
		Scanner sc = new Scanner(System.in);
		int pwd = 1234;
		System.out.println("Enter password:");
		int input = sc.nextInt();
		if(input==pwd) {
			System.out.println("Access your account");
		} else {
			System.out.println("Wrong password");
		}
	}
}
