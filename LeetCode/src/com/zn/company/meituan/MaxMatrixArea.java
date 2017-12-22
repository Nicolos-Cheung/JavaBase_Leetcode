package com.zn.company.meituan;

import java.util.Scanner;

/**
 * 给定一组非负整数组成的数组h，代表一组柱状图的高度，其中每个柱子的宽度都为1。 在这组柱状图中找到能组成的最大矩形的面积
 * 入参h为一个整型数组，代表每个柱子的高度，返回面积的值。
 * 
 * @author ning
 *
 */
public class MaxMatrixArea {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();

		int[] arr = new int[sum];

		for (int i = 0; i < sum; i++) {
			arr[i] = scan.nextInt();
		}

		int result = computeMaxArea(arr);

		System.out.println(result);

	}

	private static int computeMaxArea(int[] arr) {

		int maxarea = 0;
		int minheight;

		for (int i = 0; i < arr.length; i++) {
			minheight = arr[i];
			for (int j = i; j < arr.length; j++) {
				int width = j - i + 1;
				minheight = Math.min(minheight, arr[j]);
				maxarea = Math.max(maxarea, minheight * width);

			}

		}

		return maxarea;
	}

}
