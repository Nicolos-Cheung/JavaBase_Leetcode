package com.zn.base;

public class RegexTest {

	public static void main(String[] args) {

		// 验证QQ号是否合法
		String reg_qq = "\\d[\\d]{4,9}";
		String qq = "1234567890";
		boolean matches = qq.matches(reg_qq);
		System.out.println(matches);

		// 验证Email是否合法
		String reg_email = "^\\w+@([a-zA-Z0-9]+.[a-zA-Z]{1,3}){1,2}";
		String email_addr = "34@qq.com.cn";
		boolean matches1 = email_addr.matches(reg_email);
		System.out.println(matches1);

	}

}
