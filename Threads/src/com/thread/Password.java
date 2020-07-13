package com.thread;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	// Complete the minimumNumber function below.
	static int minimumNumber(int n, String password) {

		int count = 0;

		if (!password.matches(".*[a-z].*")) {
			count++;
		}

		if (!password.matches(".*[A-Z].*")) {
			count++;
		}

		if (!password.matches(".*[0-9].*")) {
			count++;
		}

		if (password.matches("[a-zA-Z0-9]*")) {
			count++;
		}

		int lengthDifference = 6 - password.length();

		if (lengthDifference > 0 && count <= lengthDifference) {
			return lengthDifference;
		}

		return count;

	}

	static boolean minimumNumberP(String password) {

		String numbers = "0123456789";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_characters = "!@#$%^&*()-+";
		return false;

//		boolean nu=false;
//		boolean l=false;
//		boolean u=false;
//		boolean s=false;
//		
//
//		char[] c = password.toCharArray();
//		for(int i=0;i<c.length;i++) {
//			if(numbers.contains(c[i]+""))
//				nu=true;
//			if(lower_case.contains(c[i]+""))
//				l=true;
//			if(upper_case.contains(c[i]+""))
//				u=true;
//			if(special_characters.contains(c[i]+""))
//				s=true;
//
//
//		}
//
//		return (nu && l && u && s)?true:false;


	}


	public static void main(String[] args)  {
		//System.out.println(minimumNumberP("Pasword@123"));
		
		String numbers = "0123456789";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_characters = "!@#&_";

		String password = "assword@123";
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		Pattern patternAbc = Pattern.compile("[a-z]*");
		Pattern patternAb = Pattern.compile("[A-Z]*");
		if (password.length() >= 8 && password.length() <= 31) {
			Matcher matcher = pattern.matcher(password);
			Matcher matcherAbc = patternAbc.matcher(password);
			Matcher matcherAb = patternAb.matcher(password);
			if (matcher.matches()) {
				System.out.println("20");
			}
			else {
			if(matcherAbc.matches() && matcherAb.matches()) {
				System.out.println("30");
			}
			}
		} else {
			System.out.println("10");
		}

	}

}
