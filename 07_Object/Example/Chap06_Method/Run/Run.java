package com.kh.example.chop06_method.run;

import com.kh.example.chop05_construnctor.model.vo.User;
import com.kh.example.chop06_method.controller.MethodTest;
import com.kh.example.chop06_method.model.vo.Trainee;

public class Run {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
//		int a = mt.method1();
		// Type mismatch: cannot convert from void to int
		// void이기때문에 반환값이 없으므로 int로 받을 수 없다(double 등등 모든 것들 마찬가지)
		mt.method1();
		
		int result = mt.method2();
		// int값이고 반환값을 담아올 변수를 잡음
		System.out.println(result);
		// 이 위에 줄은 반환값을 result 변수에 담아서 result 값을 출력하는 거고
		System.out.println(mt.method2());
		// 이 위에 줄은 반환값을 바로 출력하는 것이기 때문에 똑같음
		
		mt.method3(10, 20);
		
		int result2 = mt.method4(10, 30);
		System.out.println(result2);
		// 출력하기를 원한다면 위 아래 선택해서 둘중 편한걸로  하면 됨 
		System.out.println(mt.method4(10, 30));
		
		// 심화 1
		int resultArr[] = mt.method5();
		System.out.println("resultARR : " + resultArr);
		
		// 심화 2
		User user = mt.method6(); // method명 뒤에 :이 붙으면 반환값을 나타냄
		System.out.println("Run user : " + user);
		
		
		/////////////////////////////////////////////////
		
		Trainee tt = new Trainee("박신우"); // 대기생
		System.out.println(tt.inform());
		
		// 더 알아보니까 KH 너무 좋네! 다녀야겠다
		// 등록할게요~~~
		// ㅇㅋ 시험 볼게요 => 20점
		Trainee.setScore(20);
		System.out.println(tt.inform());
		double score = Trainee.getScore();
		System.out.println(score);
		
		// 시험 20점
		// 가까운 개강일 23일
		// g반인데 등록? oooo 등록
		tt.setClassRoom('g');
		System.out.println(tt.inform());
		System.out.println(tt.getClassRoom());
	}

}
