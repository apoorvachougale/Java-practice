package com.java.kodnest.practice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class PrimeNumber {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 
	 int num = Integer.MIN_VALUE;
	 num = Math.max(n, num);
	 System.out.println(num);
	 
	 TreeSet<Integer> ts = new TreeSet<>();
	 
	 String input[] = sc.nextLine().split(" ");
     int arr[] = new int[input.length];
     for(int i=0; i<input.length; i++) {
         arr[i] = Integer.parseInt(input[i]);
     }
}
}
