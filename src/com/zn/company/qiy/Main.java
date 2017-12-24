package com.zn.company.qiy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin = new Scanner(System.in);

		String str = cin.nextLine();
		int k = cin.nextInt();

		char[] chars = str.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < chars.length; i++) {

			if (map.containsKey(chars[i])) {
				map.put(chars[i], map.get(chars[i]) + 1);
			} else {
				map.put(chars[i], 1);
			}
		}
		int[] sum = new int[map.size()];
		int i = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			sum[i] = entry.getValue();
			i++;
		}
		int value = 0;
		Arrays.sort(sum);
		while (k > 0) {
			sum[sum.length - 1] -= 1;
			Arrays.sort(sum);
			k--;
		}

		for (i = 0; i < sum.length; i++) {
			value += sum[i] * sum[i];
		}
		System.out.println(value);

	}

}
