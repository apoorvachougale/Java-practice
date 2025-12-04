package com.java.array.intro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int arr[][][] = new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                for(int k=0; k<arr[i][j].length; k++){
                    arr[i][j][k]= scan.nextInt();
            }
            }
        }
        // TODO: Populate the array with user input
        System.out.println("3D Array:");
        
        for(int i=0; i<arr.length; i++){
            System.out.println("Layer "+(i+1)+":");
            for(int j=0; j<arr[i].length;j++){
                for(int k=0; k<arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
                
            }
        }
        // TODO: Calculate and print sum of each 2D layer
        
        for(int i=0; i<arr.length; i++) {
        	int sum=0;
            for(int j=0; j<arr[i].length; j++) {
                for(int k=0; k<arr[i][j].length; k++){
                	sum=sum+arr[i][j][k];
                }
           
            }
            System.out.println("Sum of layer "+(i+1)+":"+sum);
        }
       
        
        
        scan.close();
    }
}