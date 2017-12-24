package com.zn.company.jd;

import java.util.Scanner;

public class LuckyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int result = 0;
		while (n > 0) {

			if (funcg(n) == funcf(n)) {
				result++;
			}

			n--;
		}
		System.out.println(result);

	}

	public static int funcg(int n) {

		int sum = 0;

		String s = String.valueOf(n);

		char[] charArray = s.toCharArray();

		for (char c : charArray) {
			sum += Integer.parseInt(String.valueOf(c));
		}
		return sum;

	}

	public static int funcf(int n) {

		String s = Integer.toBinaryString(n); //
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '1') {

				sum++;
			}

		}
		return sum;
	}

}
