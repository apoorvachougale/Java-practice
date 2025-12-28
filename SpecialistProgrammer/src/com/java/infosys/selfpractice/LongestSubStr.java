package com.java.infosys.selfpractice;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubStr {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		int res = longestSubstringLength(str);
		System.out.println("Longest substring length is: " +res);
		scan.close();
	}
	
	public static int longestSubstringLength(String str) {
		int maxLength = 0;
		int left = 0;
		
		HashSet<Character> alreadySeen = new HashSet<>();
		
		for(int right=0; right<str.length(); right++) {
			char current = str.charAt(right);
			while(alreadySeen.contains(current)) {
				alreadySeen.remove(str.charAt(left));
				left++;
			}
			alreadySeen.add(current);
			
			maxLength = Math.max(maxLength, right-left+1);
		}
		return maxLength;
	}
}
