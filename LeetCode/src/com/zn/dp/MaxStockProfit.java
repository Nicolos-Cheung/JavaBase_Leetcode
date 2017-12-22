package com.zn.dp;

public class MaxStockProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 7, 1, 5, 3, 6, 4 };

		int n = getMax1(arr, 3);

	}

	private static int getMax1(int[] price, int K) {

		int[][] dp = new int[K + 1][];

		for (int k = 1; k <= K; k++) {

			for (int i = 1; i < price.length; i++) {

				dp[k][i] = dp[k][i - 1];
				for (int j = 0; j < i; j++) {

					dp[k][i] = Math.max(dp[k][i - 1], dp[k - 1][j] + price[i] - price[j]);
				}
			}

		}

		return dp[K][price.length - 1];
	}

}
