package com.thread;

import java.util.Stack;

public class Solution {
	public static void main(String args[]) {

		System.out.println(balancedParenthensies("{[()]}"));
		System.out.println(balancedParenthensies("{[(])}"));
		System.out.println(balancedParenthensies("{{[[(())]]}}"));
	}

	public static String balancedParenthensies(String s) {

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			} else {
				if(stack.isEmpty()) {
					return "NO";
				}else {
					
					char c = stack.pop();
					if (s.charAt(i) == '}' && c != '{') {
						return "NO";
					} else if (s.charAt(i) == ')' && c != '(') {
						return "NO";
					} else if (s.charAt(i) == ']' && c != '[') {
						return "NO";
					}
				}

			}

		}
		if (stack.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		}
	}
}