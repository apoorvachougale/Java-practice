package com.kodnest.java.numbermanipulation;

public class PositiveNegativeChecker {
	public void checkNumber(int n) {
		if (n > 0) {
			System.out.println("Number is positive");
		} else if(n < 0) {
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is zero");
		}
	}
}
