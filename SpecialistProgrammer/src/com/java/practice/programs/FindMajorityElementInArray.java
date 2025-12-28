package com.java.practice.programs;

import java.util.Scanner;

public class FindMajorityElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] =new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		int majorityIs = findMajority(arr, n);
		if(majorityIs != -1) {
			System.out.println("Majority element is: " +majorityIs);
		} else {
			System.out.println("Majority is not found");
		}
	}
	
	public static int findMajority(int[] arr, int n) {
		int candidate = arr[0], count = 0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]==candidate) {
				count++;
			} else {
				count--;
				if(count ==0) {
					candidate = arr[i];
					count = 1;
				}
			}
		}
		
		int c =0;
		for(int num : arr) {
			if(num == candidate) {
				c++;
			}
		}
		return (c > n/2) ? candidate : -1;
	}
}
