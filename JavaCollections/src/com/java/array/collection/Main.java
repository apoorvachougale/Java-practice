package com.java.array.collection;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String input = sc.nextLine();
	String res = input.replaceAll("\\d", "#");
	String res1 = input.replaceAll("[0-9]", "#");
	System.out.println(res);
	System.out.println(res1);
	LinkedList<Integer> ll = new LinkedList<>();
	ll.containsAll(ll);
	sc.close();
}
}
