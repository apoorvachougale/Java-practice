package com.java.infosys.revision;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonArrayElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1st user input
		String input1 = sc.nextLine();
		Scanner sc1 = new Scanner(input1);
		ArrayList<Integer> arr1 = new ArrayList<>();
		while(sc1.hasNextInt()) {
			arr1.add(sc1.nextInt());
		}
		
		String input2 = sc.nextLine();
		Scanner sc2 = new Scanner(input2);
		ArrayList<Integer> arr2 = new ArrayList<>();
		while(sc2.hasNextInt()) {
			arr2.add(sc2.nextInt());
		}
		
		Set<Integer> set = new HashSet<>(arr2);
		Set<Integer> res = new HashSet<>();
		for(Integer num: arr1) {
			if(set.contains(num)) {
				res.add(num);
			}
		}
		
		for(Integer val: res) {
			System.out.print(val+ " ");
		}
	}
}
