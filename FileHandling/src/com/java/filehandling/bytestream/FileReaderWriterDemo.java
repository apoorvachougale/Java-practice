package com.java.filehandling.bytestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
try {
			
			String path1 = "C:\\Users\\ASdmin\\Desktop\\mydb1\\input.txt";
			String path2 = "C:\\Users\\ASdmin\\Desktop\\mydb1\\output.txt";
			
			FileReader fr = new FileReader(path1);
			FileWriter fw = new FileWriter(path2);
			
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			String data;
			while((data=br.readLine())!=null) {
				
				bw.write(data);
				bw.newLine();

			}
			
			br.close();
			bw.close();
			fr.close();
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
