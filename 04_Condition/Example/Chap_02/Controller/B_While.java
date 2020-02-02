package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 	while(조건식){
	 		수행될 문장;
	 		[증감식 or 분기문]; // []는 생략될 수 있다는 표현
	 	}
	 	조건식 확인 -> (조건식 true일 때) 실행 문장 수행 -> 조건식 확인 -> (반복)
	 	조건식 결과가 false가 될 때까지 반복 
	 */
	public void method1() {
		// 1부터 5까지 출력
		int i = 1;
		
		while(i <= 5) {
			System.out.println(i + "번째 반복문 수행");
			i++;
		}
	}
	
	public void method1_1() {
		//자기소개 5번 하기
		int i = 1;
		
		while(i <= 5) {
			System.out.println("내 이름은 김한솔이야.");
			i++;
		}
	}
	
	public void method2() {
		// 5부터 1까지 반복
		int i = 5;
		
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void method3() {
		// 1에서 10사이의 홀수만 출력
		int i = 1;
		
		while(i <= 10) {
			System.out.println(i + " ");
			i += 2;
		}
	}
	
	public void method4() {
		// 정수 두 개를 입력 받아 그 사이 숫자 출력
		// 정수 두 개를 입력하세요.
		// 단, 첫 번째 숫자가 두번째 숫자보다 작게 입력해주세요.
		// 첫 번째 숫자 : 
		// 두 번째 숫자 :
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하세요.\n"
				+ "단, 첫 번째 숫자가 두 번째 숫자보다 작게 입력해주세요.");
		System.out.print("첫 번째 숫자 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int second = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if(first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}
		
		while(min <= max) {
			System.out.print(min + " ");
			min++;
		}
	}
	
	public void method4_1() {
		// 정수를 하나 입력 받아 그 수가 1~9 사이의 수 일때만 그 수의 구구단 출력
		// 조건이 맞기 않으면 1~9 사이의 양수를 입력하여야 합니다. 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int dan = sc.nextInt();
		
		int su = 1;
		if(dan >=1 && dan <= 9) {
			while(su <= 9) {
				System.out.println(dan + " * " + su + " = " + dan * su);
				su++;
			}
		} else {
			System.out.println("1~9 사이의 양수를 입력하여야 합니다.");
		}
	}
	
	public void method5() {
		// 1부터 10 사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계 출력
		
		
		int random = (int)(Math.random() * 10 + 1);
		
		int sum = 0;
		
		int i = 1;
		
		while(i <= random) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 %d까지의 정수 합계 : %d", random,sum);
	}
	
	public void method6() {
		// 사용자에게 문자열을 입력 받아 인덱스 별로 문자 출력
		// 문자열 입력 : apple
		// 0 : a
		// 1 : p
		// 2 : p
		// 3 : l
		// 4 : e
		
		// 문자열이 5개 이면 index가 5개 나와야 하고 
		// 문자열이 4개 이면 index가 4개 나와야 한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : "); // apple 입력시
		String str = sc.nextLine(); // str에 apple이 들어가 있는 상황
		
		// 방식 1. for문 사용
		
//		for(int i = 0; i < 5; i++) {
//			char ch = str.charAt(i);
//			System.out.println(i + " : " + ch);
//		}
//		
		
//		// ** 문자열의 길이를 반환하는 메소드가 존재 : length()
//		int length = str.length();
//		System.out.println(str + "의 길이 : " + length);
//		
//		// 재시도
//		for(int i = 0; i < length; i++) {
//			char ch = str.charAt(i);
//			System.out.println(i + " : " + ch);
//		}
		
		
		// 방식 2. while문 사용
		int i = 0;
		
		while(i < str.length()) {
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
			i++;
		}	
	}
	
	public void method7() {
		// 2단부터 9단까지 출력
		
		int dan = 2;
		
		while(dan <= 9) {
			int su = 1;
			while(su <= 9) {
				System.out.printf("%d * %d = %d",dan,su,dan*su);
				System.out.println();
				su++;
			}
			dan++;
			System.out.println();
		}
	}
	
	public void method8() {
		// 아날로그 시계
		
		int hour = 0;
		
		while(hour < 24) {
			int min = 0;
			while(min < 60) {
				System.out.printf("%2d시 %2d분%n", hour, min);
				min++;
			}
			hour++;
			System.out.println();
		}
		// %d : 정수의 자리를 확보하겠다.
		// %2d : 2자리 정수의 자리를 확보하겠다.
		// 이는 빈칸에 대해서 오른쪽 정렬된 것으로 보여지고 %-2d는 왼쪽 정렬된 것으로 보여진다. 
	}
	
	public void method9() {
		// 메뉴 반복에서는 for문보다 while문이 많이 사용됨
		
		int menuNum = 0; 
		//While안에 menuNum만 있었다면 while 조건문을 만나기 전 menuNum이 없으므로
		//오류가 발생하기 때문에 그 전에 menuNum 변수를 while전에 먼저 선언해줘야 한다.
		
		while(menuNum != 9){
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 1~5까치 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 1~10까지 홀수 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			menuNum = sc.nextInt();
			// 원래 int menuNum으로 써야 하지만
			// while문 밖에 menuNum의 변수 선언을 먼저 하였으므로
			// 또 menuNum이라는 변수를 선언할 필요가 없으므로 int라는 정수형을 넣어줄 필요가 없다.
			
			// 친절하게 안내문도 계속 반복되는 것이 좋아서 모두 위에 안내문에 대한 출력까지 반복되면 좋음.
			//따라서 while문 안에 위 211 ~ 부터 다 반복시켜 주는 것이 좋음
			
			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 9: System.out.println("종료합니다."); break;
			default: System.out.println("잘못 입력하셨습니다.");	
			}
		}
	}
}
