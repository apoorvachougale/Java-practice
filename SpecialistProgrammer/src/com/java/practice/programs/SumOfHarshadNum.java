package com.java.practice.programs;

import java.util.Scanner;

public class SumOfHarshadNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int harshadSum = 0;
		for(int i=0; i<n; i++) {
			if(findHarshadNum(arr[i])) {
				harshadSum += arr[i];
			}
		}
		System.out.println("Sum of Harshad numbers: "+harshadSum);
	}
	
	public static boolean findHarshadNum(int n) {
		int digitSum = 0;
		int num = n;
		while(num>0) {
			int temp = num%10;
			digitSum += temp;
			num /= 10;
		}
		return n % digitSum == 0;
	}
}
