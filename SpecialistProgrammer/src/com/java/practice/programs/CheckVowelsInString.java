package com.java.practice.programs;

import java.util.Scanner;

public class CheckVowelsInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().toLowerCase();
        int count = 0;
//        for(char c : str.toCharArray()) {
//        	if("aeiou".indexOf(c) != -1) {
//        		count++;
//        	}
//        }
        
        
        for(int i=0; i<str.length(); i++) {
        	if(str.charAt(i)=='a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i) =='o' || str.charAt(i) == 'u') {
        		count++;
        	}
        }
        
        System.out.println("The number of vowels in a string: " +count);
        
        sc.close();
	}
}
