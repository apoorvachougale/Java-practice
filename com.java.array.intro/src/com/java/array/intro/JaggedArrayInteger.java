package com.java.array.intro;

import java.util.Scanner;

public class JaggedArrayInteger {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st dimension array: ");
		int [][]arr = new int[scan.nextInt()][];
		
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println("Enter 2nd dimension " +i+ "th array");
			arr[i]= new int[scan.nextInt()];
		}
		
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				System.out.println("Enter " +i+ " class " +j+ " student marks: ");
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print("[");
			for(int j=0; j<=arr[i].length-1; j++) {
				System.out.print(arr[i][j]);
				if(j!=arr[i].length-1) {
					System.out.print(" , ");
				}
			}
			System.out.println("]");
		}
		scan.close();
	}
}
