package com.java.practice.programs;

import java.util.Scanner;

public class LargestRectHistogram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the array size: ");
		int n = scan.nextInt();
		System.out.println("Enter array elements: ");
		int heights[] = new int[n];
		for(int i=0; i<n; i++) {
			heights[i] = scan.nextInt();
		}
		
		int res = largestRectangleArea(heights);
		System.out.println(res);
		
		scan.close();
	}

	public static int largestRectangleArea(int[] heights) {
		int n = heights.length;
		int maxArea = 0;
		
		for(int i=0; i<n; i++) {
			int minHeights = heights[i];
			for(int j=i; j<n; j++) {
				minHeights = Math.min(minHeights, heights[j]);
				int width = j - i +1;
				int area = width * minHeights;
				maxArea = Math.max(maxArea, area);
			}
		}
		return maxArea;
	}
}
