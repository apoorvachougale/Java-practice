package com.java.practice.programs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDequeEmpty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of customers
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline
        
        // Create an ArrayDeque to store customer names
        ArrayDeque<String> deque = new ArrayDeque<>();
        // Add customers to the deque
        for (int i = 0; i < n; i++) {
            deque.addLast(sc.nextLine());
        }
        
        // Remove all customers from the deque
        // Your code to remove customers goes here
        for(int i=0; i<n; i++){
            deque.removeLast();
        }
        
        System.out.println(deque.isEmpty());
        // Check if the deque is empty
        // Your code to check if the deque is empty goes here
    }
}