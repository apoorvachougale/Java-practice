package com.java.infosys.revision;

import java.util.Scanner;

public class ReverseArrayElements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		int revArr[] = new int[arr.length];
		int index = 0;
		for(int i=arr.length-1; i>=0; i--) {
			revArr[index] = arr[i];
			index++;
		}
		for(int i=0; i<revArr.length; i++) {
			System.out.print(revArr[i]+ " ");
		}
		scan.close();
	}
}
