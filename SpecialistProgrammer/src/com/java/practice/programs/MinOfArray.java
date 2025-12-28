package com.java.practice.programs;
import java.util.Scanner;

public class MinOfArray {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // TODO: Ask user for array size and create the array
	        int n = scanner.nextInt();
	        int arr[] = new int[n];
	        
	        // TODO: Populate the array with user input
	        for(int i=0; i<arr.length; i++){
	            arr[i] = scanner.nextInt();
	        }
	        
	        // TODO: Find the minimum value in the array
	        int min_val = arr[0];
	        for(int i=0; i<arr.length-1; i++){
	            for(int j=i+1; j<arr.length; j++){
	                if (arr[i]>arr[j]){
	                    min_val = arr[j];
	                }
	            }
	        }
	        // TODO: Print the original array and the minimum value
	        System.out.print("Array: [");
	        for(int i=0; i<arr.length; i++){
	            System.out.print(arr[i]);
	            if(i!=arr.length-1){
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	        System.out.println("Minimum value: " +min_val);
	        scanner.close();
	    }
}
