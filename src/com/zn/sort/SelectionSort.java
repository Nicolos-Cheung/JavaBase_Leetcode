package com.zn.sort;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arrs = { 1, 54, 12, 32, 11, 4, 5, 8, 22 };

		selectsort(arrs);

		for (int i : arrs) {
			System.out.println(i);
		}

	}

	public static void selectsort(int[] arrs) {

		int temp;

		for (int i = 0; i < arrs.length - 1; i++) {

			int index = i;

			for (int j = i + 1; j < arrs.length; j++) {

				if (arrs[j] < arrs[index])
					index = j;

			}
			if (index != i) {
				// 交换
				temp = arrs[index];
				arrs[index] = arrs[i];
				arrs[i] = temp;

			}
		}
	}

}
