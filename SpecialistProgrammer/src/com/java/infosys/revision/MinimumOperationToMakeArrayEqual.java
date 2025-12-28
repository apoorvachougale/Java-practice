package com.java.infosys.revision;

import java.util.Scanner;

public class MinimumOperationToMakeArrayEqual {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int res = minOperations(arr);
		System.out.println(res);
	}
	public static int minOperations(int[] arr) {
		int n = arr.length;
		int target = arr[n/2];
		int ops = 0;
		for(int num: arr) {
			ops += Math.abs(num-target);
		}
		return ops/2;
	}
}
