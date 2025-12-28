package com.java.infosys.revision;

import java.util.Scanner;

public class NPrimeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		int check = 2;
		while(count<num) {
			if(isPrime(check)) {
				System.out.println(check+" ");
				count++;
			}
			check++;
		}
		scan.close();
	}
	
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i=2; i<= Math.sqrt(num); i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
