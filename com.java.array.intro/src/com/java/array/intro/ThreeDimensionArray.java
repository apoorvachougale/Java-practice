package com.java.array.intro;

import java.util.Scanner;

public class ThreeDimensionArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][][] = new int[3][2][2];
		//0 0
		//  1
		//1
		//2
		for(int i=0; i< arr.length; i++) {
			for(int j=0;j < arr[i].length; j++) {
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.println("Enter  " +i+ " school " +j+ "th class student " + k+ " marks: ");
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		
		System.out.println("Student marks are: ");
		for(int i=0; i < arr.length; i++) {
			System.out.println("{");
			for(int j=0; j< arr[i].length; j++) {
				System.out.print("[");
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.print(arr[i][j][k]);
					if(k!= arr[i][j].length-1) {
						System.out.print(" , ");
					}
				}
				System.out.println("], ");
			}
			System.out.println("}");
			
		}
		scan.close();
	}

}

