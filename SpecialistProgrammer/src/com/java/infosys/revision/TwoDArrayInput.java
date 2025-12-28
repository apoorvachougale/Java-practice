package com.java.infosys.revision;

import java.util.Scanner;

public class TwoDArrayInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arr[][] = new int[2][3];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Enter " +i+ "th row:" +j+"th col element.");
				arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Array elements are: ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose of array elements are: ");
		for(int j=0; j<arr[0].length; j++) {
			for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
