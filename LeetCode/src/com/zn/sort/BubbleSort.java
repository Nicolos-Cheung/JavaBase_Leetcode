package com.zn.sort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arrs = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		bubblesort(arrs);
		for (int i : arrs) {
			System.out.println(i);
		}

	}

	public static void bubblesort(int[] arrs) {
		int sum = 0;

		for (int i = 0; i < arrs.length - 1; i++) {
			for (int j = 0; j < arrs.length - i - 1; j++) {

				if (arrs[j] > arrs[j + 1]) {
					// 交换
					int temp = arrs[j + 1];
					arrs[j + 1] = arrs[j];
					arrs[j] = temp;
					sum++;

				}
			}
		}
		System.out.println("sum" + sum);
	}
}
