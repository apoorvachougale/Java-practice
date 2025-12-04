package com.java.stringarray.intro;

import java.util.Scanner;

public class CountCharacterInString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = scan.nextLine();
		char arr1[] = s1.toCharArray();

		
		
		for(int i=0; i<arr1.length;i++) {
			char currChar = arr1[i];
			int count = 1;
			if(arr1[i] !='\u0000') {
			for(int j=i+1;j<arr1.length; j++) {
				if(arr1[j] == currChar) {
					count += 1;
					arr1[j]='\u0000';
			}
		  }
		}
			System.out.println(arr1[i]+ ":" +count);
			scan.close();
		}
	}
}
