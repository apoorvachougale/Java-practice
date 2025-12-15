package com.java.exception;

public class Bank{
	
	public void initiate() throws Exception{
		System.out.println("Connection to Bank established.");
		try {
		Atm atm = new Atm();
		atm.validate();
		} catch(Exception e) {
			System.out.println("Issue reached bank from atm..");
			throw e;
		}
		finally {
			System.out.println("Connection to bank terminated..");
		}
	}
}
