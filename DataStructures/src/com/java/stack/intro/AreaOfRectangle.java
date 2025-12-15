package com.java.stack.intro;

import java.util.Scanner;

public class AreaOfRectangle {

	public static boolean isAbundant(int num) {
		int sum =0;
		for(int i=1; i<=num/2; i++) {
			
			if(num%i==0) {
				sum += i;
			}
		}
		return sum>num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int res[] = new int[n];
		
		int count = 0;
		int number = 12;
		while(count<n) {
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
}
