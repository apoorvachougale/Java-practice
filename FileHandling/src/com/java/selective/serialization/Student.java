package com.java.selective.serialization;

import java.io.Serializable;

public class Student implements Serializable{

	int id;
	String name;
	transient int age;
	transient String gender;
	int marks;
	public Student(int id, String name, int age, String gender, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", marks=" + marks;
	}
	
	
}
