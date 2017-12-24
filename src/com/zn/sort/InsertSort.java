package com.zn.sort;

public class InsertSort {

	public static void main(String[] args) {

		int[] arrs = { 2, 4, 1, 5, 6, 1, 2 };

		insertsort(arrs);

		for (int i = 0; i < arrs.length; i++) {

			System.out.println(arrs[i]);
		}

	}

	public static void insertsort(int[] arrs) {

		int temp;

		for (int i = 0; i < arrs.length; i++) {

			int index = i;

			while (index - 1 >= 0 && arrs[index] < arrs[index - 1]) {

				temp = arrs[index];
				arrs[index] = arrs[index - 1];
				arrs[index - 1] = temp;

				index--;

			}

		}

	}

}
