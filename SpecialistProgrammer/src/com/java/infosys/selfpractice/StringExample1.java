package com.java.infosys.selfpractice;

import java.util.Arrays;
import java.util.Scanner;

public class StringExample1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String vowels="";
		String consonant="";
		for(char c: str.toCharArray()) {
			if("aeiouAEIOU".indexOf(c)!=-1) {
				vowels = vowels+c;
			} else {
				consonant = consonant +c;
			}
		}
		char sortarr[] = vowels.toCharArray();
		Arrays.sort(sortarr);
		String res = new String(sortarr);
		System.out.println(res+consonant);
		
		scan.close();
	}
}
