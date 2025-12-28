package com.java.infosys.revision;

import java.util.Scanner;

public class ValidateName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String arr[] = str.toLowerCase().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(String s : arr) {
			sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append
			(" ");
		}
		System.out.println(sb.toString());
	}
}
