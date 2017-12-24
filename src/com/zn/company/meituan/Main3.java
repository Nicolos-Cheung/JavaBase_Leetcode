package com.zn.company.meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();

		int[] arr = new int[sum];

		for (int i = 0; i < sum; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(judge(arr));

	}

	private static String judge(int[] arr) {

		Arrays.sort(arr);

		int sum = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			sum += arr[i];

		}
		if (arr[arr.length - 1] <= sum) {
			return "Yes";
		}

		return "No";
	}

}
