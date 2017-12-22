package com.zn.base;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2();

	}

	/**
	 * 结论：
	 * 
	 * TreeSet的排序时机是在元素插入过程中进行的，如果中途改变Set中对象的值，是不会影响二叉树排序结果的。
	 */
	public static void test1() {

		TreeSet<Bun> tree = new TreeSet<>();
		Bun b = new Bun(20, 3);
		Bun b1 = new Bun(18, 5);
		Bun b2 = new Bun(18, 10);
		tree.add(b2);
		tree.add(b);
		tree.add(b1);

		Iterator<Bun> iterator = tree.iterator();

		TreeSet<Bun> temp = new TreeSet();
		while (iterator.hasNext()) {
			Bun next = iterator.next();
			next.delival = next.delival - next.dropval;
			temp.add(next);
		}
		tree = temp;

		Bun last = tree.pollLast();
		System.out.println(last.delival + "_" + last.dropval);
		last = tree.pollLast();
		System.out.println(last.delival + "_" + last.dropval);
		last = tree.pollLast();
		System.out.println(last.delival + "_" + last.dropval);
	}

	public static void test2() {

		TreeSet<Integer> tree = new TreeSet<Integer>();

		tree.add(1);
		tree.add(2);
		tree.add(5);
		tree.add(3);

		Object[] array = tree.toArray();

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
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