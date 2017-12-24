package com.zn.company.amazon;

public class WindowSum {
	/**
	 * 一个滑动窗遍历数组，求滑动窗的和。
	 * @param arr 给定数组
	 * @param width 窗口大小
	 * @return
	 */
	private static int[] windowsum(int[] arr, int width) {

		int temp = 0;

		int[] result = new int[arr.length - width + 1];

		// 计算第一个窗口的sum
		for (int i = 0; i < width; i++) {
			temp += arr[i];
			result[0] = temp;
		}

		for (int i = width, j = 1; i < arr.length; i++, j++) {
			temp += arr[i];
			temp -= arr[i - width];
			result[j] = temp;

		}

		return result;
	}

}
