package com.java.infosys.revision;

import java.util.Scanner;

public class StringPalindromeChecker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String clean = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		String sb = new StringBuilder(clean).reverse().toString();
		
		
		if(str.equals(sb)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
}
