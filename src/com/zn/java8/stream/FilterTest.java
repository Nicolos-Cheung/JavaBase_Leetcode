package com.zn.java8.stream;

import java.util.List;

import com.zn.factory.DataFactory;

public class FilterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = DataFactory.getStringList2(5);
		list.stream().filter((s)->s.length()>=3).forEach((s)->System.out.println(s));
		
		
		list.stream().sorted().forEach((s)->System.out.println(s));
		
		list.stream().map((s)->s.toUpperCase());
		
		boolean result = list.stream().anyMatch((s)->s.startsWith("a"));
		
		long count = list.stream().count();
		
		list.parallelStream().map((s)->s.toUpperCase());
		
	}

}
