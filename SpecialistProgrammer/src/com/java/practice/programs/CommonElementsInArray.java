package com.java.practice.programs;
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

public class CommonElementsInArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Ask user for first input array
	        ArrayList<Integer> arr1 = new ArrayList<>();
	        
	        while(scanner.hasNextInt()) {
	            arr1.add(scanner.nextInt());
	        }
	        // TODO: Ask user for second input array
	        ArrayList<Integer> arr2 = new ArrayList<>();
	        while(scanner.hasNextInt()){
	            arr2.add(scanner.nextInt());
	        }
	        // TODO: Find and print distinct common elements
	       
	       HashSet<Integer> set = new HashSet<>(arr1);
	       set.addAll(arr2);

	        HashSet<Integer> common = new HashSet<>(arr1);
	        common.retainAll(arr2);
	        System.out.println("Common Elements: " +common);
	        scanner.close();
	    }
}
