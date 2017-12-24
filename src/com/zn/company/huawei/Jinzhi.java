package com.zn.company.huawei;

import java.util.Scanner;

public class Jinzhi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String nextLine = scan.nextLine();

		String replace = nextLine.replace("0x", "");

		int parseInt = Integer.parseInt(replace, 16);
		System.out.println(parseInt);
	}

}
