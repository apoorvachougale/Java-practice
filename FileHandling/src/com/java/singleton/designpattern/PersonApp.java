package com.java.singleton.designpattern;

public class PersonApp {
	public static void main(String[] args) {
		Person p1 = Person.getInstance("Apoorva", 25, "Female");
		Person p2 = Person.getInstance("Vaishu", 25, "Female");
		Person p3 = Person.getInstance("Nambi", 25, "Female");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
