package com.java.serialization.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeApp {
	public static void main(String[] args) throws IOException {
		Employee emp = new Employee(124, "Apoorva",99000);
		System.out.println("Id: "+emp.id+ " Name: " +emp.name+ " salary: " +emp.salary );
		
		String path = "C:\\Users\\ASdmin\\Desktop\\mydb1\\student.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(emp);
		
		oos.close();
	}
}
