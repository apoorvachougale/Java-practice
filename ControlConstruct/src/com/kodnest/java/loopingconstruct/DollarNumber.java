package com.kodnest.java.loopingconstruct;

public class DollarNumber {
	public static void main(String[] args) {
		for (int j =1; j<= 3; j++) {
			for (int k = 1; k<= 3; k++) {
				System.out.print("$ ");
			}
			for (int i=1; i<=5;i++) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}
}
