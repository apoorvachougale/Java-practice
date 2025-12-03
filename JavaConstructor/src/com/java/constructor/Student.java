package com.java.constructor;

public class Student {
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	//Copy constructor
	public Student(Student ref) {
		this.id = ref.id;
		this.name = ref.name;
		this.marks = ref.marks;
	}
	
}
