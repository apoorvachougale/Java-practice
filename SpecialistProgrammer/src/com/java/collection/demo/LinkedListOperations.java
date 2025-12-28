package com.java.collection.demo;

public class LinkedListOperations {
	class Node {
		Node prevLink;
		int data;
		Node nextLink;
		
		Node(int data) {
			this.data=data;
			this.prevLink=null;
			this.nextLink=null;
		}
	}
	
	Node head;
	
	public void insertFront(int element) {
		Node new_node = new Node(element);
		if(head==null) {
			head = new_node;
		} else {
			new_node.nextLink=head;
			head.prevLink=new_node;
			head = new_node;
		}
	}
	
	public void insertRear(int element) {
		Node new_node = new Node(element);
		if(head==null) {
			head = new_node;
		} else {
			Node temp = head;
			while(temp.nextLink!=null) {
				temp = temp.nextLink;
			}
			temp.nextLink=new_node;
			new_node.prevLink = temp;
		}
	}
	
	public void deleteFront() {
		if(head==null) {
			System.out.println("List is empty. Cannot delete");
		} else if(head.nextLink==null) {
			System.out.println("Deleted element is: " +head.data);
			head=null;
		} else {
			System.out.println("Deleted element is: " +head.data);
			head = head.nextLink;
			head.prevLink = null;
			
		}
	}
	
	public void deleteRear() {
		if(head==null) {
			System.out.println("List is empty. Cannot delete");
		} else if(head.nextLink==null) {
			System.out.println("Deleted element is: " +head.data);
			head=null;
		} else {
			Node temp = head;
			while(temp.nextLink.nextLink!=null) {
				temp = temp.nextLink;
			}
			System.out.println("deleted element is: "+temp.nextLink.data);
			temp.nextLink=null;
			
		}
	}
	
	public void displayForward() {
		if(head==null) {
			System.out.println("List is empty.");
		} else {
			Node temp = head;
			System.out.print("Elements are: ");
			while(temp!=null) {
				System.out.print(temp.data+"->");
				temp = temp.nextLink;
			}
			System.out.println();
		}
	}
	
	public int getFirst() {
		if(head==null) {
			System.out.println("List is Empty");
			return -1;
		}
		return head.data;	
	}
	
	public int getLast() {
		if(head==null) {
			System.out.println("List is empty");
			return -1;
		} else {
			Node temp = head;
			while(temp.nextLink!=null) {
				temp = temp.nextLink;
			}
			return temp.data;
		}
	}
	
	public int getAtIndex(int index) {
		if(index<0) {
			System.out.println("Invalid index");
			return -1;
		}
		if(head==null) {
			System.out.println("List is empty");
			return -1;
		} else {
			Node temp = head;
			int count =0;
			while(temp!=null) {
				if(index==count) {
					return temp.data;
				}
				temp = temp.nextLink;
				count++;
			}
			
		}
		System.out.println("Index not found. Out of bound exception.");
		return -1;
	}
	
	boolean hasLoop() {
		Node slow = head;
		Node fast = head;
		while(fast!= null && fast.nextLink!=null) {
			slow= slow.nextLink;
			fast= fast.nextLink.nextLink;
			
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
}
