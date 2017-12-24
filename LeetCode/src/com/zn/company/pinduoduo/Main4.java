package com.zn.company.pinduoduo;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main4 {

	private static Scanner cin;

	public static void main(String[] args) {

		cin = new Scanner(System.in);
		int n = cin.nextInt();
		int m = cin.nextInt();
		TreeSet<Bun> tree = new TreeSet<Bun>();
		int i = 0;
		int avil = 0;
		while (i < n) {
			int delival = cin.nextInt();
			if (delival > 0) {
				avil++;
			}
			tree.add(new Bun(delival, cin.nextInt()));
			i++;
		}

		while (tree.size() > 0 && avil >= m) {
			Bun last = tree.pollLast();
			if (last.delival > 0) {
				System.out.println(-1);
				avil--;
			}

			last = tree.pollLast();
			if (last.delival > 0) {
				System.out.println(-1);
				avil--;
			}

			Iterator<Bun> iterator = tree.iterator();

			TreeSet<Bun> temp = new TreeSet();
			while (iterator.hasNext()) {
				Bun bun = iterator.next();
				bun.delival = bun.delival - bun.dropval;
				temp.add(bun);
				if (bun.delival < 0) {
					avil--;
				}
			}
			tree = temp;
		}
		for (int j = 0; j <= tree.size(); j++) {

			System.out.println(0);
		}

	}

}

class Bun implements Comparable {

	public int delival;
	public int dropval;

	public Bun(int delival, int dropval) {
		super();
		this.delival = delival;
		this.dropval = dropval;
	}

	@Override
	public int compareTo(Object o) {
		Bun b;
		if (o instanceof Bun) {
			b = (Bun) o;
		} else {
			throw new RuntimeException("不是Bun对象");
		}

		if (this.delival > b.delival) {
			return 1;
		} else if (this.delival == b.delival) {

			if (this.dropval > b.dropval) {
				return 1;
			}
		}
		return -1;
	}

}