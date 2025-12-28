package com.java.practice.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapStudentDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, String> std = new HashMap<>();
		
		System.out.println("Enter number of students: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name: ");
			String name = sc.nextLine();
			
			std.put(id, name);
		}
		
		Iterator<Integer> id = std.keySet().iterator();
		while(id.hasNext()) {
			System.out.println(id.next());
		}
		
		Iterator<String> name = std.values().iterator();
		while(name.hasNext()) {
			System.out.println(name.next());
		}
		
		Iterator<Map.Entry<Integer, String>> pairs = std.entrySet().iterator();
		
		while(pairs.hasNext()) {
			Map.Entry<Integer, String> entry = pairs.next();
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}
		sc.close();
	}
}
