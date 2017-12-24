package com.zn.company.huawei;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {

			String str = cin.nextLine();

			char[] arrs = str.toCharArray();

			int front = -1;
			int maxlen = 0;
			int maxfront = -1;
			int len = 0;

			for (int i = 0; i < arrs.length; i++) {

				if (Character.isDigit(arrs[i])) {
					// 是数字
					if (front != -1) {
						len++;
					} else {
						front = i;
						len++;
					}

					// 数字结尾
					if (i == arrs.length - 1) {
						if (len > maxlen) {
							maxfront = front;
							maxlen = len;
						}
					}
				} else {
					// 不是数字
					if (front != -1) {
						if (len > maxlen) {
							maxlen = len;
							maxfront = front;
							front = -1;
							len=0;
						}else{
							front = -1;
							len = 0;
						}
					}

				}

			}

			if (maxfront == -1) {
				System.out.println("");
			} else {
				StringBuilder sb = new StringBuilder();

				for (int i = maxfront; i < maxfront+maxlen; i++) {
					sb.append(arrs[i]);
				}
				System.out.println(sb.toString());
				System.out.println(maxlen);
			}

		}
	}

}
