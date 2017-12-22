package com.zn.company.dji;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int[] arr = new int[num];
		int x = 0;

		int sum = 0;

		while (x < num) {
			arr[x] = scan.nextInt();
			x++;
		}

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				sum += countBitDiff(arr[i], arr[j]);
			}

		}

		System.out.println(sum);

	}

	public static int countBitDiff(int m, int n) {
		int ans = m ^ n;
		int count = 0;
		while (ans != 0) {
			ans &= (ans - 1);
			count++;
		}
		return count;
	}
}
