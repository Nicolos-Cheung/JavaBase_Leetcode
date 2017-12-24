package com.zn.dp;

import java.util.Arrays;

/**
 * 求最长公共子序列
 * 
 * @author ning
 *
 */
public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 6, 7, 1, 2, 8 };

		lisGet(arr);

	}

	private static int[] getLis(int[] arr) {

		int[] pre = new int[arr.length];

		int[] longest = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			longest[i] = 1;
			pre[i] = -1;
		}

		for (int i = 1; i < arr.length; i++) {

			for (int j = 0; j < i; j++) {

				if (arr[i] > arr[j]) {
					if (longest[i] < longest[j] + 1) {
						longest[i] = longest[j] + 1;
						pre[i] = j;
					}
				}
			}

		}

		int max = 0;
		int index = -1;
		for (int i = 0; i < longest.length; i++) {

			if (longest[i] > max) {

				max = longest[i];
				index = i;
			}
		}
		int[] result = new int[max];
		result[--max] = longest[index];
		while (pre[index] != -1) {
			result[--max] = arr[pre[index]];
			index = arr[pre[index]];
		}
		return null;
	}

	public static void lisGet(int[] arr1) {

		int[] longest = new int[arr1.length];// 用于记录当前个元素作为最大元素的最长递增序列的长度

		for (int i = 0; i < arr1.length; i++) { // 初始化长度最长为自身长度
			longest[i] = 1; 
		}

		int max = 1;

		for (int i = 1; i < arr1.length; i++) {
			for (int j = 0; j < i; j++) {

				if (arr1[j] < arr1[i] && (longest[j] + 1) > longest[i]) {
					longest[i] = longest[j] + 1;
				}

				if (max < longest[i]) { // 得到当前最长递增序列的长度以及该子序列的最末元素的位置
					max = longest[i];
				}
			}

		}

		System.out.println(max);

		System.out.println("第i个元素结尾时最长递增子序列：" + Arrays.toString(longest)); // 输出数组
	}

}
