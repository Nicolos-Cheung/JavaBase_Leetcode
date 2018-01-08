package com.zn.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testIter();
		
		List<Map<String,String>> l = new ArrayList<>();
		Map<String,String> h1 = new HashMap<String, String>();
		h1.put("reviewTime", "2018-01-02");
		Map<String,String> h2 = new HashMap<String, String>();
		h2.put("reviewTime", "2017-04-02");
		Map<String,String> h3 = new HashMap<String, String>();
		h3.put("reviewTime", "2018-09-02");
		Map<String,String> h4 = new HashMap<String, String>();
		h4.put("reviewTime", "2017-09-12");
		Map<String,String> h5 = new HashMap<String, String>();
		 l.add(h1);
		 l.add(h2);
		 l.add(h3);
		 l.add(h4);
		 
		Collections.sort(l,new MapComparator());
		
		l.stream().forEach((s)->System.out.println(s.get("reviewTime")));
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

class MapComparator implements Comparator<Map<String ,String>>{

	@Override
	public int compare(Map<String ,String> o1, Map<String,String> o2) {
		// TODO Auto-generated method stub
		
		return o1.get("reviewTime").compareTo(o2.get("reviewTime"));
	}
	
	
}
