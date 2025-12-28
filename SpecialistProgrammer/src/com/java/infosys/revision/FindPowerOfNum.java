package com.java.infosys.revision;

import java.util.Scanner;

public class FindPowerOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base value:");
		double base = sc.nextDouble();
		System.out.println("Enter exponent value: ");
		int exponent = sc.nextInt();
		
		double res = findPower(base, exponent);
		System.out.println(res);
		sc.close();
	}
	
	public static double findPower(double base, int exponent) {
		long N = exponent;
		if(N<0) {
			base = 1.0/ base;
			N = -N;
		}
		double pow = 1.0;
		while(N>0) {
			if(N%2 != 0) {
				pow *= base;
			}
			base *= base;
			N /= 2;
		}
		return pow;
	}
}
