package com.zn.company.pinduoduo;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		int num = cin.nextInt();

		int[] left = new int[num];
		int[] right = new int[num];
		int k = cin.nextInt();

		int i = 0;
		while (i < num) {

			left[i] = cin.nextInt();
			right[i] = cin.nextInt();
			i++;
		}
		Arrays.sort(left);
		Arrays.sort(right);

		int l_index, r_index;
		l_index = k - 1;
		r_index = num - k;

		if (left[l_index] > left[r_index]) {
			System.out.println("error");
		} else {
			System.out.println(left[l_index] + " " + right[r_index]);
		}

	}

}
