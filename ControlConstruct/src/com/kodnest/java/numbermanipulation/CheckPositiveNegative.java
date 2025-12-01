package com.kodnest.java.numbermanipulation;

import java.util.Scanner;

public class CheckPositiveNegative {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		PositiveNegativeChecker pnc = new PositiveNegativeChecker();
		pnc.checkNumber(n);
		
		scan.close();
	}
}
