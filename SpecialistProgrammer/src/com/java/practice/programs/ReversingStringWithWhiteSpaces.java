package com.java.practice.programs;

import java.util.Scanner;

public class ReversingStringWithWhiteSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(reverseWithSpaces(str));
		
	}
	
	public static String reverseWithSpaces(String str) {
		char inputArr[] = str.toCharArray();
		char res[] = new char[inputArr.length];
		
		for(int i=0; i<inputArr.length; i++) {
			if(inputArr[i] !=' ') {
				res[i] = ' ';
			}
		}
		int j = res.length-1;
		for(int i=0; i<inputArr.length; i++) {
			if(inputArr[i] != ' ') {
				while(j >= 0 && res[j] != ' ') {
					j--;
				}
				res[j] = inputArr[i];
				j--;
			}
		}
		return new String(res);
	}
}
