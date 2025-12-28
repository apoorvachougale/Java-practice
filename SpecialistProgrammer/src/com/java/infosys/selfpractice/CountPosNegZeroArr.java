package com.java.infosys.selfpractice;

import java.util.Scanner;

public class CountPosNegZeroArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int positive = 0, negative = 0, zero = 0;
		for(int i=0; i<n; i++) {
			if(arr[i]>0) {
				positive++;
			} else if(arr[i]<0) {
				negative++;
			} else {
				zero++;
			}
		}
		System.out.println("Positive count: "+positive);
		System.out.println("Negative count: "+negative);
		System.out.println("Zero count: "+zero);
	}
}
