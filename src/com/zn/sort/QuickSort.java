package com.zn.sort;

/**
 * 快速排序
 * @author ning
 */
public class QuickSort {

	public static void main(String[] args) {

		int[] arrs = { 2, 5, 1, 6, 4, 8, 22, 1, 12 };

		quicksort(arrs, 0, arrs.length-1);
		
		for(int i :arrs ){
			System.out.println(i);
		}

	}

	/**
	 * 
	 * @param arrs 待排序数组 arrs
	 * @param l	 数组左下标  0
	 * @param r  数组右下标 --> arrs.length-1
	 */
	public static void quicksort(int[] arrs, int l, int r) {

		if (l < r) {

			int i = l, j = r;
			int temp = arrs[l];
			
			while (i < j) {

				// 从右找第一个比temp小的数
				while (i < j && arrs[j] >= temp)
					j--;

				if (i < j)
					arrs[i++] = arrs[j];
				
				//从左边找第一个比temp大的数
				while(i<j && arrs[i]< temp)
					i++;

				if(i<j)
					arrs[j--] = arrs[i];
							
			}
			arrs[i] = temp;
			
			quicksort(arrs, l, i-1); //递归
			quicksort(arrs, i+1, r);
			
		}
	}

}
