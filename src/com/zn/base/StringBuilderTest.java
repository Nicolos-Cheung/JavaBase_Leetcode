package com.zn.base;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		sb.append("1234567");
		sb.append("123");
		int point = sb.lastIndexOf(String.valueOf(123));
		System.out.println(point);
		sb.delete(point, sb.length());
		System.out.println(sb.toString());
	}

}
