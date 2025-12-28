package com.java.infosys.revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindMajorityElement {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int arr[] = new int[n];
	for(int i=0; i<n; i++) {
		arr[i] = scan.nextInt();
	}
	int res = findMajority(arr, n);
	if(res == -1) {
		System.out.println("No Majority element found.");
	} else {
		System.out.println("Majotiry element is:" +res);
	}
	scan.close();
	}
	
	public static int findMajority(int[] arr, int n) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num: arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
			if(map.get(num)> n/2) {
				return num;
			}
		}
		return -1;
	}
}
