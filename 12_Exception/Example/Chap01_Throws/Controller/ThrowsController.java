package com.kh.example.chap01_throws.controller;

public class ThrowsController {
	public void method1() throws Exception{
		System.out.println("method1() 호출됨...");
		method2();
		System.out.println("method1() 종료됨...");
	}
	
	public void method2() throws Exception{
		System.out.println("method2() 호출됨...");
		method3();
		System.out.println("method2() 종료됨...");
	}
	
	public void method3() throws Exception {
		System.out.println("method3() 호출됨...");
		throw new Exception(); // 강제적으르 Exception 발생 시킴
		// Unhandled exception type Exception 
//		System.out.println("method3() 종료됨...");
		// Unreachable code = 에러발생으로 비정상 종료되고 그러면 이 코드는 도달할 수 없는 코드(실행되지 않는 코드, 의미 없는 코드)가 되어버림
	}
}
