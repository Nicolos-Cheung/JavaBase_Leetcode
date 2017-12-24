package com.zn.leetcode;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maximumProduct(int[] nums) {
		int len = nums.length;
		if (len == 3) {
			return nums[0] * nums[1] * nums[2];
		}

		Arrays.sort(nums);

		return Math.max(nums[len - 1] * nums[len - 2] * nums[len - 3], nums[0] * nums[1] * nums[len - 1]);

	}

}
