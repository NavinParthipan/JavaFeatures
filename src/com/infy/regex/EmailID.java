package com.infy.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailID {
	
	public static boolean validateEmailId(String mailId) {
		Pattern p = Pattern.compile("^([a-z0-9\\.\\-]+)\\@([a-z\\d\\-]+)\\.([a-z{2,8}])([\\.a-z]*)$");
		Matcher m = p.matcher(mailId);
		if(m.matches()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String mailId = "navin.it20@bitsathy.ac.in";
		if(validateEmailId(mailId)) {
			System.out.println(mailId);
		}
		else {
			System.out.println("Invalid mailId");
		}
	}
}
