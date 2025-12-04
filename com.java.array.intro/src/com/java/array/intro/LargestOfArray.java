package com.java.array.intro;

import java.util.Scanner;

public class LargestOfArray {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter length of array: ");
	int []arr = new int[scan.nextInt()];
	System.out.println("Enter " +arr.length+ " array elements: ");
	for(int i=0; i<arr.length;i++) {
		arr[i]= scan.nextInt();
	}
	
	int maximum_val=arr[0];
	for(int i=1; i<arr.length; i++) {
		if(arr[i]> maximum_val) {
			maximum_val = arr[i];
			
		} 
	}

	
	System.out.println(maximum_val+ " ");
	
	
	scan.close();
}
}
