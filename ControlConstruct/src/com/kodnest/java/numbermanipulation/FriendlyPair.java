package com.kodnest.java.numbermanipulation;

import java.util.Scanner;

public class FriendlyPair {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two numbers: ");
	int n = scan.nextInt();
	int m = scan.nextInt();
	int sum1 = 0;
	int sum2 = 0;
	for (int i = 1; i<= n-1; i++) {
		if (n%i==0) {
			sum1 += i;
		}
	}
	for(int i=1; i<=m-1;i++) {
		if(m%i==0) {
			sum2 += i;
		}
	}
	if(sum1/n==1 && sum2/m==1) {
		System.out.println(n+" and "+m+ " are friendly pair numbers");
	} else {
		System.out.println(n+" and "+m+ " are not friendly pair numbers");
	}
	
	scan.close();
}
}
