package com.zn.test;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

import com.zn.company.qunar.LRUCache1;

public class Test5 {

	public static void main(String... args) {

		LRUCache1 c = new LRUCache1(3);

		c.put("a", "b");
		c.put("x", "y");
		c.put("d", "kkk");
		c.put("zzz", "lll");

		System.out.println(c.get("a"));

		
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		
		StringBuilder sb =  new StringBuilder();
		
		LinkedBlockingQueue lbq = new LinkedBlockingQueue();
		
	}
	
	public static void test(int a,String b){
	}
	
	public static void test(String a,int b){
	}
}
