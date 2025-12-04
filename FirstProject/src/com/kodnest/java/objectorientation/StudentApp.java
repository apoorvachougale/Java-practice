package com.kodnest.java.objectorientation;

public class StudentApp {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.id = 123;
		s1.name="Ramesh";
		s1.marks = 57;
		
		s2.id = 234;
		s2.name = "Suresh";
		s2.marks = 87;
		
		s1.eat();
		s1.sleep();
		s1.study();
		
		s2.eat();
		s2.sleep();
		s2.study();
	}
}
