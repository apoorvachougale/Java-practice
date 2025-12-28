package com.java.infosys.revision;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int count = 0;
		String constChar = "";
		for(char ch : str.toCharArray()) {
			if("aeiouAEIOU".indexOf(ch)!=-1) {
				count +=1;
				constChar = constChar + ch;
			}
		}
		System.out.println("Number of vowels is: " +count);
		System.out.println("Vowels are: " +constChar);
	}
}
