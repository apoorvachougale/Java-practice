package com.kodnest.java.loopingconstruct;

public class NumberPattern2 {
	public static void main(String[] args) {
		for (int j =1; j<= 3; j++) {
			for (int k = 1; k<= 5; k++) {
				System.out.print(k +" ");
			}
			for (int i=1; i<=5;i++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
	}
}
