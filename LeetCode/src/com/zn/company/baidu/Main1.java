package com.zn.company.baidu;

import java.awt.Point;

/**
 * 根据地图中三个点找到第四个，形成一个平行四边形
 * 
 * @author ning
 *
 */
public class Main1 {

	public static int[] getpositionsInPark(int rows, int cols, char[][] arr, int euclidX, int euclidY, int monteX,
			int monteY) {
		int[] result = new int[2];

		Point euclid = new Point(euclidX, euclidY);
		Point monte = new Point(monteX, monteY);
		Point c = null;

		for (int i = 0; i < arr.length; i++) {
			// Y

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] == '+') {
					c = new Point(i, j);
					if (!c.equals(euclid) && !c.equals(monte)) {
						break;
					}

				}

			}

		}
		int xvalue = (int) c.getX() - (int) euclid.getX();
		int yvalue = (int) c.getY() - (int) euclid.getY();
		result[0] = (int) monte.getX() - (int) xvalue + 1;
		result[1] = (int) monte.getY() - (int) yvalue + 1;

		return result;

	}

}
