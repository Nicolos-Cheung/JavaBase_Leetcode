package com.zn.company.jd;

public class SafeguardScheme {

	public static void main(String... args) {

		int[] arrs = {1,1,2};
		System.out.println(scheme(arrs));
	}

	public static int scheme(int[] arrs) {

		if (arrs.length == 2) {
			return 1;
		}

		int sum = 1;

		for (int i = 0; i < arrs.length; i++) {

			for (int j = i + 1; j < arrs.length - 1; j++) {
				int maxheight = 0; // 保存两山之间的最大山峰
				if (j - i == 2) {
					maxheight = arrs[j - 1];
					if (isBlack(arrs[i], arrs[j], maxheight)) {
						sum++;
					}

				} else {
					maxheight = Math.max(maxheight, arrs[j-1]);
					if (isBlack(arrs[i], arrs[j], maxheight)) {
						sum++;
					}
				}

			}

		}

		return sum;
	}

	public static boolean isBlack(int left, int right, int midmax) {

		int mmax = Math.max(left, right);
		if (midmax >= mmax)
			return false;
		return true;

	}
}
