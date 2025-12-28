package com.java.infosys.revision;

import java.util.Scanner;

public class SubArrayProd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int res = maxProdOfSubArr(arr);
		System.out.println("Max product of Sub Array is: " +res);
		scan.close();
	}
	
	public static int maxProdOfSubArr(int arr[]) {
		
		int maxProd = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			int subArrProd = 1;
			for(int j=i; j<arr.length; j++) {
				subArrProd *= arr[j];
				maxProd = Math.max(maxProd, subArrProd);
			}
		}
		return maxProd;
	}
}
