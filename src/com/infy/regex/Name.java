package com.infy.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Navin Parthipan";
		Pattern p = Pattern.compile("([A-Za-z]+\\s?)+");
		Matcher m = p.matcher(name);
		
		if(m.matches()) {
			System.out.println("Your name is checked");
		}
		else {
			System.out.println("Name Invalid");
		}
	}

}
