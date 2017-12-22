package com.zn.leetcode;

import com.zn.utils.PublicUtils;

public class MultiplicationOfLargeIntegers {

	private static char[] c;

	public static void main(String[] args) {

		 multiply("72106547548473106236", "982161082972751393");

//		multiply("125", "125");
	}

	/**
	 * 拼多多2018内推机试 求72106547548473106236 * 982161082972751393
	 * 
	 * 注：不能使用大整数类型
	 * 
	 * 1234*45
	 * 
	 * @param x1
	 * @param x2
	 */
	public static void multiply(String x1, String x2) {

		char[] arr1 = x1.toCharArray();

		char[] arr2 = x2.toCharArray();

		int[] result = new int[arr1.length + arr2.length];

		covertdata(arr1);
		covertdata(arr2);

		// 乘积数组填充0
		for (int i = 0; i < result.length; i++) {
			result[i] = 0;
		}

		for (int j = 0; j < arr2.length; j++) {

			int carry = 0; // 乘法进位

			for (int i = 0; i < arr1.length; i++) {

				int temp = Integer.parseInt(String.valueOf(arr1[i])) * Integer.parseInt(String.valueOf(arr2[j]));

				result[j + i] = temp % 10 + carry + result[j + i];

				carry = temp / 10;

			}

			if (carry != 0)
				result[arr1.length + j] += carry;

		}

		covertdata(result);

		// 处理进位
		for (int i = result.length - 1; i > 0; i--) {

			result[i - 1] += result[i] / 10;

			result[i] = result[i] % 10;

		}

		PublicUtils.printArray("result", result);

	}

	private static void covertdata(char[] arrs) {

		int i = 0;
		int j = arrs.length - 1;
		char temp;
		while (i < j) {

			temp = arrs[i];
			arrs[i] = arrs[j];
			arrs[j] = temp;

			i++;
			j--;

		}
	}

	private static void covertdata(int[] arrs) {

		int i = 0;
		int j = arrs.length - 1;
		int temp;
		while (i < j) {

			temp = arrs[i];
			arrs[i] = arrs[j];
			arrs[j] = temp;

			i++;
			j--;

		}

	}

}
