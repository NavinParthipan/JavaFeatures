package com.infy.fileHandler;

import java.io.RandomAccessFile;

public class RandomAccessDemo {
	public static void main(String[] args) throws Exception {
		RandomAccessFile randomFile = new RandomAccessFile("D:\\Output.txt", "rw");
		randomFile.writeUTF("Writing Hello");
        System.out.println("Current position:" + randomFile.getFilePointer());
        randomFile.seek(0);
        System.out.println("Current position:" + randomFile.getFilePointer());
		System.out.println(randomFile.readUTF());
		System.out.println("Current position:" + randomFile.getFilePointer());
		randomFile.close();
	}
}
