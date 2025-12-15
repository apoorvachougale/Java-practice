package com.java.treeset.intro;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // TODO: Read the number of elements (n)
	        int num = sc.nextInt();
	        sc.nextLine();
	        TreeSet<Integer> ts = new TreeSet<>();
	        // TODO: Create a TreeSet to store unique elements
	       String input[] = sc.nextLine().split(" ");
	        
	        // TODO: Read and add n integers to the TreeSet
	        for(int i=0; i<num; i++) {
	            int val = Integer.parseInt(input[i]);
	            ts.add(val);
	        }
	      
	        if(ts.isEmpty()) {
	            System.out.println("NO ELEMENTS");
	        } else {
	            for(int val: ts.descendingSet()) {
	                System.out.print(val+" ");
	            }
	        }
	        // TODO: Print the unique elements in ascending order
	        // TODO: If no elements, print "NO ELEMENTS"
	        
	        sc.close();
	}
}
