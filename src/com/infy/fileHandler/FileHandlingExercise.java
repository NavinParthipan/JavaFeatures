package com.infy.fileHandler;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.RandomAccessFile;

public class FileHandlingExercise {
	public static void main(String[] args) throws Exception {
		RandomAccessFile outFile1 = new RandomAccessFile("D:\\output.txt", "rw");
		
		BufferedReader file1 = new BufferedReader(new FileReader("D:\\InFile1.txt"));
		int i =  file1.read();
		while(i!=-1) {
			outFile1.write((char)i);
			i = file1.read();
		}
		
		BufferedReader file2 = new BufferedReader(new FileReader("D:\\InFile2.txt"));
		int j = file2.read();
		while(j!=-1) {
			outFile1.write((char)j);
			j = file2.read();
		}
		file1.close();
		file2.close();
		outFile1.close();
	}
}
