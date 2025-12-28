package com.java.infosys.selfpractice;

import java.util.Scanner;

public class MaxElementArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int maxVal = arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i]>maxVal) {
				maxVal = arr[i];
			}
		}
		System.out.println("Maximum value is: " +maxVal);
	}
}
