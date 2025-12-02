package com.kodnest.encapsulation;

public class Student {
	private int id;
	private String sName;
	private int std_marks;
	
	static int defId = 0;
	static String defStr = "XYZ";
	static int defMarks = 0;
	public void setId(int x) {
		if(x>0) {
			id = x;
		} else {
			id = defId++;
		}
		
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		if(name.length() != 0) {
				sName = name; 
		} else {
			sName = defStr;
		}
	}
	
	public String getName() {
		return sName; 
	}
	
	public void setMarks(int marks) {
		if(marks>0) {
		std_marks = marks;
		} else {
			std_marks = defMarks;
		}
	}
	public int getMarks() {
		return std_marks;
	}
}
