package com.zn.test;

public class Test3 {

	public static void main(String... args) {
		System.out.println(factorial(3));
	}

	public static void integerTest() {

		Integer i = 59;
		Integer j = 5999;

		System.out.println(i == Integer.valueOf("59")); // true

		System.out.println(i.equals(Integer.parseInt("59"))); // true

		System.out.println(i == new Integer(59)); // false

		
		
	}
	
	
	static int factorial(int n) {

		int result = 1;
		while (n > 1) {

			result *= n;
			n--;
		}

		return result;
	}
}
