package com.java.practice.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee2DArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		int cols = Integer.parseInt(br.readLine());
		Employee emp[][] = new Employee[rows][cols];
		
		for(int i=0; i<rows; i++) {
			
			for(int j=0; j<cols; j++) {
				System.out.println("Enter details of employee position " +i+ ", " +j);
				System.out.println("Enter id:");
				int id = Integer.parseInt(br.readLine());
				System.out.println("Enter name:");
				String name = br.readLine();
				System.out.println("Enter dept:");
				String dept = br.readLine();
				System.out.println("Enter salary:");
				int salary = Integer.parseInt(br.readLine());
				
				emp[i][j] = new Employee(id, name, dept, salary);
			}
		}
		
		System.out.println("\nEmployee Records:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" +emp[i][j] + "]\t");
            }
            System.out.println();
        }
	}
}
