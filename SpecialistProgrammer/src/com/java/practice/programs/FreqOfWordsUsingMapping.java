package com.java.practice.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqOfWordsUsingMapping {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  HashMap<String, Integer> freq = new HashMap<>();
	  
	  System.out.print("Enter a sentence: ");
	  String[] words = sc.nextLine().toLowerCase().split("\\s+");
	  
	  for(String word : words) {
		  freq.put(word, freq.getOrDefault(word,0)+1);
	  }
	  
	  System.out.println("Frequencies of words: ");
	  for(Map.Entry<String, Integer> e: freq.entrySet()) {
		  System.out.println(e.getKey()+ "-->" +e.getValue());
	  }
	  
	  sc.close();
}
}
