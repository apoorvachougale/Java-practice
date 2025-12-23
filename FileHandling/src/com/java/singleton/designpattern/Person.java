package com.java.singleton.designpattern;

public class Person {

	private static Person p = null;
	String name;
	int age;
	String gender;
	private Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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
	
	@SuppressWarnings("unused")
	public static Person getInstance(String name, int age, String gender) {
		if(p==null) {
			p = new Person(name, age, gender);
		}
		
		return p;
	}
	
}
