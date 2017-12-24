package com.zn.leetcode;

public class LengthOfLIS {

	public static void main(String[] args) {

		int[] temp = { 2, 2, 2 };

		System.out.println(solution(temp));

	}

	/**
	 * find the length of longest increasing subsequence.
	 * 
	 * @param nums
	 */
	public static int solution(int[] nums) {

		int[] d = new int[nums.length];

		if (nums.length == 0)
			return 0;
		int len = 1;
		for (int i = 0; i < nums.length; i++) {

			d[i] = 1;
			for (int j = 0; j < i; ++j) {

				if (nums[j] < nums[i] && d[j] + 1 > d[i])
					d[i] = d[j] + 1;
				if (d[i] > len)
					len = d[i];
			}
		}
		return len;

	}

}
