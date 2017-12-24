package com.zn.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testIter();
		
		List l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		List subList = l.subList(0,5);
		System.out.println(subList.size());
		System.out.println(subList.get(4));
		
		
	}

	public static void testIter() {

		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>(Arrays.asList("a", "b", "c", "d"));
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			if (s.equals("a")) {
				list.remove("a");
				list.add("e");
			}
		}
		
		System.out.println(list.size());
	}
	
	

}
