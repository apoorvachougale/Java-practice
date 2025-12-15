package com.java.stack.intro;


public class StackMainMethod {
	public static void main(String[] args) {
		
		StacksInArray s = new StacksInArray(5);
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		
		s.remove();
		
		s.display();
		
	}
}
