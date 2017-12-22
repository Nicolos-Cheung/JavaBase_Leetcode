package com.zn.base;

public class BitTest {

	public static void main(String[] args) {

	}

	public static void test1() {

		// 将int的低5位赋给byte低5位
		int a = 1432;

		byte b = 101;
		System.out.println("int a :" + Integer.toBinaryString(a));
		System.out.println("byte b :" + Integer.toBinaryString(b));

		// b = (byte) (b >> 5 << 5); // byte低五位置0
		// int c = a - (a >> 5 << 5); // 获取int 低5位
		// b = (byte) (b | c);

		// 一句话
		b = (byte) ((byte) (b >> 5 << 5) | (a - (a >> 5 << 5)));
		System.out.println(Integer.toBinaryString(b));
	}
}
