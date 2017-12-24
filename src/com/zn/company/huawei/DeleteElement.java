package com.zn.company.huawei;

import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		int n = cin.nextInt();

		if (n > 999)
			n = 999;

		int[] arrs = new int[n];

		int m = 0;
		while (m < n) {

			arrs[m] = cin.nextInt();
			m++;
		}

		int i = getLastDeleteElementIndex(arrs);

	}

	private static int getLastDeleteElementIndex(int[] arrs) {
		
		
		
		return 0;
	}

}
