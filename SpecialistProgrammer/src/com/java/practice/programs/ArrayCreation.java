package com.java.practice.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayCreation {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//int arr[] = new int[size];
		//long arr[] = new long[size];
		//short arr[] = new short[size];
		//float arr[] = new float[size];
		//Float arr[] = new Float[size];
		//double arr[] = new double[size];
		
		//Creating a student array
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		Student stu[] = new Student[size];
		
		for(int i=0; i<stu.length; i++) {
			int id = Integer.parseInt(br.readLine());
			String name = br.readLine();
			int marks = Integer.parseInt(br.readLine());
			stu[i] = new Student(id, name, marks);
		}
		
		for(Student std : stu) {
			System.out.println(std+ " ");
		}
		
		Arrays.sort(stu);
		
		System.out.println("Student details after sorting: ");
		for(Student std: stu) {
			System.out.println(std+ " ");
		}
	}
}
