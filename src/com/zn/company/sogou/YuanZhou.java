package com.zn.company.sogou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class YuanZhou {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int n = Integer.parseInt(str);
		double[] arr = new double[n];
		int m = 0;
		while (m < n) {
			arr[m] = Double.parseDouble(bf.readLine());
			m++;
		}

		Arrays.sort(arr);
		for (double d1 : arr) {
			System.out.println(d1);
		}

		// 生成间距数组
		double[] dis = new double[n - 1];

		for (int i = 0; i < arr.length - 1; i++) {
			dis[i] = arr[i + 1] - arr[i];
		}

		for (double d1 : dis) {
			System.out.println(d1);
		}

		double maxlen = 0;
		double currentlen = 0;
		int j = 0;
		int i = 0;
		while (j < dis.length) {
			
			if (currentlen < 180) {
				currentlen += dis[j];
				
				maxlen = Math.max(maxlen, currentlen);
			} else {
				currentlen = currentlen - dis[i];
				i++;
			}
			j++;

		}

		System.out.println(maxlen);

	}

}
