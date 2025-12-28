package com.java.collection.demo;
import java.util.Scanner;

class Node {
	    int val;
	    Node prev;
	    Node next;
	    Node(int val) {
	        this.val = val;
	        this.prev = null;
	        this.next = null;
	    }
	}

public class TrainCarriages {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String line = sc.nextLine().trim();
	        int target = Integer.parseInt(sc.nextLine().trim());

	        String[] parts = line.split(",");
	        int[] arr = new int[parts.length];
	        for (int i = 0; i < parts.length; i++) {
	            arr[i] = Integer.parseInt(parts[i].trim());
	        }
	        // write your code here
	        Node head = buildList(arr);
	        head = removeCarriages(head, target); 
	        printList(head);

	        sc.close();
	    }

	    public static Node removeCarriages(Node head, int target) {
	        // write your code here
	    	if (head == null) {
	            System.out.println("List is empty");
	            return null;
	        }

	    	
	        while (head.val == target) {
	        	if(head!=null) {
	        		head = head.next;
	        		if (head != null) head.prev = null;
	        	}
	        }

	        if (head == null) return null;

	        // Remove target nodes from middle and end
	        Node temp = head;
	        while (temp != null) {
	            if (temp.val == target) {
	                if (temp.prev != null) {
	                    temp.prev.next = temp.next;
	                }
	                if (temp.next != null) {
	                    temp.next.prev = temp.prev;
	                }
	            }
	            temp = temp.next;
	        }

	        return head;
	    }

	    // Build a doubly linked list from an array
	    public static Node buildList(int[] arr) {
	        // write your code here
	        if(arr.length==0) {
	        	return null;
	        }
	        Node head = new Node(arr[0]);
	        Node temp=head;
	        for(int i=1; i<arr.length; i++) {
	        	Node newNode= new Node(arr[i]);
	        	temp.next=newNode;
	        	newNode.prev=temp;
	        	temp = newNode;
	        }
	        
	        return head;
	    }

	    // Print doubly linked list values comma separated
	    public static void printList(Node head) {
	        // write your code here
	    	if(head==null) {
	    		System.out.println("List is empty");
	    	} else {
	    		Node temp = head;
	    		while(temp!=null) {
	    			System.out.print(temp.val + " ");
	    			temp= temp.next;
	    		}
	    	}
	    }
}
