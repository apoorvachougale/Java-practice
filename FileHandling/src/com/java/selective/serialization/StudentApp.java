package com.java.selective.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentApp {
	public static void main(String[] args) {
		try {
			Student std = new Student(1208, "Apoorva", 25, "Female", 99);
			String path = "C:\\Users\\ASdmin\\Desktop\\mydb1\\student.txt";
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(std);
			
			fos.close();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
