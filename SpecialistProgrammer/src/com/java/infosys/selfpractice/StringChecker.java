package com.java.infosys.selfpractice;

import java.util.Scanner;

public class StringChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String target = "hello";
		int j = 0;
		int count =0;
		for(int i=0; i<input.length(); i++) {
			if(j < target.length() && input.charAt(i)==target.charAt(j)) {
				count++;
				j++;
			}
		}
		if(count==target.length()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
