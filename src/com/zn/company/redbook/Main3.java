package com.zn.company.redbook;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int[] nums = new int[n];
		int i = 0;
		while (i < n) {
			nums[i] = cin.nextInt();
			i++;
		}
		int k = cin.nextInt();
		double maxAverage = maxAverage(nums, k);
		System.out.println(maxAverage);
	}

	public static double maxAverage(int[] nums, int k) {

		int len = nums.length; // 数组长度
		int count = 1; // 数组指针
		double maxSum = 0; // 最大子数组的和
		/*
		 * 先将前k数之和赋给maxSun
		 */
		for (int i = 0; i < k; i++) {
			maxSum += nums[i];
		}
		/*
		 * 主要算法
		 */
		while (count <= len - k) {
			// temp每次大循环都要重置,所以在这里新建
			double temp = 0;
			// 从第二数开始每k个数求和并赋给temo
			for (int j = 0; j < k; j++) {
				temp += nums[count + j];
			}
			// 比较temp和maxSun的值,记住每次计数器都要向后移一位
			if (temp > maxSum) {
				maxSum = temp;
				count++;
			} else {
				count++;
			}
		}
		return maxSum / k;
	}
}
