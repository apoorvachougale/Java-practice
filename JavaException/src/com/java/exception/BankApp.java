package com.java.exception;

public class BankApp {
	public static void main(String[] args) {
		
		try {
		Bank bank = new Bank();
		bank.initiate();
		} catch (Exception e) {
			System.out.println("Issue reached to bank..");
		}
		finally {
			System.out.println("Connection to main app terminated...");
		}
		
	}
}
