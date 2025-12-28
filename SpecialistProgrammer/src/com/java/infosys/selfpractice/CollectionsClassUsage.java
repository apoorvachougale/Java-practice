package com.java.infosys.selfpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsClassUsage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		System.out.println("Enter arr1 elements:");
		for(int i=0; i<n; i++) {
			al.add(sc.nextInt());
		}
		
		ArrayList<Integer> complist = new ArrayList<>();
		System.out.println("Enter arr2 elements");
		for(int i=0; i<n; i++) {
			complist.add(sc.nextInt());
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, 25));
		Collections.reverse(complist);
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
		Collections.rotate(complist, 3);
		Collections.swap(complist, 2, 4);;
		System.out.println(Collections.disjoint(al, complist));
		System.out.println(Collections.frequency(al, 25));
		ArrayList<String> al3 = new ArrayList<>();
		Collections.nCopies(n, null);
		Collections.copy(null, null);
		
		sc.close();
	}
}
