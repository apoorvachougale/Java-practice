package com.java.array.intro;

import java.util.Scanner;

public class DoubleArrayDemo {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter length of the array: ");
	double[] arr= new double[scan.nextInt()];
	System.out.println("Enter 5 marks of student: ");
	for(int i=0; i <= arr.length-1; i++) {
		System.out.println("Enter marks of student: " +i);
		arr[i]=scan.nextDouble();
	}
	System.out.print("[");
	for(int i=0; i <= arr.length-1; i++) {
		System.out.print(arr[i]);
		if(i != arr.length-1) {
			System.out.print(", ");
		}
		}
	System.out.print("]");
	
	scan.close();
	}
}

