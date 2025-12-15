package com.java.stack.intro;

public class StacksInArray {
	int size;
	int arr[];
	public StacksInArray(int size) {
		
		this.size = size;
		this.arr = new int[size];
	}
	
	int top = -1;
	public void add(int value) {
		top++;
		if(top>arr.length-1) {
			System.out.println("Stack is full! Cannot insert the value");
		} else {
			arr[top] = value;
			System.out.println("Element " +arr[top]+ " is added to the stack");
		}
	}
	
	public void remove() {
		int top = arr.length-1;
		if(top == -1) {
			System.out.println("Stack is empty. No value to be removed.");
		} else {
			System.out.println("Element removed is: " +arr[top]);
			arr[top] = 0;
			top--;
		}
	}
	
	public void display() {
		int top = arr.length-1;
		if(top==-1) {
			System.out.println("Stack is empty. No element to display.");
		}
		else {
		System.out.print("[ ");
		for(int i=top; i>=0; i--) {
			System.out.print(arr[i]+ " ");
			top--;
		}
		System.out.print("]");
		}
	}
	
}
