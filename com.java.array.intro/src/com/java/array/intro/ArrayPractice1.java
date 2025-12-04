package com.java.array.intro;

import java.util.Scanner;

public class ArrayPractice1 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter length of array: ");
	int []arr = new int[scan.nextInt()];
	System.out.println("Enter " +arr.length+ " array elements: ");
	for(int i=0; i<arr.length;i++) {
		arr[i]= scan.nextInt();
	}
	
	System.out.println("Enter the key to search: ");
	int key = scan.nextInt();
	for(int i=0; i<arr.length; i++) {
		if(key == arr[i]) {
			System.out.println("Key found at index " +i);
			return;
		}
	}
	System.out.println("Key not found.");
	
	scan.close();
}
}
