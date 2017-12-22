package com.zn.company.meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin = new Scanner(System.in);
		

		int sum = cin.nextInt();

		int[] arr = new int[sum];

		Arrays.sort(arr);

		int x = 0;
		while (x < sum) {
			arr[x] = cin.nextInt();
			x++;
		}
		int index = 0;
		for (int i = 0; i < sum - 1; i++) {
			for (int j = i + 1; j < sum; j++) {

				String str = arr[i] + "" + arr[j];
				int w = Integer.parseInt(str);
				if (w % 7 == 0) {
					index++;
				}
				if (arr[j] != arr[i]) {
					String str1 = arr[j] + "" + arr[i];
					int q = Integer.parseInt(str);
					if (w % 7 == 0) {
						index++;
					}
				}

			}

		}
		System.out.println(index);

	}

}
