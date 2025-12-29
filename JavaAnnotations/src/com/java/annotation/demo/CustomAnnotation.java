package com.java.annotation.demo;

@validate(msg="Method for validation")
public class CustomAnnotation {
	int age;
	void validateAge(int age) {
		System.out.println("Age is " +age);
	}
	
}
