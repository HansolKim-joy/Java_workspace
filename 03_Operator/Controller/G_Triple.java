package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// 삼항 연산자 
	// (조건식)? 식1 : 식2;
	// 조건식이 true일 때 식1 수행, 조건식이 false일때 식2 수행
	
	public void method1() {
		// 입력한 정수가 양수인지 아닌지 판별
		// 양수면 "양수다", 양수가 아니면 "양수가 아니다"라는 문장 출력
		// 정수 하나 입력 : 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
//		String result = num > 0 ? "양수다." : "양수가 아니다."; 
		// 결과 값이 문자열이기 때문에 string 자료형을 사용한다.
		
		// 중첩 삼항 연산자
		String result = num > 0 ? "양수다." : (num == 0 ? "0이다." : "음수다.");
		
		System.out.println(num + " 숫자는 " + result);
		
	}
	
	public void method2() {
		// 입력한 정수가 짝수인지 홀수인지 판별
		// 홀수면 "홀수입니다", 짝수면 "짝수입니다"
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num2 = sc.nextInt();
		
		String result2 = (num2%2)==0 ? "짝수입니다." : "홀수입니다.";	
		System.out.println(num2 + " 은(는) " + result2);
		
		// 혹은 조건식만 따로 빼기 or 계산식만 따로 빼기 해서 가능
	}
}
