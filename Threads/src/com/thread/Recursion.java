package com.thread;

import java.util.function.Consumer;

public class Recursion {

	public static void main(String[] args) {
		premutaion("AB", "");
	}

	public static void premutaion(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans + "");
			return;
		}
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			String res = str.substring(0, i) + str.substring(i + 1);
			premutaion(res, ans + ch);

		}

	}
	

}
