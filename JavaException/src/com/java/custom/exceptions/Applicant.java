package com.java.custom.exceptions;

import java.util.Scanner;

public class Applicant {
	public void validate() throws UnderAgeException, OverAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age  = sc.nextInt();
		if(age< 18) {
			UnderAgeException ude1 = new UnderAgeException();
			 System.out.println(ude1.getMessage());
			 throw ude1;
		} else if(age > 40) {
			OverAgeException ude2 = new OverAgeException();
			System.out.println(ude2.getMessage());
			throw ude2;
		} else {
			System.out.println("Welcome to Kodnest Matrimoney. You have successfully created an account....");
		}
		sc.close();
	}
}
