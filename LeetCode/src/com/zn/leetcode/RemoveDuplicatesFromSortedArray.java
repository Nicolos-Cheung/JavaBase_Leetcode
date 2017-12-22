package com.zn.leetcode;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] arrs = { 1, 1, 2 };

		System.out.println(removeDuplicates(arrs));

		System.out.println(arrs.length);
	}

	public static int removeDuplicates(int[] arrs) {

		if (arrs.length == 0) {
			return 0;
		}

		if (arrs.length == 1) {
			return 1;
		}

		int result = 1;
		int temp = arrs[0];

		for (int i = 1; i < arrs.length; i++) {

			if (temp != arrs[i]) {
				temp = arrs[i];
				result++;
			}

		}

		return result;
	}

	public int removeDuplicates2(int[] A) {
		if (A.length == 0)
			return 0;
		int j = 0;
		for (int i = 0; i < A.length; i++)
			if (A[i] != A[j])
				A[++j] = A[i];
		return ++j;

	}

}
