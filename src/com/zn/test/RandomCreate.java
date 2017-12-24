package com.zn.test;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class RandomCreate {

	private static Scanner cin;

	public static void main(String[] args) {

		cin = new Scanner(System.in);
		System.out.println("Please input target num:");

		float target = cin.nextFloat();

		int temp = (int) target; // 整数部分
		float decimal = target - temp; // 小数部分

		Random random = new Random();
		System.out.println("Please input count (count >= 2):");

		int count = cin.nextInt();
		float[] arr = new float[count];
		int index = 0;
		while (index < count - 1) {
			int nextInt = random.nextInt(temp);
			arr[index] = nextInt;
			temp -= nextInt;
			index++;
		}
		arr[index] = temp + decimal;
		DecimalFormat df = new DecimalFormat("#.00");
		String format = df.format(arr[index]);

		StringBuilder sb = new StringBuilder();
		sb.append(target + "=");
		for (int i = 0; i < arr.length - 1; i++) {

			sb.append(arr[i] + "+");

		}
		sb.append(format);

		System.out.println(sb.toString());
	}

}
