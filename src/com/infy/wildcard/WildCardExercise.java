package com.infy.wildcard;
 
class TestGenericsClass {
	public <T extends Number> void printArray(T[] t) {
		for(T i: t) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}
 }
	
public class WildCardExercise {
	public static void main(String[] args) {
		Integer[] i = {100,200,300};
		Double[] d = {100.09,9009.67};
		Float[] f = {1f,2f,3f};
		Long[] l = {-190L,900L,100L};
		
		TestGenericsClass tg = new TestGenericsClass();
		tg.printArray(i);
		tg.printArray(d);
		tg.printArray(f);
		tg.printArray(l);
	}
}
