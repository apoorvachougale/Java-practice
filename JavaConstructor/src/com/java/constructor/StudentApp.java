package com.java.constructor;

public class StudentApp {
	public static void main(String[] args) {
		Student std = new Student(12, "Arun", 79);
		System.out.println(std.id+ " " + std.name+ " " + std.marks);
		
		Student copyconstructor = new Student(std);
		System.out.println(copyconstructor.id+ " " + copyconstructor.name+ " " +copyconstructor.marks);
	}
}
