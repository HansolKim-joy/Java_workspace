package com.kh.example.chop06_method.controller;

import com.kh.example.chop05_construnctor.model.vo.User;

public class MethodTest {
	// 매개변수의 유무와 반환값의 유무에 따른 구분
	
	
	// 1. 매개변수 없고 반환값 없는 메소드
	public void method1() {
		// 반환값 x      매개변수 x
		System.out.println("매개변수와 반환값 둘다 없는 메소드입니다.");
	}
	
	
	// 2. 매개변수 없고 반환값 있는 메소드
	public int method2() {
		// 반환값 o    매개변수 x
		// This method must return a result of type int
		// 이 메소드는 (int타입 : 현재 타입이 int이기 때문에)의 결과를 반드시 리턴해야한다
		// 반환형이 존재하는 메소드에서 return값을 명시해주지 않았을때 나오는 에러
		
//		return 0;
		// 값 자체를 넣을 수도 있고
		
		int i = 10;
		return i;
		// 변수안에 넣을 수도 있음
	}
	
	
	// 3. 매개변수 있고 반환값 없는 메소드
	public void method3(int num1, int num2) {
		// 반환값 x        매개변수 o (2개)
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		int sum = num1 + num2;
		
		System.out.println("sum : " + sum);
	}
	
	
	// 4. 매개변수 있고 반환값 있는 메소드
	public int method4(int num1, int num2) {
		// 반환값 o        매개변수 o
		return num1 + num2;
		// 꼭 int sum을 만들어서 반환할 필요 없이 그냥 식으로 해서 반환도 가능
		
	}
	
	
	// 심화 1. 반환값이 배열인 경우
	public int[] method5() {
		int[] iArr = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] *= 10;
		}
		System.out.println("MethodTest iArr : " + iArr);
		return iArr;
	}
	
	
	// 심화 2. 반환값이 클래스인 경우
	public User method6() { // import 함
		User user = new User("user01", "pass01","박신우");
		System.out.println("MethodTest user : " + user);
		
		return user;
	}
}
