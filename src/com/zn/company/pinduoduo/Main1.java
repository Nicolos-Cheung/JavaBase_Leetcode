package com.zn.company.pinduoduo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int[] bears = new int[n];
		int[] sugers = new int[m];

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < m; i++) {
			sugers[i] = scan.nextInt();
		}

		int j = 0;

		while (n > 0 && scan.hasNextInt()) {

			bears[j] = scan.nextInt();
			map.put(bears[j], scan.nextInt());
			n--;
			j++;
		}

		Arrays.sort(sugers);
		Arrays.sort(bears);

		compute(sugers, bears, map);

	}

	private static void compute(int[] sugers, int[] bears, HashMap<Integer, Integer> map) {
		int need;
		for (int i = bears.length - 1; i >= 0; i--) {
			need = map.get(bears[i]);

			for (int j = sugers.length - 1; j >= 0; j--) {

				if (sugers[j] <= need) {

					need -= sugers[j];

					sugers[j] = 0;

				}

			}
			System.out.println(need);

		}

	}

}
