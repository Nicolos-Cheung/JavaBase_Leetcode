package com.zn.company.redbook;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);

		String nextLine = cin.nextLine();

		String str = nextLine.replaceAll("RED", "");

		String[] arr = str.split("\\D+");
		String sss = arr[0];
		int max = arr[0].length();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].length() > max) {
				sss = arr[i];
				max = arr[i].length();
			} else if (arr[i].length() == max) {
				sss += arr[i];
			}
		}
		if (max < 1) {
			System.out.println(-1);
		} else {
			System.out.println(sss);
		}

	}
}
