package com.zn.company.cvte;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * n个小朋友排成一个圈，输入size 为小朋友个数，小朋友从1开始报数，数到k的小朋友出列，下一个小朋友再从1开始报数
 * 直到所有小朋友全部出列为止。
 */
public class CircularQueue {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();
		int k = scanner.nextInt();

		Queue<Integer> queue = new LinkedList<Integer>();

		int m = 1;
		while (m <= size) {
			queue.add(m);
			m++;
		}

		while (size >= k) {

			for (int i = 0; i < k - 1; i++) {

				queue.add(queue.poll());

			}
			Integer p = queue.poll();
			size--;

			System.out.println(p);

		}

		while (queue.peek() != null)
			System.out.println(queue.poll());
	}

}
