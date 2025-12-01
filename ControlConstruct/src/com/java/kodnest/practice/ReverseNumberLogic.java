package com.java.kodnest.practice;

public class ReverseNumberLogic {
	public int reverseNumber(int n) {
		int rev = 0;
		while (n>0) {
			int digit = n%10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		return rev;
	}
}
