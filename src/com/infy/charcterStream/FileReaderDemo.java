package com.infy.charcterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args)throws IOException {
		FileReader file1 = new FileReader("johnTerm1.txt");
		FileReader file2 = new FileReader("johnTerm2.txt");
		FileWriter file3 = new FileWriter("johnTerms.txt");
		
		int i = file1.read();
		int j = file2.read();
		
		while(i!=-1 && j!=-1) {
			file3.write((char)i);
			if((char)i == ':') {
				String s1 = "",s2 = "";
				int sum = 0;
				for(int x=0;x<2;x++) {
					i = file1.read();
					j = file2.read();
					s1+= Character.toString((char)i);
					s2+= Character.toString((char)j);
				}
				sum = Integer.parseInt(s1)+ Integer.parseInt(s2);
				String s = Integer.toString(sum);
				file3.write(s.charAt(0));
				file3.write(s.charAt(1));
			}
			i = file1.read();
			j =  file2.read();
		}
		file1.close();
		file2.close();
		file3.close();
	}
}
