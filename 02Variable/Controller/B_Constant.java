package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		int age; // 일반 변수 선언
		final int AGE; //상수 선언
		
		age = 20;
		AGE = 20;
		
		System.out.println("age : " + age);
		System.out.println("Age : " + AGE);
		
		// 변수의 값 변경
		age = 30;
//		AGE = 30;
		//The final local variable AGE may already have been assigned
		//AGE는 상수로 지정했기 때문에 처음 한번에 저장한 20이 30으로 다시 저장 될 수 없다
		
		System.out.println("값 변경 후 age : " + age);
		System.out.println("값 변경 후 AGE : " + AGE);
		
	}

}
