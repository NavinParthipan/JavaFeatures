package com.infy.byteStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream outFile = new FileOutputStream("Candidates.txt");
		String names = "Navin Vinu Karthi Raja Joash";
		byte[] bArray = names.getBytes();
		outFile.write(bArray);
		outFile.close();
	}

}
