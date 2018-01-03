package com.zn.base;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.zn.utils.DateUtils;

public class DateTest {

	public static void main(String[] args) throws ParseException {
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
		
		
		
		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.DATE, -7); //当前日期的前7天
		cal.add(Calendar.HOUR,-23);
		String d = DateUtils.format(cal.getTime(),"yyyy-MM-dd HH:mm:ss");
		System.out.println(d);
		
		
		Date parse2 = format.parse("2017-12-21");
		Date parse3 = format.parse("2017-12-22");
		System.out.println(parse2.getTime()>parse3.getTime());
		
		
	}

}
