package com.zn.company.thoughtworks;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ManageCar {

	private static volatile HashMap<String, TreeSet<String>> time_main = new HashMap<String, TreeSet<String>>();
	private static volatile HashMap<String, TreeSet<String>> dis_main = new HashMap<String, TreeSet<String>>();
	private static volatile HashMap<String, TreeSet<String>> write_off = new HashMap<String, TreeSet<String>>();
	private static ArrayList<Car> cars = new ArrayList<Car>();
	private static Scanner cin;

	public static void main(String[] args) {
		// 数据准备
		initDate();
		// 数据解析
		parseCars(cars);
		// 输出结果
		printdetail();

	}

	private static void printdetail() {
		System.out.println("Reminder");
		System.out.println("==================");
		System.out.println();
		System.out.println("* Time-related maintenance coming soon...");
		printMap(time_main);
		System.out.println();
		System.out.println("* Distance-related maintenance coming soon...");
		printMap(dis_main);
		System.out.println();
		System.out.println("* Write-off coming soon...");
		printMap(write_off);

	}

	private static void initDate() {

		cin = new Scanner(System.in);
		String str = cin.nextLine();
		String SubmitDate = str.split(":")[1].trim();

		// 输入记录条数
		int n = cin.nextInt();
		int i = 0;
		Car c;

		while (i < n) {
			String detail = cin.nextLine();
			if (detail == null || detail.equals("")) {
				continue;
			}
			c = new Car(detail, SubmitDate);
			cars.add(c);
			i++;
		}

	}

	private static void parseCars(ArrayList<Car> cars) {

		for (Car car : cars) {
			switch (car.carstatus) {

			// 1定期保养 2公里保养 3报废
			case 1:
				record2Map(car, time_main);
				break;
			case 2:
				record2Map(car, dis_main);
				break;
			case 3:
				record2Map(car, write_off);
				break;

			default:
				break;
			}

		}

	}

	public static void record2Map(Car car, HashMap<String, TreeSet<String>> map) {
		TreeSet<String> treeSet = time_main.get(car.brand);
		if (treeSet == null) {
			treeSet = new TreeSet<String>();
			treeSet.add(car.carnumber);
			map.put(car.brand, treeSet);
		} else {
			treeSet.add(car.carnumber);
		}
	}

	public static void printMap(HashMap<String, TreeSet<String>> map) {
		StringBuilder sb;

		for (Map.Entry<String, TreeSet<String>> entry : map.entrySet()) {
			sb = new StringBuilder();
			sb.append(entry.getKey());
			sb.append(": ");
			TreeSet<String> set = entry.getValue();
			sb.append(set.size());
			sb.append("(");

			for (String string : set) {
				sb.append(string);
				sb.append(",");
			}
			sb.deleteCharAt(sb.length() - 1);
			sb.append("");

		}

	}

}

class Car implements Comparable<Car> {

	public String carnumber; // 车牌号
	public int carstatus; // 0 车辆正常 1定期保养 2公里保养 3报废
	public String brand; // 汽车品牌

	private String buydate; // 车辆购买时间
	private int Kilometer; // 公里数
	private boolean isOverhaul; // 是否大修

	public Car(String detail, String submitDate) {

		// CAR0001|2025/04/05|Porsche|10000|F
		String[] split = detail.split("\\|");
		carnumber = split[0];
		buydate = split[1];
		brand = split[2];
		Kilometer = Integer.parseInt(split[3]);
		isOverhaul = split[4].equals("T") ? true : false;

		// datacheck();
		statecheck(submitDate);
	}

	private void statecheck(String submitDate) {

		MyCalendar calendar = CalendarFactory.getInstance(buydate, submitDate);

		int yeardetail = calendar.getYear();
		int monthdetail = calendar.getMonth();

		// 是否报废
		if (isOverhaul) {
			if (yeardetail >= 3 || (yeardetail >= 2 && (monthdetail >= 11))) {
				this.carstatus = 3;
				return;
			}
		} else {
			if (yeardetail >= 6 || (yeardetail >= 5 && monthdetail >= 1)) {
				this.carstatus = 3;
				return;
			}
		}

		// 判断是否需要保养
		if ((10000 - Kilometer % 10000) <= 500) {
			this.carstatus = 2;
			return;
		}

		// 定期保养
		if (isOverhaul) {
			if (monthdetail >= 2) {
				this.carstatus = 1;
				return;
			}
		} else {
			// 无大修
			if (yeardetail >= 3) {
				// 3年及以上车辆每6个月定期保养1次
				if (monthdetail >= 5) {
					this.carstatus = 1;
					return;
				}

			} else {
				// 3年及以下车辆每12个月定期保养1次
				if (monthdetail >= 11) {
					this.carstatus = 1;
					return;
				}
			}
			this.carstatus = 0;
		}
	}

	@Override
	public int compareTo(Car o) {
		return this.carnumber.compareTo(o.carnumber);
	}

}
