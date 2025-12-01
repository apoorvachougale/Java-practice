package com.kodnest.java.numbermanipulation;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		int n = scan.nextInt();
		System.out.println("Reversed number is: " + reverseNum(n));
	}
	
	public static int reverseNum(int n) {
		int rev = 0;
		while (n >0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		return rev;
	}
}
