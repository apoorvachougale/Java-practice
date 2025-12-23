package com.java.serialization.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserialization {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		String path = "C:\\Users\\ASdmin\\Desktop\\mydb1\\employee.txt";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp = (Employee) ois.readObject();
		System.out.println("Id: " +emp.id+ " Name: " +emp.name+ " Salary: "+emp.salary);
		
	}
}
