package com.infy.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Hello guys mic check 123.";
		Pattern p = Pattern.compile("\\d+{4}");
		Matcher m = p.matcher(sentence);
		
		while(m.find()) {
			System.out.println(m.group()+" starts at "+m.start()+" and ends at "+m.end() );
		}
	}

}
