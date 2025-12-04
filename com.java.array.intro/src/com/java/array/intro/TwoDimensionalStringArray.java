package com.java.array.intro;

import java.util.Scanner;

public class TwoDimensionalStringArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the dimensions of array: ");
		String arr[][] = new String[scan.nextInt()][scan.nextInt()];
		
		for(int i=0; i<= arr.length-1; i++) {
			for(int j=0;j <= arr[i].length-1; j++) {
				System.out.println("Enter  " +i+ "th class student " + j+ " name: ");
				arr[i][j] = scan.next();
			}
		}
		
		System.out.println("Student names are: ");
		for(int i=0; i <= arr.length-1; i++) {
			System.out.print("[");
			for(int j=0; j<= arr[i].length-1; j++) {
				System.out.print(arr[i][j]);
			if(j!= arr[i].length-1) {
			System.out.print(" , ");
			}
			}
			System.out.println("]");
		}
		
		scan.close();
	}

}

