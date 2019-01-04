package com.test01;

import java.text.*;
import java.util.*;

public class MTest03 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println("���� ��¥�� ���� �ð�");
		System.out.println(year + "��" + mon + "��" + day + "��");
		System.out.println(hour + "��" + min + "��" + sec + "��");
		System.out.println();
		
		TimeZone tz = null;
		GregorianCalendar date = new GregorianCalendar();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss (z Z)");
		tz = TimeZone.getTimeZone("Asia/Seoul");
		df.setTimeZone(tz);
		System.out.format("%s%n%s%n%n", tz.getDisplayName(),df.format(date.getTime()));
		
		tz = TimeZone.getTimeZone("Pacific/Honolulu");
		df.setTimeZone(tz);
		System.out.format("%s%n%s%n%n", tz.getDisplayName(),df.format(date.getTime()));
	
	}
}
