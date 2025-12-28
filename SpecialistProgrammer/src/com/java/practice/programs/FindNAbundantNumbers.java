package com.java.practice.programs;

import java.util.Scanner;

public class FindNAbundantNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count of the numbers: ");
		int n = scan.nextInt();
		int count =0;
		int number = 12;
		int res[] = new int[n];
		while(count <n) {
			if(isAbundant(number)) {
				res[count] = number;
				count++;
			}
			number++;
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(res[i]+ " ");
		}
	}
	
	public static boolean isAbundant(int num) {
		int sum =0;
		for(int i=1; i<= num/2; i++) {
			if(num%i == 0) {
				sum += i;
			}
		}
		return sum > num;
	}
}
