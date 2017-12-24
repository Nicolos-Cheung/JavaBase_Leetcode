package com.zn.leetcode;

/**
 * 最长回文子串
 * 
 * @author ning
 *
 */
public class LongestPalindromicSubString {

	public static void main(String[] args) {

		String s = longestPalindrome("abccbaaqwertyuioppoiuytrewq");

		System.out.println(s);
	}

	public static String longestPalindrome1(String s) {
		StringBuilder longest = new StringBuilder("");
		if (s.length() <= 1)
			return s;

		for (int i = 0; i < s.length(); i++) {
			expand(s, longest, i, i); // odd
			expand(s, longest, i, i + 1); // even
		}

		return longest.toString();
	}

	public static String longestPalindrome(String s) {
		StringBuilder longest = new StringBuilder("");
		if (s.length() <= 1)
			return s;

		StringBuilder str = new StringBuilder();

		// 构建字符串插入特殊字符
		for (int i = 0; i < s.length(); i++) {
			str.append("#");
			str.append(s.charAt(i));
		}
		str.append("#");
		s = str.toString();

		for (int i = 0; i < s.length(); i++) {
			expand(str.toString(), longest, i, i);
		}

		s = longest.toString().replaceAll("#", "");
		return s;
	}

	private static void expand(String s, StringBuilder longest, int i, int j) {

		while (i >= 0 && j < s.length()) {
			if (s.charAt(i) == s.charAt(j)) {
				if (j - i + 1 > longest.length()) {
					longest.delete(0, longest.length());
					longest.append(s.substring(i, j + 1));
				}
				i--;
				j++;
			} else
				break;
		}
	}
}
