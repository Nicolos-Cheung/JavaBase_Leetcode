package com.zn.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MaxSumSubSeq {

	/**
	 * 找出数组中最大和的连续子串
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// 数据准备---键盘输入数据保存到数组中
		List<Integer> list = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {// 注意while处理多个case

			list.add(in.nextInt());

		}
		Iterator<Integer> iterator = list.iterator();

		int[] arr = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}

		getMax(arr);

	}

	public static void getMax(int arr[]) {
		int n = arr.length;
		int X[] = new int[n];
		int Y[] = new int[n];
		X[n - 1] = arr[n - 1];
		Y[n - 1] = arr[n - 1];
		X[0] = Y[0] = arr[0];
		for (int i = 1; i < n; ++i) {
			X[i] = Math.max(X[i - 1] + arr[i], arr[i]);
			Y[i] = Math.max(X[i], Y[i - 1]);
		}
		System.out.println(Y[n - 1]);
	}

}
