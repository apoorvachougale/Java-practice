package com.java.selective.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentDeserialization {
	public static void main(String[] args) {
		try {
			String path = "C:\\Users\\ASdmin\\Desktop\\mydb1\\student.txt";
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student std = (Student) ois.readObject();
			System.out.println(std);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
