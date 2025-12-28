package com.java.practice.programs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class AlternativeCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reorganizeString(s));
    }

    public static String reorganizeString(String s) {
        int n = s.length();
        int freq[] = new int[26];
        
        for(char c: s.toCharArray()) {
        	freq[c-'a']++;
        }
        
        //find char with maximum freq
        int maxCount =0, maxChar=0;
        for(int i=0; i<26; i++) {
        	if(freq[i]>maxCount) {
        		maxCount = freq[i];
        		maxChar = i;
        	}
        }
        
        //if maxFreq>(n+1)/2, not possible
        if(maxCount>(n+1)/2) {
        	return "";
        }
        char[] res = new char[n];
        int idx =0;
        
        while(freq[maxChar]>0) {
        	res[idx] = (char)(maxChar+'a');
        	idx +=2;
        	freq[maxChar]--;
        }
        
        for(int i=0; i<26; i++) {
        	while(freq[i]>0) {
        		if(idx >=n) {
        			idx = 1;
        		}
        		res[idx]= (char)(i+'a');
        		idx +=2;
        		freq[i]--;
        	}
        }
        return new String(res);
    }
}