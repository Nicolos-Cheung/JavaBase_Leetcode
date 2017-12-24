package com.zn.company.thoughtworks;

import java.text.ParseException;
import java.util.Calendar;

public class CalendarFactory {

	private static MyCalendar calendar;

	public static MyCalendar getInstance(Calendar datebegin, Calendar dateend) {
		calendar = new MyCalendar(datebegin, dateend);
		return calendar;
	}

	public static MyCalendar getInstance(String datebegin, String dateend) {
		try {
			calendar = new MyCalendar(datebegin, dateend);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return calendar;
	}

}
