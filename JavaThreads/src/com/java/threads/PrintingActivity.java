package com.java.threads;

public class PrintingActivity extends Thread{
	@Override
	public void run() {
		System.out.println("Printing activity started");
		
		for(int i=1; i<=10; i++) {
			System.out.println("This is multi threading...");
		}
		
		System.out.println("Printing activity completed..");
	}
}
