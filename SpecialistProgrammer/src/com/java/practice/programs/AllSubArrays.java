package com.java.practice.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllSubArrays {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of the array:");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Enter array elements");
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				for(int k=i; k<=j; k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}
}
