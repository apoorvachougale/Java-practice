package com.java.infosys.selfpractice;

import java.util.Scanner;

public class PeakElementArr {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int res = findPeak(arr);
		if(res != -1) {
			System.out.println("Peak is found at index: " +res);
		} else {
			System.out.println("There is no peak element");
		}
		sc.close();
	}
	
	public static int findPeak(int[] arr) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = low +(high-low)/2;
			
			boolean left = (mid==0) || arr[mid]>arr[mid-1];
			boolean right = (mid == arr.length-1) || arr[mid]>arr[mid+1];
			
			if(left && right) {
				return mid;
			} else if(mid>0 && arr[mid]<arr[mid+1]) {
				low = mid+1;
			} else {
				high = mid-1;
			}
		}
		return -1;
	}
	
}
