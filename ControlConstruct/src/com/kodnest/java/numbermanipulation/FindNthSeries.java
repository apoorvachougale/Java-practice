package com.kodnest.java.numbermanipulation;

import java.util.Scanner;

public class FindNthSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth term: ");
		int n = sc.nextInt();
		int nthTerm = n * (n+1)/2;
		System.out.println(nthTerm);
		
		sc.close();
	}
}
