package com.kh.example.chap02_class.defaultClass.controller;

// import가 없음 
 // 왜냐하면 실행하려는 두개의 클래스가 같은 패키지 내에 있기때문에 따로 그 클래스가 속한 패키지를 지정해줄 필요성이 없음

public class Run {
	public static void main(String[] args) {
		DefaultClassTest dct = new DefaultClassTest();
		dct.test();
		
		// 이 경우에는 run클래스가 같은 패키지 안에 있기 때문에 가능함
	}
}
