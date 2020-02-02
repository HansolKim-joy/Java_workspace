package com.kh.example.test.model.vo;

public class Child2 extends Parent {
	// 상속 받을 때의 클래스 표현식
	private String str;
	
	public Child2() {
		// 객체 생성을 할 필요가 없음
		// 왜냐하면 상속받았기 때문에
//		super.num = 10; // 접근 범위가 private이기 때문에 
		super.dNum = 10.2; // 접근 범위가 default - 같은 패키지이기 때문에
		super.bool = false; // 접근 범위가 protected - 같은 패키지이기 때문에 (후손)
		super.ch = 'A'; // 접근 범위가 public - 전체이기 때문에
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}

}
