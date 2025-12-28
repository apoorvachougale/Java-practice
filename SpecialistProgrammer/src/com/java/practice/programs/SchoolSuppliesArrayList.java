package com.java.practice.programs;
import java.util.ArrayList;
import java.util.*;

public class SchoolSuppliesArrayList {
	    public static void main(String[] args) {
	        // Create an ArrayList to store school supplies
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        String arr[] = sc.nextLine().split(" ");
	        ArrayList<String> al = new ArrayList<>();

	        for(int i=0; i<n; i++) {
	            al.add(arr[i]);
	        }
	        // Read input for the number of items
	        ArrayList<String> al2 = new ArrayList<>();
	        int r = sc.nextInt();
	        sc.nextLine();
	        String removeItem[] = sc.nextLine().split(" ");
	        for(int i=0; i<r; i++) {
	            al2.add(removeItem[i]);
	        }
	        // Add items to the school supplies list
	        for(int i=0; i<al.size(); i++) {
	            if(al.contains(al2)) {
	                al.remove(i);
	            }
	        }
	        for(int i=0; i<al.size(); i++) {
	            System.out.print(al.get(i));
	        }
	        sc.close();
	}
}
