package com.java.kodnest.practice;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to be reversed: ");
		int n = scan.nextInt();
		ReverseNumberLogic rlogic = new ReverseNumberLogic();
		int res = rlogic.reverseNumber(n);
		System.out.println("the reversed number is: " +res);
		
		scan.close();
	}
}
