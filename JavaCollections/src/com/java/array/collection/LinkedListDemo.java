package com.java.array.collection;
import java.util.LinkedList;
import java.util.Scanner;

	public class LinkedListDemo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        // TODO: Read the number of books (n)
	        int n = sc.nextInt();
	        // TODO: Create a LinkedList to store book titles
	        LinkedList<String> ll = new LinkedList<>();
	        // TODO: Read and add n book titles to the LinkedList
	        for(int i=0; i<n; i++) {
	            ll.add(sc.next());
	        }
	        // TODO: Read the book title to search for
	        String str = sc.next();
	        String s="";
	        // TODO: Find and print the first and last occurrence indices
	        for(int i=0;i<n;i++) {
	        	if(ll.get(i).contains(str)) {
	        		s=s+i;
	        	}
	        }
	        if(s.length()>0) {
	        	System.out.println(s.charAt(0));
	        	System.out.println(s.charAt(s.length()-1));
	        }
	        sc.close();
	    }
}
