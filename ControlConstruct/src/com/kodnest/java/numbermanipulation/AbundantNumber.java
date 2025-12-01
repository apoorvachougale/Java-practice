package com.kodnest.java.numbermanipulation;

import java.util.Scanner;

public class AbundantNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		AbundantNumberLogic abl = new AbundantNumberLogic();
		abl.abundantNum(n);
		
		scan.close();
	}
}
