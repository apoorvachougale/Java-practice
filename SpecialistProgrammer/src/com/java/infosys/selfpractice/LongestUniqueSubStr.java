package com.java.infosys.selfpractice;

import java.util.HashSet;
import java.util.Scanner;

public class LongestUniqueSubStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int res = longestSubStr(str);
		System.out.println(res);
		
	}
	
	public static int longestSubStr(String str) {
		int maxlen = 0;
		int left = 0;
		
		HashSet<Character> alreadypresent = new HashSet<>();
		for(int right=0; right<str.length(); right++) {
			char current =str.charAt(right);
			
			while(alreadypresent.contains(current)) {
				alreadypresent.remove(str.charAt(left));
				left++;
			}
			alreadypresent.add(current);
			maxlen = Math.max(maxlen, right-left+1);
			}
		return maxlen;
	}
}
