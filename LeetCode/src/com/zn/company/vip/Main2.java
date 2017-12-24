package com.zn.company.vip;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		int[][] arr = new int[19][19];
		compute(map, arr, 2, 3);
		int sum = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			sum += entry.getValue();
		}
		System.out.println(sum);

	}

	private static void compute(HashMap<String, Integer> map, int[][] arr, int x, int y) {

		if (x > 1) {
			if (arr[x - 1][y] == 0) {
				map.put(x - 1 + "" + y, 1);
			} else {
				compute(map, arr, x - 1, y);
			}
		}

		if (x < 19) {
			if (arr[x + 1][y] == 0) {
				map.put(x + 1 + "" + y, 1);
			} else {
				compute(map, arr, x - 1, y);
			}

		}
		if (y > 1) {
			if (arr[x][y - 1] == 0) {
				map.put(x + "" + (y - 1), 1);
			} else {
				compute(map, arr, x, y - 1);
			}
		}

		if (y < 19) {
			if (arr[x][y + 1] == 0) {
				map.put(x + "" + (y + 1), 1);
			} else {
				compute(map, arr, x, y + 1);
			}
		}
	}
}
