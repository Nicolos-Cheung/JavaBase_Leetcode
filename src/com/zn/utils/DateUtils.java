package com.zn.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String format(Date date, String format) {

		DateFormat f = new SimpleDateFormat(format);
		return f.format(date);

	}

}
