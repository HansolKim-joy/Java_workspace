package com.kh.example.chap02_abstractNInterface.family.controller;

import com.kh.example.chap02_abstractNInterface.family.model.vo.Baby;
import com.kh.example.chap02_abstractNInterface.family.model.vo.Basic;
import com.kh.example.chap02_abstractNInterface.family.model.vo.Family;
import com.kh.example.chap02_abstractNInterface.family.model.vo.Mother;

public class FamilyController {
	public void method() {
//		Family f = new Family();
		// Cannot instantiate the type Family
		// 왜냐하면 Family 추상클래스이고 추상클래스는 객체 생성 불가능 하기 때문이다.
		
		Family f1 = new Mother("어머니", 50, 70, "출산");
		// 추상클래스는 참조형 변수로는 사용할 수 있다고 하였기 때문에 이것은 가능
		
		Family f2 = new Baby("베이비", 3.5, 70);
		
		System.out.println(f1);
		System.out.println(f2);
		
//		Basic b = new Basic(); - 불가능 : 추상 메소드의 집합인 인터페이스이기 떄문에 객체 생성 불가능
		Basic b1 = new Mother("어머니", 50, 70, "출산");
		Basic b2 = new Baby("베이비", 3.5, 70);
		
		System.out.println(b1);
		System.out.println(b2);
	}
}
