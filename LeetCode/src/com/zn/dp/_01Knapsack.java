package com.zn.dp;

public class _01Knapsack {

	/**
	 * 假设现有容量10kg的背包，另外有3个物品，分别为a1，a2，a3。物品a1重量为3kg，价值为4；物品a2重量为4kg，价值为5；
	 * 物品a3重量为5kg，价值为6。将哪些物品放入背包可使得背包中的总价值最大？
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 10;
		int y = 3;
		int w[] = { 3, 4, 5 };  //重量
		int p[] = { 4, 5, 6 };  //价值
		int c[][] = BackPack_Solution(x, y, w, p);
		for (int i = 1; i <= y; i++) {
			for (int j = 1; j <= x; j++) {
				System.out.print(c[i][j] + "     ");
				if (j == x) {
					System.out.println();
				}
			}
		}

	}

	/**
	 * @param m
	 *            表示背包的最大容量
	 * @param n
	 *            表示商品个数
	 * @param w
	 *            表示商品重量数组
	 * @param p
	 *            表示商品价值数组
	 */
	public static int[][] BackPack_Solution(int m, int n, int[] w, int[] p) {
		// c[i][v]表示前i件物品恰放入一个重量为m的背包可以获得的最大价值
		int c[][] = new int[n + 1][m + 1];
		for (int i = 0; i < n + 1; i++)
			c[i][0] = 0;
		for (int j = 0; j < m + 1; j++)
			c[0][j] = 0;

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				// 当物品为i件重量为j时，如果第i件的重量(w[i-1])小于重量j时，c[i][j]为下列两种情况之一：
				// (1)物品i不放入背包中，所以c[i][j]为c[i-1][j]的值
				// (2)物品i放入背包中，则背包剩余重量为j-w[i-1],所以c[i][j]为c[i-1][j-w[i-1]]的值加上当前物品i的价值
				if (w[i - 1] <= j) {
					if (c[i - 1][j] < (c[i - 1][j - w[i - 1]] + p[i - 1]))
						c[i][j] = c[i - 1][j - w[i - 1]] + p[i - 1];
					else
						c[i][j] = c[i - 1][j];
				} else
					c[i][j] = c[i - 1][j];
			}
		}
		return c;
	}
}
