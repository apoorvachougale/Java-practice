package com.java.stringarray.intro;

import java.util.Arrays;
import java.util.Scanner;

public class CheckForAnagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(Arrays.equals(arr1, arr2));
		
		scan.close();
	}
}
