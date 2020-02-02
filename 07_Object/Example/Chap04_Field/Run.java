package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.B_KindsOfVariable2;
import com.kh.example.chap04_field.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		// 객체 생성 
		B_KindsOfVariable2 bkv = new B_KindsOfVariable2();
		//							--------------------- 얘는 생성자
		
		int a = bkv.staticNum;
		// The static field B_KindsOfVariable2.staticNum should be accessed in a static way
		// static 방법으로 접근해야 한다는 건 객체를 생성해서 변수에 접근하는 것이 아니라는 의미
		// 이는 객체를 만들어 접근하지 않아도 된다
		
		int a1 = B_KindsOfVariable2.staticNum;
		// " 클래스 명.변수명 "의 방법으로 접근함
		// static이라는 예약어를 사용했기때문에 이렇게 사용 가능 
		// 프로그램을 시작할때 static 예약어로 지정한 것들(변수, 메소드 등 상관 없음)을 static영역에 올려놓는다.
		// 즉, static영역에 올라가있기 때문에 객체 생성 없이 가능
		// static 영역에 들어가면 이후 Stack영역, Heap영역에서 가져다 쓸 수 있음(공유)
		
		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2();
		// testNum은 Stack영역에 있어서 
		// staticTestNum은 Static영역에 있어서 
		
		Product p = new Product();
		p.inform();
		// JVM 기본값 초기화 : null, null, 0, 0
		// 명시적 초기화 : 초코파이, 오리온, 1500, 100
		// 인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 90
		
		Product p2 = new Product();
		p2.inform();
		// 인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 80
		// 80으로 또 줄어든 이유는 num은  static영역에 있는 것이고 이게 먼저 90으로 줄었기 때문에 거기서 10이 준 80이 나옴
		
		Product p3 = new Product();
		p3.inform();
		// 인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 70
		// 칸초, 롯데, 1000, 139
		// 칸초, 롯데, 1000, 129
		// 칸초, 롯데, 1000, 119
	}
}
