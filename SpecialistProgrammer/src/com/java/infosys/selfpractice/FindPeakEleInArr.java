package com.java.infosys.selfpractice;

import java.util.Scanner;

public class FindPeakEleInArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		int peak = findPeakEle(arr);
		if(peak != -1) {
			System.out.println(peak);
		} else {
			System.out.println("No peak found");
		}
	}
	
	public static int findPeakEle(int arr[]) {
		
		if(arr.length==1) {
			return 0;
		}
		for(int i=0; i<arr.length; i++) {
			boolean leftCheck = (i==0) || arr[i] > arr[i-1];
			boolean rightCheck = (i==arr.length-1) || arr[i] > arr[i+1];
			
			if(leftCheck && rightCheck) {
				return i;
			}
		}
		return -1;
	}
}
