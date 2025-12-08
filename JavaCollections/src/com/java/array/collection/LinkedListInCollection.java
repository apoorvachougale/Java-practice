package com.java.array.collection;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListInCollection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList ll = new LinkedList();
		
		for(int i=0; i<ll.size(); i++) {
			int val = sc.nextInt();
			ll.add(val);
		}
		System.out.println(ll);
		
		//Creating stack using linked list
		System.out.println("Creating stack using linked list:");
		LinkedList stack = new LinkedList();
		
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		
		System.out.println(stack);
		
		System.out.println("Element removed from the stack is: " +stack.pop());
		System.out.println("Element removed from the stack is: " +stack.pop());
		System.out.println("Element removed from the stack is: " +stack.pop());
		
		
		//Creating Queue using linked list
		System.out.println("Creating Queue using linked list: ");
		LinkedList queue = new LinkedList();
		
		queue.add(9);
		queue.add(99);
		queue.add(999);
		queue.add(9999);
		
		System.out.println(queue);
		
		System.out.println("Element removed from the Queue is: " +queue.remove());
		System.out.println("Element removed from the Queue is: " +queue.remove());
	}
}
