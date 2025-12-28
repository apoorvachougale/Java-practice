package com.java.collection.demo;

import java.util.*;

public class GroupAnagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String inputArr[] = new String[n];
		for(int i=0; i<n; i++) {
			inputArr[i] = scan.next();
		}
		
		List<List<String>> res = groupAnagrams(inputArr);
		for(List<String> val: res) {
			System.out.println(val);
		}
		scan.close();
	}

	private static List<List<String>> groupAnagrams(String[] inputArr) {
		Map<String, List<String>> map = new HashMap<>();
		
		for(String str: inputArr) {
			char arr[] = str.toCharArray();
			Arrays.sort(arr);
			String key = new String(arr);
			
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(str);
		}
		return new ArrayList<>(map.values());
	}
}
