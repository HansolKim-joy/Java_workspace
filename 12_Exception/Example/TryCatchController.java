package com.kh.example.chap02_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1() 호출됨...");
		
		try {
			method2();
			System.out.println("예외 발생 시에 출력될까? : ㄴㄴ");
			// 출력 안되는 이유 : method2()에서 예외발생 하니까 catch로 넘어갔음
		} catch (IOException e) {
			e.printStackTrace(); // 반드시 이렇게 할 필요 없음
//			System.out.println(e.getMessage()); // e.getMessage - method3()에서 throw new IOException("str"); 하면 str이 출력됨 / 없으면 null
		} catch (Exception e) {
			System.out.println("Exception으로 잡음");
		} finally {
			System.out.println("예외 발생 여부와 상관없이 무조건 수행됨");
		}
		System.out.println("method1() 종료됨...");
		
	}
	
	public void method2() throws IOException {
		System.out.println("method2() 호출됨...");
		method3();
		System.out.println("method2() 종료됨...");
	}
	
	public void method3() throws IOException {
		System.out.println("method3() 호출됨...");
		throw new IOException("IOException을 강제로 발생시켰습니다.");
//		System.out.println("method3() 종료됨...");
	}
}
