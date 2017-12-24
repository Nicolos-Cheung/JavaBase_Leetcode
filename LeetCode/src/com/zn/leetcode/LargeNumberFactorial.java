package com.zn.leetcode;

/**
 * 阶乘~
 * 
 * @author ning
 *
 */
public class LargeNumberFactorial {

	public static void main(String[] args) {

		compute(10000);

	}

	/*
	 * 求1*2*3...*10000
	 */
	public static void compute(int x) {

		double m = 1;// 用户保存有效位

		int n = 1;

		for (int i = 1; i <= x; i++) {

			m *= i;
			while (m / 10 > 1) {
				m = m / 10;
				n++;

			}
		}

		System.out.println(m + "*10^" + n);

	}
}
