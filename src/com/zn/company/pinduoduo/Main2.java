package com.zn.company.pinduoduo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


//递归输出目录
public class Main2 {

	private static int seq = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
		int n = scan.nextInt();
		int[] arr = new int[n];
		while (n > 0) {

			String line = scan.nextLine();
			String[] split = line.split(" ");

			if (map.get(split[0]) != null) {
				ArrayList<String> arrayList = map.get(split[0]);
				arrayList.add(split[1]);

				map.put(Integer.valueOf(split[0]), arrayList);
			} else {
				ArrayList<String> list = new ArrayList<String>();
				list.add(split[1]);
				map.put(Integer.valueOf(split[0]), list);

			}

			n--;
		}

		compute(arr, map);

	}

	private static void compute(int[] arr, HashMap<Integer, ArrayList<String>> map) {
		ArrayList<String> list = map.get(-1);
		String str = list.get(0);
		System.out.println(str + " -1");

		// seq=0
		printtree(map);

	}

	private static void printtree(HashMap<Integer, ArrayList<String>> map) {

		while (map.get(seq) != null) {

			ArrayList<String> arrayList = map.get(seq);

			for (int i = 0; i < arrayList.size(); i++) {

				printdetail(arrayList.get(i));

				printtree(map);

			}

		}
	}

	private static void printdetail(String str) {
		seq++;
		System.out.println(str);
	}

}
