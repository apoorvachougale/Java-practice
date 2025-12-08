package com.java.array.collection;

import java.util.ArrayList;

public class CreateArrayDP {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add(100);
		arr.add(300);
		arr.add(500);
		arr.add(700);
		arr.add(200);
		arr.add(20.5);
		arr.add("Appu");
		arr.add("Gouri");
		
		System.out.println(arr);
		System.out.println(arr.contains(300));
		System.out.println(arr.get(4));
		System.out.println(arr.isEmpty());
		System.out.println(arr.lastIndexOf(arr));
		System.out.println(arr.remove(6));
		System.out.println(arr.size());
		System.out.println(arr.set(3, 777));
		
		System.out.println(arr);
	}
	
}
