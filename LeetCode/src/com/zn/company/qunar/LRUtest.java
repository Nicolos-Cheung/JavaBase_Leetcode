package com.zn.company.qunar;

import java.util.Hashtable;
import java.util.Scanner;

public class LRUtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);

		int m = cin.nextInt();
		LRUCache cache = new LRUCache(m);

		int count = cin.nextInt();

		int i = 0;
		while (i < count) {

			String str = cin.nextLine();
			if (str.equals("")) {
				continue;

			}
			String[] split = str.split(" ");

			if (split[0].equals("get")) {
				// get
				System.out.println(cache.get(split[1]));
			} else {
				// put
				cache.put(split[1], split[2]);
			}
			i++;

		}

	}

}

class LRUCache {

	private int cacheSize;
	private Hashtable<String, CacheNode> nodes;
	private int currentSize;
	private CacheNode first;
	private CacheNode last;

	class CacheNode {
		CacheNode prev;
		CacheNode next;
		String value;
		String key;

		CacheNode() {
		}
	}

	public LRUCache(int i) {
		currentSize = 0;
		cacheSize = i;
		nodes = new Hashtable<String, CacheNode>(i);// 缓存容器
	}

	public String get(Object key) {
		CacheNode node = (CacheNode) nodes.get(key);
		if (node != null) {
			moveToHead(node);
			return node.value;
		} else {
			return null;
		}
	}

	/**
	 * 添加缓存
	 * 
	 * @param key
	 * @param value
	 */
	public void put(String key, String value) {
		CacheNode node = (CacheNode) nodes.get(key);

		if (node == null) {
			if (currentSize >= cacheSize) {
				if (last != null)
					nodes.remove(last.key);
				removeLast();
			} else {
				currentSize++;
			}

			node = new CacheNode();
		}
		node.value = value;
		node.key = key;
		moveToHead(node);
		nodes.put(key, node);
	}

	/**
	 * 删除缓存
	 * 
	 * @param key
	 * @return
	 */
	public Object remove(String key) {
		CacheNode node = (CacheNode) nodes.get(key);
		if (node != null) {
			if (node.prev != null) {
				node.prev.next = node.next;
			}
			if (node.next != null) {
				node.next.prev = node.prev;
			}
			if (last == node)
				last = node.prev;
			if (first == node)
				first = node.next;
		}
		return node;
	}

	public void clear() {
		first = null;
		last = null;
	}

	/**
	 * 删除最少使用的缓存对象
	 */
	private void removeLast() {
		if (last != null) {
			if (last.prev != null)
				last.prev.next = null;
			else
				first = null;
			last = last.prev;
		}
	}

	/**
	 * 移动到链表头-->最新使用过的
	 * 
	 * @param node
	 */
	private void moveToHead(CacheNode node) {
		if (node == first)
			return;
		if (node.prev != null)
			node.prev.next = node.next;
		if (node.next != null)
			node.next.prev = node.prev;
		if (last == node)
			last = node.prev;
		if (first != null) {
			node.next = first;
			first.prev = node;
		}
		first = node;
		node.prev = null;
		if (last == null)
			last = first;
	}

}
