package com.zn.leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class KeyboardRow {
	
	//leetcode 500
	public static void main(String[] args) {
		
		
		String []words = {"Aasdfghjkl","Qwertyuiop","zZxcvbnm"};
		
		String[] findWords = findWords(words);

		System.out.println(findWords.length);
	}

	public static String[] findWords(String[] words) {

		String[] base = {"qwertyuiop", "asdfghjkl", "zxcvbnm" };

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		// 初始化HashMap
		for (int i = 0; i < base.length; i++) {
			char[] charArray = base[i].toCharArray();
			for (char c : charArray) {
				map.put(c, i);
			}
		}
		ArrayList<String> arr = new ArrayList<String>();

		for (String word : words) {

			char[] charArray = word.toCharArray();

			int index = map.get(Character.toLowerCase(charArray[0]));

			for (int i = 1; i < charArray.length; i++) {
				if (index != map.get(Character.toLowerCase(charArray[i]))) {
					index = -1;
					break;
				}
			}
			if (index != -1) {
				arr.add(word);
			}

		}
		
	
		return arr.toArray(new String [arr.size()]);

	}

}
