package com.java.kodnest.practice;

public class PrimeNumberLogic {
	public boolean isPrime(int n) {
		boolean isPrime = true;
		if (n <= 1) {
			return false;
		}
		for (int i =2; i <= n/2; i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
}
