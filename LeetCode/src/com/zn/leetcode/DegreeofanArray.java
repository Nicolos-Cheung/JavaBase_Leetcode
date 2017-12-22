package com.zn.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DegreeofanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findShortestSubArray(int[] nums) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		int minkey = Integer.MAX_VALUE;
		int maxlen = Integer.MIN_VALUE;
		for (Entry<Integer, Integer> entry : entrySet) {
			Integer key = entry.getKey();

			
		}
		return 0;
	}
}
