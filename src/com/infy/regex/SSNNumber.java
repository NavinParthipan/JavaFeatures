package com.infy.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSNNumber {
	public static boolean validateSSNNumber(String ssnNum) {
		// Valid format of the SSN number is 123-85-3456.
		
		Pattern p = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
		Matcher m = p.matcher(ssnNum);
		return m.matches();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssnNum = "987-65-2321";
		if(validateSSNNumber(ssnNum)) {
			System.out.println("SSN Number :"+ssnNum);
		}
		else {
			System.out.println("Invalid ssn Number");
		}
	}
}
