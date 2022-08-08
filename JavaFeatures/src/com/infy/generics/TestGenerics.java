package com.infy.generics;

public class TestGenerics {
	public <E> void printArray(E[] list) {
		for(E i:list) {
			System.out.println(i);
		}
	}
	
	public static void main(String args[]) {
		Integer[] integerArray = {101,102,103};
		Character[] characterArray = {'a','b','c'};
		String[] stringArray = {"Navin","Vinu","Parthipan"};
		
		TestGenerics tg = new TestGenerics();
		tg.printArray(integerArray);
		tg.printArray(characterArray);
		tg.printArray(stringArray);
	}
}
