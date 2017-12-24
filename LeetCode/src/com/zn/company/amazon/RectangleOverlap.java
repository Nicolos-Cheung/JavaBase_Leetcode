package com.zn.company.amazon;

public class RectangleOverlap {

	/**
	 * 给出的是两个矩形的左上角和右下角，取两个矩形端点比较靠向中心的（交集），判断这个交集是否为空
	 * 
	 * 判断重叠很麻烦，但判断不重叠很简单的：
	 * 
	 */
	public boolean doOverlap(Pointer topLeft1, Pointer bottomRight1, Pointer topLeft2, Pointer bottomRight2) {

		if (bottomRight1.x > topLeft2.x || bottomRight2.x > topLeft1.x) {
			return true;
		}

		if (bottomRight1.y > topLeft2.y || bottomRight2.y > topLeft1.y) {
			return true;
		}

		return false;
	}
}

class Pointer {
	public int x;
	public int y;

}
