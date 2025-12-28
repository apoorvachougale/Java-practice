package com.java.practice.programs;

import java.util.Scanner;

public class StringCamelCasing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();
        
        String parts [] = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String s : parts) {
        	sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
        }
        System.out.println(new String(sb).trim());
	}
}
