package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	private int num;
	
	public Child1() { // 같은 패키지, Parent의 자식이 아님
		Parent p = new Parent(); // ? // 객체 생성해서 하는 방법;
		
//		p.num = 10;
		// Parent의 num은 private이기 때문에 Parent의 num이 Child1에서 보일 수 없다
		p.dNum = 0.0; // dNum은 default 지정 - 같은 패키지내이기 때문에 가능
		p.bool = false; // bool은 protected 지정 - 같은 패키지내이기 때문에 가능
		p.ch = 'A'; // ch은 public 지정 - 같은 패키지내이기 문에 가능
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}
