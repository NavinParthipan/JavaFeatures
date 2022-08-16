package com.infy.fileHandler;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\Demo.txt"); 
        boolean isCreated =  file.createNewFile();
        System.out.println("File created: " + isCreated);
        System.out.println("Name of the file: " + file.getName());
        System.out.println("Path of the file: " + file.getPath());
        System.out.println("isDirectory: " + file.isDirectory());
        System.out.println("list: " + file.list());
    }
}

