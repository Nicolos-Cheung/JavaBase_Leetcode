package com.zn.company.huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxScore {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] score = new int[n + 1];

		ArrayList<Integer> result = new ArrayList<Integer>();

		int w = 1;
		while (w <= n) {

			score[w] = scan.nextInt();
			w++;
		}

		w = 1;
		while (w <= m) {

			String c = scan.next();
			if (c.equals("Q")) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				int max = score[x];
				for (int i = x; i <= y; i++) {

					if (score[i] > max) {

						max = score[i];
					}

				}

				result.add(max);
				// System.out.println(max);

			} else if (c.equals("U")) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				score[x] = y;
			}

			w++;
		}

		for (int s : result) {
			System.out.println(s);
		}

	}

}
