package com.kodnest.java.numbermanipulation;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
	System.out.println("Enter start value");
	Scanner sc = new Scanner(System.in);
	int start = sc.nextInt();
	System.out.println("Enter end value");
	int end = sc.nextInt();
	for (int i=start;i<=end;i++) {
	Prime pc = new Prime();
	boolean res = pc.primeNum(i);
	if (res==true) {
		System.out.println(i);
	}
	}
	sc.close();
}
}
