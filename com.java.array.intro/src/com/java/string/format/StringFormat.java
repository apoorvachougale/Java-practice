package com.java.string.format;

import java.text.MessageFormat;

public class StringFormat {
 public static void main(String[] args) {
	System.out.printf("Hello %s. How are you? ", "Apoorva");
	System.out.println();
	
	String str1 = "%s was good today, I have learnt %s";
	String finalstr = String.format(str1, "Class", "Fomatting");
	System.out.println(finalstr);
	
	String st = "Hello {0} I am going to {1} will you come with me?";
	String formatstr = MessageFormat.format(st, "Chinnu", "Maldives");
	System.out.println(formatstr);
	
}
}
