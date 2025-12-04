package com.java.array.intro;

import java.util.Scanner;

public class JaggedArrayDemo {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 1st diemsion of array: ");
	String arr[][] = new String[scan.nextInt()][];
	
	for (int i=0; i<= arr.length-1; i++) {
		System.out.println("Enter 2nd dimension of " +i+ "th the array:");
		arr[i] = new String[scan.nextInt()];
	}
	
	for(int i=0; i<= arr.length-1; i++) {
		for(int j=0; j <= arr[i].length-1; j++) {
		System.out.println("Enter the " +i+ "th class " +j+ " Student name");
		arr[i][j] = scan.next();
		}
	}
	
	for(int i=0; i<= arr.length-1; i++) {
		System.out.print("[");
		for(int j=0; j <= arr[i].length-1; j++) {
			System.out.print(arr[i][j]);
			if(j != arr[i].length-1) {
				System.out.print(" , ");
			}
		}
		System.out.println("]");
		
	}
	scan.close();
}
}
