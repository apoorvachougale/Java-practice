package com.java.infosys.selfpractice;

import java.util.Scanner;

public class LargestProductSubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int res = maxProdSubArray(arr);
		System.out.println(res);
	}

	public static int maxProdSubArray(int arr[]) {
		
		int maxProd = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			int subProd = 1;
			for(int j=i; j<arr.length;j++) {
				subProd *= arr[j];
				if(maxProd<subProd) {
					maxProd = subProd;
				}
			}
			
		}
		return maxProd;
	}
}
