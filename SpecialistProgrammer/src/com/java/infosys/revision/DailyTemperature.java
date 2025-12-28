package com.java.infosys.revision;

import java.util.Scanner;

public class DailyTemperature {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int temp[] = new int[n];
		for(int i=0; i<n; i++) {
			temp[i]=scan.nextInt();
		}
		int res[] = findDailyTemp(temp);
		for(int r: res) {
			System.out.print(r+ " ");
		}
		scan.close();
	}
	
	public static int[] findDailyTemp(int[] temp) {
		
		int res[] = new int[temp.length];
		for(int i=0; i<temp.length; i++) {
			for(int j=i+1; j<temp.length; j++) {
				if(temp[j]>temp[i]) {
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
