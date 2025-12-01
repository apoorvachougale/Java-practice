package com.kodnest.java.loopingconstruct;

public class AlphabetPattern {
public static void main(String[] args) {
	char x = 'A';
	for (int i=1; i<=5; i++,x++) {
		
		for (int j=1; j<=i;j++) {
			System.out.print(" " +x);

		}
		System.out.println();
	}
}
}
