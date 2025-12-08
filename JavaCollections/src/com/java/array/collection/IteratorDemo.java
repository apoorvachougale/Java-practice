package com.java.array.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class IteratorDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		
		Iterator itr = al.iterator();
		System.out.print("[");
		int count = 0;
		while(itr.hasNext()) {
			System.out.print(itr.next());
			if(count != al.size()-1) {
				System.out.print(", ");
			}
			count++;
		}
		System.out.println("]");
	}
	
}
