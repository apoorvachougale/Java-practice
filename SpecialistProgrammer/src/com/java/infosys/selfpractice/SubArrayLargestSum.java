package com.java.infosys.selfpractice;

import java.util.Scanner;

public class SubArrayLargestSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int res = maxSumSubArray(arr);
		System.out.println(res);
	}

	public static int maxSumSubArray(int[] arr) {

		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			int subArrSum = 0;
			for(int j=i; j<arr.length; j++) {
				subArrSum += arr[j];
				if(maxSum < subArrSum) {
					maxSum = subArrSum;
				}
			}
		}
		return maxSum;
	}
}
