package com.kh.example.chap04_field.controller;

public class A_KindsOfVariable1 { // <= 클래스 영역의 시작 
	
	// 클래스 영역에 작성하는 변수 : 필드 = 멤버 변수 = 멤버 필드 = 전역변수
	
	private int globalNum;
	
	public void method1(int num) { // <= 메소드 영역의 시작
		//				------- : 매개변수 : 메소드의 선언부 중 괄호 안에 선언하는 변수
		
		// 메소드 영역에서 작성하는 변수 : 지역변수
		int localNum;
		// 매개변수 역시 지역변수의 일종으로 생각함
		// 다른 메소드 안에서 별다른 변수 선언없이 지역변수와 매개변수를 사용할 수 없음
		
		localNum = 10;
		System.out.println(localNum);
		//The local variable localNum may not have been initialized
		// : 지역변수는 반드시 초기화가 되어 있어야 함
		
		System.out.println(num);
		// 매개변수는 초기화하지 않고 사용 가능 
		// 왜냐하면 매개변수는 값을 받아오는 역할이고 값을 받아오면 되기때문에 초기화가 필요가 없다.
		
		System.out.println(globalNum);
		// globalNum은 전역변수로 지정했기 때문에 에려없이 출력가능하다.
		
	} // <= 메소드 영역의 끝
	
	public void method2() {
//		System.out.println(localNum);
		//localNum cannot be resolved to a variable
		// 지역변수인 localNum은 method1에서 생성된 변수기 때문에 method1의 변수 초기화 후부터 사용가능한데
		// method2에서 사용하려고 하니 에러 발생
		
		System.out.println(globalNum);
		
	}
} // <= 클래스 영역의 끝
