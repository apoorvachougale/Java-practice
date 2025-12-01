package com.java.kodnest.practice;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter a number till where you want to print sum of naumbers: ");
		int n = scan.nextInt();
		for (int i =1 ; i <= n; i++) {
			sum += i*i;
		}
		System.out.println("Sum of squares of numbers is: " +sum);
		scan.close();
	}
}
