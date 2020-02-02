package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child3 extends Parent {
	public Child3() {
//		super.num = 10; // private - 나 자신이라 안됨
//		super.dNum = 90.9; // default - 나 자신도 같은 패키지도 아니어서 안됨
		super.bool = false; // protected - 나 자신도 패키지도 아니지만 다른 패키지의 후손클래스이기 때문에
		super.ch = 'b'; // public - 전체이기 때문에
	}
}
