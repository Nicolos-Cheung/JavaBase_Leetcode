package com.zn.company.dji;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class PunchRecording {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int x = 0;

		String[] str = new String[num];

		while (x < num) {
			str[x] = scan.next();
			x++;
		}

		Arrays.sort(str);

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// 依次遍历
		int i = 0;
		while (i < str.length) {
			compute(map, str[i], str[i + 1]);
			i += 2;
		}

		System.out.println(getdiff("01:00:00", "02:00:00"));

	}

	private static void compute(HashMap<String, Integer> map, String str1, String str2) {

		String[] split = str1.split(" ");
		String key = split[0];

		int value = 0;

		// 判断凌晨
		int t1 = getdiff(str1, "03:00:00");
		if (t1 > 0) {
			// 出在3点以后
			int t2 = getdiff(str2, "03:00:00");
			if (t2 < 0) {
				return;
			}else{
				
				//key 前一天
				
				
				
			}

		} else {
			// 判断午休
			
		}

		// 判断月末
		
		

		if (map.containsKey(key)) {
			map.put(key, map.get(key) + value);
		} else {
			map.put(key, value);
		}

	}

	public static int getdiff(String sd1, String sd2) {

		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		try {
			Date d1 = df.parse(sd1);
			Date d2 = df.parse(sd2);
			int diff = (int) (d2.getTime() - d1.getTime());
			return diff / (1000 * 60);
		} catch (Exception e) {
		}
		return 0;

	}

}
