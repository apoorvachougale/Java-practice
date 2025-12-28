package com.java.practice.programs;
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
public class CommonArrayElements {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Ask user for first input array
	        int arr1[] = new int[scanner.nextInt()];

	        for(int i=0; i<arr1.length; i++){
	            arr1[i] = scanner.nextInt();
	        }
	        // TODO: Ask user for second input array
	        int arr2[] = new int[scanner.nextInt()];
	        for(int i=0; i<arr2.length; i++){
	            arr2[i] = scanner.nextInt();
	        }
	        // TODO: Find and print distinct common elements
	        for(int i=0; i<arr1.length; i++){
	            for(int j=0; j<arr2.length; j++){
	                if(arr1[i]==arr2[j]){
	                    System.out.print(arr1[i]+" ");
	                }
	            }
	        }
	        System.out.println("Loop ended");
	        
	        scanner.close();
	    }
	}
