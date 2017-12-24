package com.zn.company.thoughtworks;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;

public class MyCalendar {
	Calendar datebegin;
	Calendar dateend;
	DateFormat df;

	public MyCalendar(Calendar datebegin, Calendar dateend) {
		super();
		this.datebegin = datebegin;
		this.dateend = dateend;
	}

	public MyCalendar(String begin, String end) throws ParseException {
		df = new java.text.SimpleDateFormat("yyyy/MM/dd");
		datebegin = Calendar.getInstance();
		dateend = Calendar.getInstance();
		datebegin.setTime(df.parse(begin));
		dateend.setTime(df.parse(end));

	}

	/**
	 * 当前日比较
	 * 
	 * @return
	 */
	private boolean compareTo() {
		return datebegin.get(Calendar.DAY_OF_MONTH) > dateend.get(Calendar.DAY_OF_MONTH);
	}

	private int CalculatorYear() {
		int year1 = datebegin.get(Calendar.YEAR);
		int year2 = dateend.get(Calendar.YEAR);
		int month1 = datebegin.get(Calendar.MONTH);
		int month2 = dateend.get(Calendar.MONTH);
		int year = year2 - year1;
		if (compareTo()) // 计算天时向月借了一个月
			month2 -= 1;
		if (month1 > month2)
			year -= 1;
		return year;
	}

	private int CalculatorMonth() {

		int month1 = datebegin.get(Calendar.MONTH);
		int month2 = dateend.get(Calendar.MONTH);
		int month = 0;
		if (compareTo()) // 计算天时向月借了一个月
			month2 -= 1;
		if (month2 >= month1)
			month = month2 - month1;
		else if (month2 < month1) // 借一整年
			month = 12 + month2 - month1;
		return month;

	}

	private int CalculatorDay() {

		int day11 = datebegin.get(Calendar.DAY_OF_MONTH);
		int day21 = dateend.get(Calendar.DAY_OF_MONTH);

		if (day21 >= day11) {
			return day21 - day11;
		} else {// 借一整月
			Calendar cal = Calendar.getInstance();
			cal.setTime(dateend.getTime());
			cal.set(Calendar.DAY_OF_MONTH, 1);
			cal.add(dateend.DAY_OF_MONTH, -1);
			return cal.getActualMaximum(Calendar.DATE) + day21 - day11;
		}
	}

	/**
	 * 返回两个时间相隔的多少年
	 * 
	 * @return
	 */
	public int getYear() {
		return CalculatorYear() > 0 ? CalculatorYear() : 0;
	}

	/**
	 * 返回除去整数年后的月数
	 * 
	 * @return
	 */
	public int getMonth() {
		int month = CalculatorMonth() % 12;
		return (month > 0 ? month : 0);
	}

	/**
	 * 返回除去整月后的天数
	 * 
	 * @return
	 */
	private int getDay() {
		int day = CalculatorDay();
		return day;
	}

	/**
	 * 返回现个日期间相差的年月天以@分隔
	 * 
	 * @return
	 */
	public String getDate() {
		return getYear() + "@" + getMonth() + "@" + getDay();
	}
}