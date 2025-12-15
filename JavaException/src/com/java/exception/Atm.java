package com.java.exception;

import java.util.Scanner;

public class Atm {
	int username;
	int pwd;
	
	public void validate() throws Exception{
		System.out.println("Connection to ATM established.");
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		int uname = sc.nextInt();
		System.out.println("Enter password");
		int pwd = sc.nextInt();
		int res = uname/pwd;
		System.out.println("Validated...");
		sc.close();
	} catch(Exception e) {
		System.out.println("Issues arised and handled in ATM...");
		throw e;
	}
	 finally {	
		System.out.println("Connection to ATM terminated.");
	 }
	}
}
