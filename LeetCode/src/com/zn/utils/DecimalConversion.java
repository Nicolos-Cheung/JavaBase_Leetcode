package com.zn.utils;

import java.util.Scanner;

/**
 * 进制转换
 * 
 * @author ning
 *
 */
public class DecimalConversion {

	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		String s = Integer.toBinaryString(n); //
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '1') {

				sum++;
			}

		}
		System.out.println(sum);

	}

	/**
	 * 十进制转二进制
	 * 
	 * @param n
	 * @return
	 */
	public static int[] Decimal2Binary(int n) {

		return null;
	}

}
