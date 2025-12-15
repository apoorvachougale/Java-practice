package com.java.exception;

public class BankAppDucking {
public static void main(String[] args) {
		
		try {
			System.out.println("Connection to main App..");
			BankDucking bank = new BankDucking();
		bank.initiate();
		} catch (Exception e) {
			System.out.println("Issue reached to bank app..");
		}
		finally {
			System.out.println("Connection to main app terminated...");
		}
		
	}
}
