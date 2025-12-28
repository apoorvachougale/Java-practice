package com.java.practice.programs;

import java.util.Scanner;

public class RemoveExtraSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();
        String newStr = str.trim().replaceAll("\\s+"," ");
        System.out.println(newStr);
        
        
        
	}
}
