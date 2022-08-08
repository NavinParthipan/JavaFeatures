package com.infy.wildcard;
 
class TestGenericsClass {
	public <T extends Number> void printArray(T t) {
		System.out.println(t);
	}
 }
	
public class WildCardExercise {
	public static void main(String[] args) {
		Integer i = 100;
		Double d = 100.09;
		Float f = 3f;
		Long l = -190L;
		
		TestGenericsClass tg = new TestGenericsClass();
		tg.printArray(i);
		tg.printArray(d);
		tg.printArray(f);
		tg.printArray(l);
	}
}
