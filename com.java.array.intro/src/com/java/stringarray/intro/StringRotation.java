package com.java.stringarray.intro;

import java.util.Scanner;

public class StringRotation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int position = scan.nextInt();
		String res = "";
		String revstr ="";
		for(int i=str.length()-1; i>str.length()-position-1; i-- ) {
			revstr = revstr+ str.charAt(i);
		}
		System.out.println(revstr);
//		res = str.substring(position, str.length()) + str.substring(0, position);
//		System.out.println(res);
		res = revstr + str.substring(0, str.length()-position);
		System.out.println(res);
	}
}
