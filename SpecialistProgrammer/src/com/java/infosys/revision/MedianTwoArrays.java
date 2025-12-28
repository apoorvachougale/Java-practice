package com.java.infosys.revision;
import java.util.Scanner;

public class MedianTwoArrays {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int arr1[] = new int[n];
	
	for(int i=0; i<n; i++) {
		arr1[i] = scan.nextInt();
	}
	scan.nextLine();
	int m = scan.nextInt();
	int arr2[] = new int[m];
	for(int i=0; i<m; i++) {
		arr2[i] = scan.nextInt();
	}
	int[] merged = new int[n+m];
	int i=0, j=0, k=0;
	while(i<n && j<m) {
		if(arr1[i]<arr2[j])
			merged[k++] = arr1[i++];
		else 
			merged[k++] = arr2[j++];
	}
	while(i<n) {
		merged[k++]= arr1[i++];
	}
	while(j<m) {
		merged[k++] = arr2[j++];
	}
	scan.close();
  }
}
