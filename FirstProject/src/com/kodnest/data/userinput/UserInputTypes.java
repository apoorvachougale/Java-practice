package com.kodnest.data.userinput;

import java.util.Scanner;

public class UserInputTypes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter byte: ");
		byte b = scan.nextByte();
		System.out.println("Byte value is: " +b);
		
		System.out.println("Enter short: ");
		short s = scan.nextShort();
		System.out.println("Short value is: " +s);
		
		System.out.println("Enter integer: ");
		int i = scan.nextInt();
		System.out.println("Int value is: " +i);
		
		System.out.println("Enter One word");
		String str = scan.next();
		System.out.println("Single word is: " +str);
		scan.nextLine();
		
		System.out.println("Enter multiple word: ");
		String str1 = scan.nextLine();
		System.out.println("Multiple word is: " +str1);
		
		System.out.println("Enter Long: ");
		long l = scan.nextLong();
		System.out.println("Long value is: " +l);
		
		System.out.println("Enter float: ");
		float f = scan.nextFloat();
		System.out.println("Float value is: " +f);
		
		System.out.println("Enter double: ");
		double d = scan.nextDouble();
		System.out.println("Double value is: " +d);
		
		System.out.println("Enter boolean: ");
		boolean bool = scan.nextBoolean();
		System.out.println("Boolean value is: " +bool);
		
		System.out.println("Enter character: ");
		char ch = scan.next().charAt(0);
		System.out.println(ch);
	}
}
