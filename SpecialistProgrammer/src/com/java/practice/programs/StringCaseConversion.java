package com.java.practice.programs;
import java.util.Scanner;
public class StringCaseConversion {
	
    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Ask user for input string
	        String str = scanner.nextLine();
	        //char arr[] = str.toCharArray();

	        // TODO: Toggle each word in the string
	        StringBuilder res = new StringBuilder();
	        for(int i=0; i<str.length(); i++){
	            char c = str.charAt(i);
	            if(Character.isLowerCase(c)){
	                res.append(Character.toUpperCase(c));
	            } else {
	                res.append(Character.toLowerCase(c));
	            }
	        }
	        // TODO: Print result
	        System.out.println(res);
	        scanner.close();
	    }
}

