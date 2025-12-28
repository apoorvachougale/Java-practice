package com.java.practice.programs;

import java.util.Scanner;

public class CheckForAmicablePairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int num2 = sc.nextInt();
		
		int sum1 = 0, sum2 = 0;
		
		for(int i=1; i<=num1/2; i++) {
			if(num1%i == 0) {
				sum1 += i;
			}
		}
		
		for(int i=1; i<=num2/2; i++) {
			if(num2%i == 0) {
				sum2 += i;
			}
		}
		
		if(num1 == sum2 && num2 == sum1) {
			System.out.println("The numbers "+num1+ " and " +num2+ " are Amicable pairs");
		} else {
			System.out.println("The numbers "+num1+ " and " +num2+ " are not an Amicable pairs");

		}
	}
}
