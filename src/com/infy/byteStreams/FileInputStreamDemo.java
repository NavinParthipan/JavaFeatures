package com.infy.byteStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
			FileInputStream file = new FileInputStream("Candidates.txt");
			int i = file.read();
			
			while(i!=-1) {
				System.out.print((char)i);
				i = file.read();
			}
		file.close();
	}
}
