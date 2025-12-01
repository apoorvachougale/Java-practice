package com.kodnest.java.numbermanipulation;

import java.util.Scanner;

public class FindFibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("The first " +n+ " fibonacci numbers are: ");
		int a =0;
		int b = 1;
		int i =0;
		while (i < n) {
			System.out.println(a);
			int next_term = a+b;
			a =b;
			b = next_term;
			i++;
		}
		scan.close();
	}
}
