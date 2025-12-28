package com.java.practice.programs;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInJava {
	public static void main(String[] args) {
		
		//Arrays methods
		// Arrays.sort, Arrays.binarySearch(arr, value)
		// Arrays.fill(arr, start_index, end_index, ValueToBeReplaced)
		//Arrays.equals(arr1, arr2)
		//Arrays.copyOf(arr, newLength)
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter array elements:");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Sorted array is: " +Arrays.toString(arr));
		
		Arrays.binarySearch(arr, 79);
		
		int newarr[] = Arrays.copyOf(arr, 6);
		System.out.println("Copied Array: " + Arrays.toString(newarr));

		Arrays.fill(newarr, 4, 6, 0);
		System.out.println("After fill: " +Arrays.toString(newarr));
		scan.close();
	}
}
