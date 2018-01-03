package com.zn.base;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;

public class StringTest {

	public static void main(String[] args) throws Exception {


		
		test2();
		
		
		
		
	}

	private static void test2() {
		// TODO Auto-generated method stub
		String str = "{status:1}";
		
		int a = str.lastIndexOf("status");
		System.out.println(a);
		
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
