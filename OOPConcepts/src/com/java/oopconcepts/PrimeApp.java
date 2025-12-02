package com.java.oopconcepts;

import java.util.Scanner;

public class PrimeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		for(int i=start;  i<=end;i++) {
			
			PrimeNumber p = new PrimeNumber();
			boolean res = p.isPrime(i);
			if(res==true) {
				System.out.println(i);
			}
		}
		
	}
}
