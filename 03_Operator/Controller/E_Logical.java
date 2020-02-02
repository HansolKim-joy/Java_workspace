package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	// && : 피연산자가 모두 true일 때, true 반환 (그리고, ~면서)
	// || : 피연산자 중에서 하나라도 true일 때, true 반환 (또는, ~거나)
	
	public void method1() {
		// 입력한 정수 값이 1~100사이의 숫자인지 확인
		// 정수 하나 입력 : 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : "); // 쌤은 println으로 사용함
		int num = sc.nextInt();
		
		// 1~100 사이의 숫자 = 숫자가 1보다 크거나 같고 100보다 작거나 같다. => and / &&
		System.out.println("1부터 100 사이의 숫자인지 확인 : " + (num >=1 && num <=100));
	}
	
	public void method2() {
		// 입력한 문자 값이 대문자 인지 확인
		// 문자 하나 입력 : 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 대문자 인지 확인 - 하나로도 사용하능 하지만 복잡할 거 같아서 따로 했음! = 한문장으로 하는 방법 있음
		boolean isCap = (ch >= 'A' && ch <= 'Z'); // 문자도 숫자로 치환되기 때문에 이렇게 표현 가능함
		System.out.println("영어 대문자가 맞습니까? " + isCap);
		
		// 계속 하시려면 y 혹은 Y를 입력하세요 : 
		// 계속 하시겠다고 하셨습니까? : __________
		
		System.out.print("계속 하시려면 y 혹은 Y를 입력하세요 : ");
		char ch1 = sc.nextLine().charAt(0);
		System.out.println("계속 하겠다고 하셨습니까? : " + (ch1 == 'y' || ch1 == 'Y'));
		
//		boolean isYes = (ch1 == 'y' || ch1 == 'Y');
//		System.out.println("계속 하겠다고 하셨습니까? : " + isYes);
		// 이건 좀 다른 형태임 - 둘의 차이 잘 비교해보기! 

	}
}
