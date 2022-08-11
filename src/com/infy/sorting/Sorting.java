package com.infy.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Pine Apple");
		
		Collections.sort(fruits);
		System.out.println(fruits);
	}

}
