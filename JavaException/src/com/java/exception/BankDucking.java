package com.java.exception;

public class BankDucking {
	public void initiate()throws Exception {
		System.out.println("Connection to Bank established.");
		
		AtmDucking atm = new AtmDucking();
		atm.validate();
	
		System.out.println("Connection to bank terminated..");
	}
}
