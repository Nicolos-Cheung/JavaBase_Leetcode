package com.zn.company.huawei;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 
 * 输入一组整数
 * 去重 排序  返回
 * @author ning
 *
 */
public class DeduplicationAndSort {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		TreeSet<Integer> tSet = new TreeSet<Integer>();
		while (num != 0) {
			tSet.add(scan.nextInt());
			num--;
		}

		Iterator<Integer> it = tSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
