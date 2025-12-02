package com.java.oopconcepts;

public class CourseDetails {
	int c_id;
	String c_name;
	String mentor;
	String timings;
	int duration;
	
	void start() {
		System.out.println(c_name+ " class will be started by the mentor: " +mentor+ " at " +timings);
	}
	
	void learn() {
		System.out.println("Student will learn the course: "+c_name);
	}
	
	void end() {
		System.out.println(c_name+ " class will end in " +duration+ " hours.");
	}
}
