package com.java.filehandling.bytestream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sub[] = {"Kannada", "English", "Hindi", "Math", "Science", "Social"};
		int totalSum = 0;
		try {
			String path = "C:\\Users\\ASdmin\\Desktop\\mydb1\\studentpercentage.txt";
			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			
			
			for(int i=0; i<sub.length; i++) {
				int marks = sc.nextInt();
				
				bw.write(sub[i]+":"+marks+"\n");
				totalSum += marks;
			}
			
			double percentage = totalSum/6.0;
			
			bw.write("Total: "+totalSum+"\n");
			bw.write("Percentage: "+percentage);
			
			sc.close();
			bw.close();
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
