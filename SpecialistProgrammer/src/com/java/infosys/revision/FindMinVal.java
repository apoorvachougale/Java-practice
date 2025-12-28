package com.java.infosys.revision;

import java.util.Scanner;

public class FindMinVal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int min_val = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i]<min_val) {
				min_val = arr[i];
			}
		}
		System.out.println("Minimum value is: " +min_val);
		scan.close();
	}
}
