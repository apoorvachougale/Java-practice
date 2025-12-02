package com.java.oopconcepts;

public class CourseApp {
	public static void main(String[] args) {
		CourseDetails cd;
		cd = new CourseDetails();
		
		cd.c_id = 2;
		cd.c_name = "Java";
		cd.duration = 2;
		cd.mentor = "Punith";
		cd.timings = "4.45 pm";
		
		cd.start();
		cd.learn();
		cd.end();
	}
}
