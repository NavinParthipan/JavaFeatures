package com.infy.generics;


class UserInterface{
	public static<E> void display(E[] list) {
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
	}
}

public class GenericsMethodDemo {
	public static void main(String args[]){
		String[] cities = {"Tirunelveli","Chennai","Covai"};
		Integer[] pinCode = {627601,600048,638401};
		
		UserInterface.display(cities);
		UserInterface.display(pinCode);
	}
	
}
