package com.zn.company.vip;

public class Main1 {

	public static void main(String[] args) {

		String str = "abc   asc";

		StringBuilder sb = new StringBuilder();

		boolean flag = false;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ' && flag == false) {
				sb.append(str.charAt(i));
				flag = true;

			} else if (str.charAt(i) == ' ' && flag == true) {

			} else {
				flag = false;
				sb.append(str.charAt(i));
			}
		}

		System.out.println(sb.reverse().toString());
	}

}
