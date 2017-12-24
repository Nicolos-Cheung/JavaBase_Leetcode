package com.zn.company.xiecheng;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveDupChar {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {

			String str = cin.nextLine();

			String remove = remove(str);
			System.out.println(remove);

		}

	}

	public static String remove(String str) {

		StringBuilder sb = new StringBuilder();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char last = 0;
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			boolean containsKey = map.containsKey(c);

			if (c == ' ') {

				if (last != ' ') {
					sb.append(c);
					last = ' ';
				}

				continue;

			}
			if (!containsKey) {

				map.put(c, 1);
				last = c;
				sb.append(c);

			}

		}
		String temp = sb.toString();
		if (temp.charAt(temp.length() - 1) == ' ') {
			sb.deleteCharAt(sb.length() - 1);
		}

		return sb.toString();

	}

}
