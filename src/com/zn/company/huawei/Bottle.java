package com.zn.company.huawei;

import java.util.Scanner;

public class Bottle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {

			int nextInt = scan.nextInt();
			if (nextInt == 0) {
				break;
			}
			System.out.println(getMax(nextInt));

		}

	}

	/**
	 * 返回最大汽水瓶数
	 * 
	 * @param n
	 * @return
	 */
	public static int getMax(int n) {

		int sum = 0;

		int bottle_num = n;

		while (bottle_num / 3 > 0) {

			sum += (bottle_num / 3);
			bottle_num = bottle_num % 3 + bottle_num / 3;

		}

		if (bottle_num == 2) {
			sum++;
		}

		return sum;

	}

}
