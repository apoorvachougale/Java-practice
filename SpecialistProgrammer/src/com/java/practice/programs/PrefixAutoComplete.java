package com.java.practice.programs;
import java.util.*;
public class PrefixAutoComplete {

		public static TreeSet<String> byPrefix(TreeSet<String> set, String prefix){
			TreeSet<String> res = new TreeSet<>();
			for(String x: set) {
				if(x.startsWith(prefix)) {
					res.add(x);
				}
			}
			return res;
		}
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			TreeSet<String> dict = new TreeSet<>();
			
			System.out.print("How many words?");
			int n = Integer.parseInt(scan.nextLine());
			
			for(int i=0; i<n; i++) {
				dict.add(scan.nextLine().trim());
			}
			System.out.println("Enter prefix:");
			String p = scan.nextLine();
			
			SortedSet<String> matches = byPrefix(dict, p);
			System.out.println("Matches" +(matches.isEmpty()? "None" : matches));
			
			scan.close();
		}
		
		
		
		
		
}
