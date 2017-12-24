package com.zn.base;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;

public class StringTest {

	public static void main(String[] args) throws Exception {

		String str = "qwerwop";

		System.out.println(str.lastIndexOf("w")); // 4 返回w最后一次出现的地方
		System.out.println(str.indexOf("w")); // 1 返回w第一次出现的地方

		System.out.println(str.charAt(1)); // w

		// getChars
		char[] chars = new char[2];
		str.getChars(0, 2, chars, 0);
		for (char c : chars) {
			System.out.println(c); // q w [0,2)
		}

		// toCharArray()
		// equalsIgnoreCase() 比较两个字符串

		changeString();

		String str1 = "abcdefgh";
		String resverse = resverse(str1);
		System.out.println(resverse);
		
		
	}

	private static void changeString() throws Exception {

		// 创建字符串"Hello World"， 并赋给引用s
		String s = "Hello World";
		String s1 = s;

		// 获取String类中的value字段
		Field valueFieldOfString = String.class.getDeclaredField("value");

		// 改变value属性的访问权限
		valueFieldOfString.setAccessible(true);

		// 获取s对象上的value属性的值
		char[] value = (char[]) valueFieldOfString.get(s);

		// 改变value所引用的数组中的第5个字符
		value[5] = '_';

		System.out.println("s = " + s); // Hello_World

		System.out.println(s1);

	}

	// 递归实现字符串反转
	private static String resverse(String str) {
		if (str == null || str.length() < 2)
			return str;
		return resverse(str.substring(1)) + str.charAt(0);
	}

}
