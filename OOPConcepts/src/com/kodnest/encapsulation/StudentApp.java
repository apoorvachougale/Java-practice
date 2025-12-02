package com.kodnest.encapsulation;

public class StudentApp {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setId(101);
		s.setName("Arun");
		s.setMarks(89);
		
		System.out.println("Student Id is: " +s.getId());
		System.out.println("Student name is: " +s.getName());
		System.out.println("Student marks is: " +s.getMarks());
	}
}
