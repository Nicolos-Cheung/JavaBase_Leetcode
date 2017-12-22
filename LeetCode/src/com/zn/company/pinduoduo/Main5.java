package com.zn.company.pinduoduo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {

		KeyValDB db = new KeyValDB();
		Scanner cin = new Scanner(System.in);

		int sum = cin.nextInt();
		int i = 0;
		while (i < sum) {
			String str = cin.nextLine();
			if (str.equals("") || str == null) {
				continue;
			}
			String[] split = str.split(" ");

			switch (split[0]) {
			case "put":
				db.put(split[1], split[2]);
				break;
			case "get":
				if (split.length == 2) {
					System.out.println(db.get(split[1]));

				} else {
					System.out.println(db.get(split[1], split[2]));
				}
				break;

			case "del":
				db.delele(split[1]);
				break;

			case "mkss":
				db.makess(split[1]);

				break;
			default:
				break;
			}
			i++;
		}

		long total = Runtime.getRuntime().totalMemory();
		long free = Runtime.getRuntime().freeMemory();
		System.out.println("The busy memory is: " + (total - free));

	}
}

class KeyValDB {

	private HashMap<String, String> map = new HashMap<String, String>();

	// 保存快照
	private HashMap<String, HashMap<String, String>> snapshot = new HashMap<String, HashMap<String, String>>();

	public void put(String key, String value) {
		map.put(key, value);
	}

	public void makess(String ssid) {

		// 深度复制
		HashMap<String, String> map1 = new HashMap<>();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			map1.put(entry.getKey(), entry.getValue());  //内存优化
		}

		snapshot.put(ssid, map);

	}

	public String get(String key) {
		String value = map.get(key);
		if (value == null) {
			return "(NULL)";
		}
		return value;
	}

	public String get(String key, String ssid) {

		HashMap<String, String> hashMap = snapshot.get(ssid);

		if (hashMap == null) {
			return "(UNKNOWN_SSID)";
		}
		String value = hashMap.get(key);
		if (value == null) {
			return "(NULL)";
		}

		return value;
	}

	public void delele(String key) {

		map.remove(key);
	}
}

/*
 * key-value
 * 
 * key --hashmap |--快照：key ssid
 * 
 */