package com.zn.oom;

import java.util.ArrayList;
import java.util.List;

public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test1();

	}

	// -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:PermSize=10M
	// -XX:MaxPermSize=10M -XX:SurvivorRatio=6
	// -XX:PermSize=10M -XX:MaxPermSize=10M -XX:+PrintGCDetails
	private static void test() {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		int i = 0;
		while (true) {
			list.add(String.valueOf(i++).intern());
		}

	}

	private static void test1() {
		// TODO Auto-generated method stub
		String str1 = new StringBuilder().append("计算机").append("软件").toString();
		System.out.println(str1.intern() == str1);

	}

}
