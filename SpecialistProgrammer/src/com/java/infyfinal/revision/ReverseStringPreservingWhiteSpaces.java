package com.java.infyfinal.revision;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseStringPreservingWhiteSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sentence");
		String str = sc.nextLine();
		String res = reverseString(str);
		System.out.println(res);
		
		ArrayList<String> arr = new ArrayList<>();
		
		sc.close();
	}
	
	public static String reverseString(String str) {
		char arr[] = str.toCharArray();
		char res[] = new char[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==' ') {
				res[i]=' ';
			}
		}
		int j=arr.length-1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=' ') {
				while(j>=0 && res[j]==' ') {
					j--;
				}
				res[j]=arr[i];
				j--;
			}
		}
		
		return new String(res);
	}
}
