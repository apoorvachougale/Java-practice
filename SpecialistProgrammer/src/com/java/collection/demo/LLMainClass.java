package com.java.collection.demo;

public class LLMainClass {
	public static void main(String[] args) {
		LinkedListOperations dll = new LinkedListOperations();
		
		dll.insertRear(25);
		dll.insertRear(50);
		dll.insertRear(75);
		dll.insertRear(150);
		dll.insertFront(100);
		dll.insertFront(175);
		dll.insertFront(125);
		dll.displayForward();
		
//		dll.deleteFront();
//		dll.displayForward();
//		dll.deleteRear();
//		dll.displayForward();
		System.out.println(dll.getFirst());
		System.out.println(dll.getLast());
		System.out.println(dll.getAtIndex(2));
		
	}
}
