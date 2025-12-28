package com.java.infosys.revision;

import java.util.Scanner;

public class DescendingOrderCharm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int res = findSpellCount(arr);
		System.out.println("The number of spell required is:" +res);
	}
	
	public static int findSpellCount(int arr[]) {
		
		int res =0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i+1]>arr[i]) {
				res = res+ arr[i+1] - arr[i];
				arr[i+1] = arr[i];
			}
		}
		return res;
	}
}
