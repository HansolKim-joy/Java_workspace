package com.kh.example.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public void method1() {
		Date today = new Date();
		System.out.println(today); // ���� �ð�
		
		// 1970�� 1�� 1�� 0�� 0�� 0�� ���ķ� �帥 �ð��� ������ ��
		System.out.println(today.getTime()); 
		
		Date time = new Date(1578917293998L);
		System.out.println(time); // �Ʊ� ����� ���� �ð��� ���ؿ� �� ����
		
		Date origin = new Date(0);
		System.out.println(origin); 
		
		Date date = new Date(2020, 1, 13); 
		// Date�� ��Ҽ� : The constructor Date(int, int, int) is deprecated
	}
	
	public void method2() {
//		Calendar c = new Calendar(); // Calender�� �߻�Ŭ�������� ��ü ������ �ȵ�
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		// ��°� ��� �����µ� Month=0���� ����
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year); // ���� ��µ� ���߿� YEAR�� �̾Ƽ� ����� ��
		
		int month = c.get(Calendar.MONTH);
//		System.out.println(month); // �̷��� �ϸ� 0�� �� => �ֳ��ϸ� 0�ε��� ����̱� ������
		System.out.println(month + 1);
		
		int date = c.get(Calendar.DATE);
		System.out.println(date);
		
		int amPm = c.get(Calendar.AM_PM);
		System.out.println(amPm); // ������ 0���� ���, ���Ĵ� 1�� ��� ��
		
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
		// GregorianCalendar�� Ư�� ��¥ ���� �Է��ؼ� ��ü�� �����ϴ� ��� ����
		// 2020.6.17
		int year = 2020;
		int month = 5; //�ε��� �����̱� ������ 6���� 5�� �Է��ؾ���
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
		
		// 2020-06-17 ������ ���� 22�� 00�� 00��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E���� a HH�� mm�� ss��");
		String fmt = sdf.format(endDay);
		System.out.println(fmt);
	}
}
