package com.zn.utils;

public class PublicUtils {

	public static void printArray(char[] arrs) {

		System.out.print("[");

		for (int i = 0; i < arrs.length - 1; i++) {

			System.out.print(arrs[i] + ",");

		}
		System.out.print(arrs[arrs.length - 1]);

		System.out.println("]");

	}

	public static void printArray(int[] arrs) {

		System.out.print("[");

		for (int i = 0; i < arrs.length - 1; i++) {

			System.out.print(arrs[i] + ",");

		}
		System.out.print(arrs[arrs.length - 1]);

		System.out.println("]");

	}

	public static void printArray(String tag, char[] arrs) {

		System.out.print(tag + ":");
		System.out.print("[");

		for (int i = 0; i < arrs.length - 1; i++) {

			System.out.print(arrs[i] + ",");

		}
		System.out.print(arrs[arrs.length - 1]);

		System.out.println("]");

	}

	public static void printArray(String tag, int[] arrs) {

		System.out.print(tag + ":");
		System.out.print("[");

		for (int i = 0; i < arrs.length - 1; i++) {

			System.out.print(arrs[i] + ",");

		}
		System.out.print(arrs[arrs.length - 1]);

		System.out.println("]");

	}

}
