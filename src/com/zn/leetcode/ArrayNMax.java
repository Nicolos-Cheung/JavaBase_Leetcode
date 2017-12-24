package com.zn.leetcode;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 
 * 求一个数组的第N大的数
 * 
 * @author ning
 *
 */
public class ArrayNMax {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();

		String[] split = s1.split(" ");
		int[] arrs = new int[split.length];
		for (int i = 0; i < split.length; i++) {
			arrs[i] = Integer.parseInt(split[i]);
		}

		int n = Integer.parseInt(String.valueOf(s2));

		System.out.println(getMax(arrs, n));

	}

	public static int getMax(int[] nums, int k) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
		for (int i : nums) {
			q.offer(i);

			if (q.size() > k) {
				q.poll();
			}
		}

		return q.peek();
	}

	private static void getMax2(int[] arrs, int n) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i : arrs) {

			if (!list.contains(i)) {
				list.add(i);
			}
		}
		System.out.println(list.get(n - 1));

	}

}
