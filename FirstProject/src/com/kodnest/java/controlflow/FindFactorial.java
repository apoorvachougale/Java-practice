package com.kodnest.java.controlflow;

import java.util.Scanner;

public class FindFactorial {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int factorial = 1;
		for (int i=1; i<=n; i++) {
			factorial *= i;
		}
		
		System.out.println("Factorial of " +n+ " is: " +factorial);
		
		
		scan.close();
	}
}
