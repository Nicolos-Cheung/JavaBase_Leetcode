package com.zn.base;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long timetamp = 1509466797; //unix时间戳
		Date date = new Date(timetamp*1000);
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = null;
		try {
			parse = format.parse("2017-11-01");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date.getTime()>=parse.getTime());
	}

}
