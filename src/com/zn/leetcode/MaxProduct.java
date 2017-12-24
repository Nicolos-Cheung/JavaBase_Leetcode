package com.zn.leetcode;

import java.util.Arrays;

public class MaxProduct {

	public static void main(String... args) {
		// TODO Auto-generated method stub

		int[] arrs = { 3, 10, -1, -5, 8, 4 };

		int i = getMaxProduct(arrs);
	}

	/**
	 * 
	 * 拼多多2018内推机试 求数组中三个数的最大乘积
	 * 
	 * @param arrs
	 * @return
	 */
	private static int getMaxProduct(int[] arrs) {
		// TODO Auto-generated method stub

		Arrays.sort(arrs);

		for (int i : arrs) {

			System.out.println(i);
		}

		int last = arrs.length - 1;
		long max1 = arrs[0] * arrs[1] * arrs[last];
		long max2 = arrs[last - 2] * arrs[last - 1] * arrs[last];
		System.out.println(Math.max(max1, max2));

		return 0;
	}

}
