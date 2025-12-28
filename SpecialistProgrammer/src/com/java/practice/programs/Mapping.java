package com.java.practice.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapping {
	public static void main(String[] args) {
		//unordered pair to keys and values
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(24, "Appu");
		hm.put(8, "Asif");
		hm.put(34, "Arun");
		hm.put(25, "Ajay");
		
		System.out.println(hm);
		
		// Gives output in the order it is inserted
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(24, "Appu");
		lhm.put(8, "Asif");
		lhm.put(34, "Arun");
		lhm.put(25, "Ajay");
		
		System.out.println(lhm);
		
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(24, "Appu");
		tm.put(8, "Asif");
		tm.put(34, "Arun");
		tm.put(25, "Ajay");
		
		System.out.println(tm);
		
	}
}
