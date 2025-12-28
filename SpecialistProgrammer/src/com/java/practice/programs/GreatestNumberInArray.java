package com.java.practice.programs;

import java.util.Scanner;

public class GreatestNumberInArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int greatest = 0;
		for(int i=0; i<n; i++) {
			if(arr[i]>greatest) {
				greatest = arr[i];
			}
		}
		System.out.println("Greatest number in array is: " +greatest);
	}
}
