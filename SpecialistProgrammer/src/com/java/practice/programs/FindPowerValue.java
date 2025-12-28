package com.java.practice.programs;

import java.util.Scanner;

public class FindPowerValue {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter value of x:");
	int x = scan.nextInt();
	System.out.println("Enter value of n:");
	int n = scan.nextInt();
	
	if(n<0) {
		n = n * -1;
		x = 1/x;
	}
	double res = 1;
	while(n > 0) {
		if(n%2 != 0) {
			res *= x;
		}
		x *= x;
		n /= 2;
	}
	
	System.out.println(res);
	scan.close();
}
}
