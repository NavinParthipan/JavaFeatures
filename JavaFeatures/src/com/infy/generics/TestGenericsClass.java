package com.infy.generics;

public class TestGenericsClass {
	public <E> void printArray(E[] list) {
		for(E i:list) {
			System.out.println(i);
		}
	}
	
	public static void main(String args[]) {
		Integer[] integerArray = {101,102,103};
		Character[] characterArray = {'a','b','c'};
		String[] stringArrays = {"Navin","Vinu","Parthipan"};
		
		TestGenericsClass tg = new TestGenericsClass();
		tg.printArray(integerArray);
		tg.printArray(characterArray);
		tg.printArray(stringArrays);
	}
}

