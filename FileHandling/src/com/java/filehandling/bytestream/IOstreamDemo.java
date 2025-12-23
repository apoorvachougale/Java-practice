package com.java.filehandling.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOstreamDemo {
	public static void main(String[] args) {
		try {
			
			String path1 = "C:\\Users\\ASdmin\\Desktop\\mydb1\\input.txt";
			String path2 = "C:\\Users\\ASdmin\\Desktop\\mydb1\\output.txt";
			
			FileInputStream fis = new FileInputStream(path1);
			FileOutputStream fos = new FileOutputStream(path2);
			
			int data;
			while((data=fis.read())!=-1) {
				
				fos.write(data);

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
