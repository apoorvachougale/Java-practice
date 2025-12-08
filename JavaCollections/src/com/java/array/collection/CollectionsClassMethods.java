package com.java.array.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassMethods {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
	}
}
