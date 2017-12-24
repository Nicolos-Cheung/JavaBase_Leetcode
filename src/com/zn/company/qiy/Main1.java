package com.zn.company.qiy;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int[] arr = new int[n];
		int k = 0;
		while (k < n) {
			arr[k] = cin.nextInt();
			k++;
		}
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			while (num > 0) {
				if (log(num, 4) >= 1) {
					int temp = (int) Math.pow(4, (int) log(num, 4));
					num -= temp;
//					System.out.println("num" + num + "del" + temp);
					index++;
				} else {
					index += num;
					break;
				}
			}
			if (index % 2 == 0) {
				System.out.println("yang");
			} else {
				System.out.println("niu");
			}
			index = 0;
		}
	}

	private static double log(int value, int base) {
		return (double) (Math.log(value) / Math.log(base));
	}
}
