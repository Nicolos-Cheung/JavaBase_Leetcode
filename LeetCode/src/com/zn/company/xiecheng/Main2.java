package com.zn.company.xiecheng;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		int i, n, m;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[] arr1 = new int[n + 1];

		for (i = 1; i <= n; i++) {
			arr1[i] = sc.nextInt();
		}
		m = sc.nextInt();
		int[] arr2 = new int[m + 1];
		for (i = 1; i <= m; i++) {
			arr2[i] = sc.nextInt();
		}
		double median = -1;
		if ((n + m) % 2 == 0) {
			int t1 = getTK(arr1, 1, n, arr2, 1, m, (m + n) / 2);
			int t2 = getTK(arr1, 1, n, arr2, 1, m, (m + n + 2) / 2);
			median = (t1 + t2) * 1.0 / 2;
		} else {
			median = getTK(arr1, 1, n, arr2, 1, m, (m + n + 1) / 2);
		}
		System.out.println(median);
	}

	private static int getTK(int[] arrA, int sa, int ea, int[] arrB, int sb, int eb, int k) {
		int ma = (sa + ea) / 2;
		int mb = (sb + eb) / 2;
		if (sa > ea) {
			return arrB[sb + k - 1];
		}
		if (sb > eb) {
			return arrA[sa + k - 1];
		}
		if (arrA[ma] >= arrB[mb]) {
			if ((ma - sa + 1) + (mb - sb + 1) > k) {
				return getTK(arrA, sa, ma - 1, arrB, sb, eb, k);
			} else {
				return getTK(arrA, sa, ea, arrB, mb + 1, eb, k - (mb + 1 - sb));
			}
		} else {
			if ((ma - sa + 1) + (mb - sb + 1) > k) {
				return getTK(arrA, sa, ea, arrB, sb, mb - 1, k);
			} else {
				return getTK(arrA, ma + 1, ea, arrB, sb, eb, k - (ma + 1 - sa));
			}
		}
	}
}