package com.kh.example.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public void method1() {
		Date today = new Date();
		System.out.println(today); // 현재 시간
		
		// 1970년 1월 1일 0시 0분 0초 이후로 흐른 시간을 가져올 때
		System.out.println(today.getTime()); 
		
		Date time = new Date(1578917293998L);
		System.out.println(time); // 아까 찍었을 때의 시간을 구해올 수 있음
		
		Date origin = new Date(0);
		System.out.println(origin); 
		
		Date date = new Date(2020, 1, 13); 
		// Date에 취소선 : The constructor Date(int, int, int) is deprecated
	}
	
	public void method2() {
//		Calendar c = new Calendar(); // Calender는 추상클래스여서 객체 생성이 안됨
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		// 출력값 길게 나오는데 Month=0으로 나옴
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year); // 위에 출력된 것중에 YEAR을 뽑아서 출력한 것
		
		int month = c.get(Calendar.MONTH);
//		System.out.println(month); // 이렇게 하면 0이 됨 => 왜냐하면 0인덱스 기반이기 떄문에
		System.out.println(month + 1);
		
		int date = c.get(Calendar.DATE);
		System.out.println(date);
		
		int amPm = c.get(Calendar.AM_PM);
		System.out.println(amPm); // 오전은 0으로 출력, 오후는 1로 출력 됨
		
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour);
//		hour = c.get(Calendar.HOUR_OF_DAY);
//		System.out.println(hour);
		
		int min = c.get(Calendar.MINUTE);
		System.out.println(min);
		
		int sec = c.get(Calendar.SECOND);
		System.out.println(sec);
		
	}
	
	public void method3() {
		// GregorianCalendar는 특정 날짜 값을 입력해서 객체를 생성하는 기능 제공
		// 2020.6.17
		int year = 2020;
		int month = 5; //인덱스 기준이기 때문에 6월은 5로 입력해야함
		int date = 17;
		int hour = 22;
		int min = 0;
		int sec = 0;
		
		GregorianCalendar gc = new GregorianCalendar(year, month, date, hour, min, sec);
		long time = gc.getTimeInMillis();
		Date endDay = new Date(time);
		System.out.println(endDay);
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.MONTH) + 1);
		System.out.println(gc.get(Calendar.DATE));
		
		// 2020-06-17 수요일 오후 22시 00분 00초
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일 a HH시 mm분 ss초");
		String fmt = sdf.format(endDay);
		System.out.println(fmt);
	}
}
