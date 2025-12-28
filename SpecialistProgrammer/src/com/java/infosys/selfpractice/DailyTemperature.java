package com.java.infosys.selfpractice;

import java.util.Scanner;

public class DailyTemperature {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
     int temperatures[] = new int[n];
     
     for (int i = 0; i < n; i++) {
         temperatures[i] = scanner.nextInt();
     }
     int[] result = dailyTemperatures(temperatures);
     for (int r : result) {
         System.out.print(r + " ");
     }
     scanner.close();
	}
     
     public static int[] dailyTemperatures(int arr[]) {
    	 int res[] = new int[arr.length];
    	 for(int i=0; i<arr.length; i++) {
    		 for(int j=i+1; j<arr.length; j++) {
    			 if(arr[j]>arr[i]) {
    				 res[i] = j-i;
    				 break;
    			 } else {
    				 res[i] = 0;
    			 }
    		 }
    	 }
    	 
    	 return res;
     }
}





