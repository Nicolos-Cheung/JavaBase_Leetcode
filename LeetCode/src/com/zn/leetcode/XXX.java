package com.zn.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class XXX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> generateParenthesis = generateParenthesis(4);

		for (String str : generateParenthesis) {
			System.out.println(str);
		}
	}

	public static List<String> generateParenthesis(int n) {
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		set1.add("");
		int count = 0;
		while (count != n) {
			if (set1.size() != 0) {
				set2.clear();
				for (String s : set1) {
					set2.add("()" + s);
					set2.add(s + "()");
					set2.add("(" + s + ")");
				}
				if (++count == n)
					break;
			}
			if (set2.size() != 0) {
				set1.clear();
				for (String s : set2) {
					set1.add("()" + s);
					set1.add(s + "()");
					set1.add("(" + s + ")");
				}
				if (++count == n)
					break;
			}
		}
		return new ArrayList<String>(set1.size() > set2.size() ? set1 : set2);
	}

}
