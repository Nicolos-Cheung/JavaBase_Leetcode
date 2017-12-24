package com.zn.company.amazon;

public class LongestPalindrome {

	public static void main(String[] args) {

		String str = "abbaccca";
		System.out.println(longestPalindrome(str));
	}

	/**
	 * 求字符创最长回文子串
	 * 
	 * @param s
	 * @return
	 */
	public static String longestPalindrome(String s) {
		StringBuilder longest = new StringBuilder("");
		if (s.length() <= 1)
			return s;

		StringBuilder str = new StringBuilder();

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
