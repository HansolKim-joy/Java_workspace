package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {

	public void method() {
		// TODO Auto-generated method stub
		System.out.println("1. 부모타입 레퍼런스로 부모 객체를 다루는 경우");
		// 내가 내거를 담겠다
		Parent p = new Parent(); 
		// ㄴ부모타입 레퍼런스	ㄴ부모 객체
		p.printParent();
		System.out.println();
		
		System.out.println("2. 자식타입 레퍼런스로 자식 객체를 다루는 경우");
		// 내가 내거를 담겠다
		Child1 c1 = new Child1();
		// ㄴ자식타입 레퍼런스	ㄴ자식 객체
		c1.printChild1();
		c1.printParent();
		System.out.println();
		
		System.out.println("3. 부모타입 레퍼런스로 자식 객체를 다루는 경우");
		Parent p2 = new Child2(); // 다형성 
//		Parent p3 = new Child1(); // 다형성
		p2.printParent();
		// p2.printChild2(); 객체는 Child2인데 왜 printChild2는 안되는가?
		// 왜냐하면 사진(사진참조)에 보면 다 만들어 지는데
		// Parent 타입으로 설정했기 때문에 보여지는 영역은 Parent의 멤버들만 보여지게 되기 때문이다.
		
		
//		((Child2)p2).printChild2();
//		((Child2)p2).printParent();
//		// 변수 형변환 해준 것과 같이 Child2를 소괄호 안에 넣어주면 Child2의 메소드까지 호출할 수 있다.

		// 자식 객체가 부모 레퍼런스안에 담기는 것(부모 타입의 참조형 변수 (= 레퍼런스 변수)가 모든 자식 객체를 받을 수 있는 것) : 업 캐스팅
		// ((Child2)p2).printParent();
		// 부모의 method만 사용가능한 경우를 해결하기 위해서 자식 클래스 타입으로 형 변환을 시켜주면 자식의 method까지 사용가능할 수있게 해줌
		// 위와 같이 부모 클래스 타입의 참조형 변수를 자식 클래스 타입으로 형 변환 시켜주는 것 : 다운 캐스팅
		
		System.out.println();
		
		System.out.println("4. 자식타입 레퍼런스로 부모 객체를 다루는 경우");
//		Child2 c2 = new Parent();
		// Type mismatch: cannot convert from Parent to Child2
		// 에러모음집  8번에 내용이 정리되어 있고 ** 이 경우에는 해결할 방법이 아무것도 없음
		
//		Child c2 = (Child2) new Parent(); // 불가능
		
		
		System.out.println();
		System.out.println("==== 간단 예제 ====");
		System.out.println();
		
		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child1();
		pArr[3] = new Child2();
		
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i] instanceof Child1) {
				((Child1)pArr[i]).printChild1();
			}else if(pArr[i] instanceof Child2) {
				((Child2)pArr[i]).printChild2();
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < pArr.length; i++) {
			pArr[i].print();
		}
		// 부모야!! 가 나올 거 같은데 자식이야!! 라는 결과가 나옴 : 이런 현상을 동적바인딩이라고 함
		// 이 경우는 print메소드가 오버라이딩 되어있기 때문에 오버라이딩의 특징 중의 하나인
		// 자식 객체를 통한 실행 시 후손 것이 우선권을 가짐의 특징 때문임
		
	}

}
