package com.zn.company.xiecheng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

	/*
	 * 请完成下面这个函数，实现题目要求的功能 当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 开始写代码
	 ******************************/
	static int findMinMis(int[] arr) {
		{
			int l = 0;
			int r = arr.length;

			int temp;

			while (l < r) {
				if (arr[l] == l + 1) {
					l++;
				} else if (arr[l] > r || arr[l] <= l || arr[arr[l] - 1] == arr[l]) // 不合法
				{

					arr[l] = arr[--r];

				} else {
					temp = arr[l];
					arr[l] = arr[arr[l] - 1];
					arr[temp - 1] = temp;

				}
			}
			return l + 1;

		}
	}

	/****************************** 结束写代码 ******************************/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

		int _A_size = 0;
		_A_size = Integer.parseInt(in.nextLine().trim());
		int[] _A = new int[_A_size];
		int _A_item;
		for (int _A_i = 0; _A_i < _A_size; _A_i++) {
			_A_item = Integer.parseInt(in.nextLine().trim());
			_A[_A_i] = _A_item;
		}

		res = findMinMis(_A);
		System.out.println(String.valueOf(res));

	}
}
