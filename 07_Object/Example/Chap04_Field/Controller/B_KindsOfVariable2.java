package com.kh.example.chap04_field.controller;

public class B_KindsOfVariable2 {
	public static int staticNum;
	
	private int testNum = 10; 
	private static int staticTestNum = 10;
	
	public B_KindsOfVariable2() { // 생성자 - 역할 : 객체만들때 사용하는거
		testNum++;
		System.out.println("testNum : " + testNum);
		
		staticTestNum++;
		System.out.println("staticTestNum : " + staticTestNum);
	}
}
