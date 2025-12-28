package com.java.infosys.revision;

import java.util.Scanner;

public class FindPeakElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int n = sc.nextInt();
		System.out.println("Enter arr elements: ");
		int num[] = new int[n];
		for(int i=0; i<n; i++) {
			num[i]= sc.nextInt();
		}
	
		int res = findPeakElement(num);
		System.out.println("Peak element is at index : " +res);
	}

	private static int findPeakElement(int[] num) {

		if(num.length==1) {
			return 0;
		}
		for(int i=0; i<num.length; i++) {
			boolean checkLeft = i==0 || num[i]>num[i-1];
			boolean checkRight = i == num.length-1 || num[i]>num[i+1];
			
			if(checkLeft && checkRight) {
				return i;
			}
		}
		return -1;
	}
}
