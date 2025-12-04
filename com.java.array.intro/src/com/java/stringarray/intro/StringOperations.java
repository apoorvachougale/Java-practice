package com.java.stringarray.intro;

public class StringOperations {
 public static void main(String[] args) {
	String s1 = "Apoorva Anil Chougale";
	System.out.println(s1);
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.length());
	System.out.println(s1.indexOf('i'));
	System.out.println(s1.charAt(13));
	System.out.println(s1.contains("v"));
	System.out.println(s1.contains("b"));
	System.out.println(s1.startsWith("A"));
	System.out.println(s1.startsWith("S"));
	System.out.println(s1.endsWith("e"));
	System.out.println(s1.endsWith("u"));
	System.out.println(s1.replace("o", "u"));
	System.out.println(s1.substring(7));
	System.out.println(s1.substring(8, 12));
	
	char arr[] = s1.toCharArray();
	System.out.print("[ ");
	for (char c : arr) {
		System.out.print(c+ " ");
	}
	System.out.print(" ]");
	
}
}
