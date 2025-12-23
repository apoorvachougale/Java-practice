package com.java.fileclass.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileClassMethodsDemo {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\ASdmin\\Desktop\\mydb1\\studentpercentage.txt";
		
		File file = new File(path);
		
		System.out.println("Path: " +file.getPath());
		System.out.println("Absolute Path: " +file.getAbsolutePath());
		System.out.println("Canonical path: " +file.getCanonicalPath());
		System.out.println("file name: " +file.getName());
		System.out.println("Does file exist? : " +file.exists());
		System.out.println("is the path file? : " +file.isFile());
		System.out.println("is the path folder? : " +file.isDirectory());
		System.out.println("Does file has read permission? " +file.canRead());
		System.out.println("Does file has write permission? " +file.canWrite());
		System.out.println("Does file has execute permission? " +file.canExecute());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val =Integer.parseInt(br.readLine());
		System.out.println(val);
		
	}
}
