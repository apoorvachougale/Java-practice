package com.java.hashset.demo;

import java.util.Objects;

public class Student {
	int roll;
	String name;
	
	void introduce() {
		System.out.println("Student roll: " +roll+ " and name is: " +name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Student s = (Student) obj;
		return roll == s.roll && name.equals(s.name);
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(name, roll);
	}
}
