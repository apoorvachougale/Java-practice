package com.java.hashset.demo;

import java.util.HashSet;

public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.roll = 1208;
		s1.name="Apoorva";
		
		Student s2 = new Student();
		s2.roll = 1209;
		s2.name="Purva";
		
		HashSet<Student> hs = new HashSet<>();
		hs.add(s1);
		hs.add(s2);
	}

	
}
