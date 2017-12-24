package com.zn.company.redbook;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int[] arr = new int[n];
		int i = 0;
		while (i < n) {
			arr[i] = cin.nextInt();
			i++;
		}
		System.out.println(find(arr));

	}

	public static int find(int[] arr) {
		int len = arr.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += arr[i];
		}
		int maxLen = 0, fl = 0, fr = 0;
		;
		for (int r = len - 1; r > 0; r--) {
			int innerSum = sum;
			for (int l = 0; l < r; l++) {
				int cnt = r - l + 1;
				if (cnt <= maxLen)
					break;
				if (cnt % 2 == 0 && innerSum * 2 == cnt) {
					maxLen = cnt;
					fl = l;
					fr = r;
					break;
				}
				innerSum -= arr[l];
			}
			sum -= arr[r];
		}
		return fr - fl +1;
	}

}
