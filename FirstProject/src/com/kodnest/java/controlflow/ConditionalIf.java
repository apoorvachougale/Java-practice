package com.kodnest.java.controlflow;

import java.util.Scanner;

public class ConditionalIf {
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if (age>=18) {
			System.out.println("Eligible for voting");
		}
	}
}
