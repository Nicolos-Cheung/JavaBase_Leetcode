package com.zn.leetcode;

import java.util.Stack;

public class ValidParentheses {

	/**
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * The brackets must close in the correct order, "()" and "()[]{}" are all
	 * valid but "(]" and "([)]" are not.
	 * 
	 */

	public static void main(String[] args) {

		String str = "{[}]";

		System.out.println(valid(str));

	}
	
	public static boolean valid2(String str){
		
		Stack<Character> stack = new Stack<Character>();
		for (char c : str.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
	

	public static boolean valid(String str) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {

			if (stack.isEmpty()) {
				stack.add(str.charAt(i));
			} else if (getOtherParenthese(stack.peek()) == str.charAt(i)) {

				stack.pop();

			} else {
				stack.add(str.charAt(i));
			}

		}

		return stack.isEmpty();

	}

	public static char getOtherParenthese(char c) {
		if (c == '{') {
			return '}';
		} else if (c == '[') {
			return ']';
		} else if (c == '(') {
			return ')';
		} else {
			return 'F';
		}

	}

}
