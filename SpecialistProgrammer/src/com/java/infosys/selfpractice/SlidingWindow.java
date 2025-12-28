package com.java.infosys.selfpractice;

import java.util.Scanner;

public class SlidingWindow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		int testcase = 0;
		
		while(testcase<testcases) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			String str = sc.next();
			
			int min_color = Integer.MAX_VALUE;
			int count =0;
			
			for(int i=0; i<k; i++) {
				if(str.charAt(i)=='W') {
					count++;
				}
			}
			min_color = count;
			
			//slide the window
			for(int i=k; i<n; i++) {
				if(str.charAt(i-k)=='W') count--;
				if(str.charAt(i)=='W') count++;
				min_color = Math.min(count, min_color);
			}
			System.out.println(min_color);
			testcase++;
		}
		sc.close();
	}
}
