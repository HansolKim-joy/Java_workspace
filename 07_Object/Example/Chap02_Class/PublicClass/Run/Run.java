package com.kh.example.chap02_class.publicClass.run;

import com.kh.example.chap02_class.publicClass.controller.PublicClassTest;

public class Run {
	public static void main(String[] args) {
		PublicClassTest pct = new PublicClassTest();
		
		// import 안하는 방법 : 
		// com.kh.example.chap02_class.publicClass.controller.PublicClassTest pct = new com.kh.example.chap02_class.publicClass.controller.PublicClassTest();
		// 다른 패키지의 같은 이름의 클래스를 사용하고 싶을때 
		// 하나를 선택해 먼저 import를 하면 이후의 것들은 모두 이미 불러낸 패키지에서의 것을 사용
		// 다른 패키지의 내용을 사용하고 싶을 때 위와 같은 방법을 사용하여 따로 지정한다.
		
		pct.test();
	}
}
