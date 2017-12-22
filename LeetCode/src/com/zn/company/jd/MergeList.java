package com.zn.company.jd;

import java.util.Arrays;
import java.util.Scanner;

public class MergeList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int na = scanner.nextInt();
		int nb = scanner.nextInt();
		int[] aa = new int[na];
		int[] bb = new int[nb];

		int i = 0;
		while (scanner.hasNext()) {
			aa[i++] = scanner.nextInt();
			if (i == aa.length) {
				break;
			}
		}
		i = 0;
		while (scanner.hasNext()) {
			bb[i++] = scanner.nextInt();
			if (i == bb.length) {
				break;
			}
		}
//		for (int j = 0; j < aa.length; j++) {
//			System.out.print(aa[j] + " ");
//		}
//		System.out.println();
//		for (int j = 0; j < bb.length; j++) {
//			System.out.print(bb[j] + " ");
//		}
//
//		System.out.println();
//
		int[] arr = mergeArray(aa, bb);
		for (int m : arr) {
			System.out.print(m);
			System.out.print(" ");
		}

	}

	private static int[] mergeArray(int[] aa, int[] bb) {
		int[] arr = new int[aa.length + bb.length];

		int i = 0;
		int j = 0;

		Arrays.sort(aa);
		Arrays.sort(bb);
		int n = 0;
		while (i < aa.length || j < bb.length) {

			// aa数组合并完毕
			if (i >= aa.length) {

				while (j < bb.length) {

					arr[n] = bb[j];
					j++;
					n++;
				}
				break;

			}
			// bb数组合并完毕
			if (j >= bb.length) {
				while (i < aa.length) {

					arr[n] = aa[i];
					i++;
					n++;
				}
				break;
			}

			if (aa[i] < bb[j]) {
				arr[n] = aa[i];
				i++;
			} else {
				arr[n] = bb[j];
				j++;
			}
			n++;

		}

		return arr;
	}

}
