package com.infy.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
	public static boolean validateMobileNumber(String mobNum) {
		Pattern p = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
		Matcher m = p.matcher(mobNum);
		return m.matches();
	}
	
	public static String getMobileNumber(String mobNum) {
		Pattern p = Pattern.compile("\\-");
		String[] mobileNumArray = p.split(mobNum);
		String mobileNum="";
		for(String i: mobileNumArray) {
			mobileNum+=i;
		}
		return mobileNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mobNum = "987-675-2321";
		if(validateMobileNumber(mobNum)) {
			System.out.println("Mobile Number: "+getMobileNumber(mobNum));
		}
		else {
			System.out.println("Invalid mobile Number");
		}
	}

}
