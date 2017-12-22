package com.zn.company.meituan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();

		int[] arr = new int[sum];

		for (int i = 0; i < sum; i++) {
			arr[i] = scan.nextInt();
		}

		int k = scan.nextInt();

		int result = getMaxLen(arr, k);
		System.out.println(result);

	}

	private static int getMaxLen(int[] arr, int k) {

		int maxlen = 0;
		double sum = 0;
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			sum = arr[i];
			if (sum % k == 0) {
				maxlen = Math.max(maxlen, 1);
			}

			for (int j = i + 1; j < len; j++) {

				sum += arr[j];
				if (sum % k == 0) {
					maxlen = Math.max(maxlen, j - i + 1);
				}

			}

		}

		return maxlen;
	}

}
