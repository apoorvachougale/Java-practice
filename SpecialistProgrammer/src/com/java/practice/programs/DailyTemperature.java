package com.java.practice.programs;
import java.util.*;
public class DailyTemperature {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int[] temperatures = new int[n];
	        for (int i = 0; i < n; i++) {
	            temperatures[i] = scanner.nextInt();
	        }
	        int[] result = dailyTemperatures(temperatures);
	        for (int r : result) {
	            System.out.print(r + " ");
	        }
	        scanner.close();
	    }

	    public static int[] dailyTemperatures(int[] temperatures) {
	        // Implement the logic here
	        int res[] = new int[temperatures.length];
	        
	        for(int i=0; i<temperatures.length; i++){

	            for(int j=i+1; j<temperatures.length; j++){
	                if(temperatures[j]>temperatures[i]){
	                    res[i] = j - i;
	                    break;
	                } else {
	                    res[i] = 0;
	                }
	            }
	        }
	        return res;
	}
}
