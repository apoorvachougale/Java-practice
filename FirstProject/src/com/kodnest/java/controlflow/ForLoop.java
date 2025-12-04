package com.kodnest.java.controlflow;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
//		for (int i=1; i<=10; i++) {
//			System.out.println("I will get job in next 2 months");
//			System.out.println(i);
//		}
//		for (int i=2; i<=20;i+=2) {
//	
//					System.out.println(i);
//		}

		//Scanner scan = new Scanner(System.in);
		int N = 5;
		int M = 3;
		int factN = 1;
		int factM = 1;
		int tempN = N;
		int tempM = M;
		do{
			factN *= tempN;
			factM *= tempM;
			
			tempN--;
			tempM--;
			
		}while (tempN >= 1 && tempM >= 1);
		System.out.println(factN);
		System.out.println(factM);
	}
}
