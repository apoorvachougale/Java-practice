package com.java.collection.practice;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagramCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next().toLowerCase();
		String s2 = sc.next().toLowerCase();
		
		char arr1[] = s1.toCharArray(); 
		char arr2[] = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean res = Arrays.equals(arr1, arr2);
		if(res) {
			System.out.println("Strings are Anagrams");
		} else {
			System.out.println("Strings are not Anagrams");
		}
		sc.close();
	}
}
