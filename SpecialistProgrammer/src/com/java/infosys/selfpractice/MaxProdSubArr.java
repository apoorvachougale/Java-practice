package com.java.infosys.selfpractice;

import java.util.Scanner;

public class MaxProdSubArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(maxProduct(nums));
		
	}
	
	public static int maxProduct(int arr[]) {
		
		int maxProduct = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			int subProd=1;
			for(int j=i; j<arr.length; j++) {
				subProd  *= arr[j];
				if(subProd > maxProduct) {
					maxProduct = subProd;
				}
			}
		}
		return maxProduct;
	}
}
