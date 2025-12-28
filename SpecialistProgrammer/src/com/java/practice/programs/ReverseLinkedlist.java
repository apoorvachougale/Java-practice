package com.java.practice.programs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedlist {
public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    // Read the number of songs
	    int n = sc.nextInt();
	    LinkedList<String> playlist = new LinkedList<>();
	    for(int i=0; i<n; i++) {
	    	playlist.add(sc.nextLine());
	    }
	    reverseLinkedList(playlist);
	    sc.close();
	 }
	    
	    // Function to reverse the linked list
	public static void reverseLinkedList(LinkedList<String> playlist) {
	   LinkedList rev = new LinkedList<>();
	        for(int i = playlist.size()-1; i>=0; i--) {
	            rev.add(playlist);
	        }
	        
	}
}
