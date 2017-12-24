package com.zn.test;

import java.util.Iterator;
import java.util.Stack;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s = new Stack<Integer>();
		s.add(1);
		s.add(2);
		Iterator<Integer> iterator = s.iterator();
		while (iterator.hasNext()) {

			Integer next = iterator.next();
			System.out.println(next);
		}

		char c1 = '\u0800';
		System.out.println(c1);

		int arr[] = { 1, -2, 3, 10, -4, 7, 2, -5 };
		System.out.println(test(arr));

	}

	/**
	 * 输入一个整形数组，数组里有正数也有负数。数组中连续的一个或多个整数组成一个子数组，每个子数组都有一个和。
	 * 求所有子数组的和的最大值。要求时间复杂度为O(n)。
	 * 
	 * @param a
	 * @return
	 */
	public static int test(int[] a) {
		int max = a[0];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (sum >= 0) // 如果加上某个元素，sum>=0的话，就加
			{
				sum += a[i];
			} else // 如果加上某个元素，sum<0了，就不加，从当前位置开始
			{
				sum = a[i];
			}
			if (sum > max)
				max = sum;
		}
		return max;
	}

}
