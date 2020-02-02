package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile { 
	public void method1() {
		// 키보드로 문자열 값을 입력 받아 출력 반복 실행
		// 단, exit가 들어오면 반복 종료
		/*
		 	문자열 입력 : 안녕하세요
		 	str : 안녕하세요
		 	문자열 입력 : apple
		 	str : apple
		 	문자열 입력 : exit
		 	str : exit
		 */
		Scanner sc = new Scanner(System.in);
		
		//1. while문
		
//		String str = null; 
//		// 정수에서 int i = 0; 하는 것과 동일
//		//java.lang.NullPointerException
//		//null이라고 하면 존재할 수 없는 건데 exit랑 비교하라고 하니까 할 수 없다고 하는 내용
//		
//		String str = "";
//		//null은 진공상태와 동일하게 아무것도 없는 것에 비해 "" 이렇게 입력하는 것은 아무것도 안 넣는다는 것을 보여주는 것이므로 에러가 발생하지 않는다
//		
//		while(!str.equals("exit")) {
//			System.out.print("문자열 입력 : ");
//			str = sc.nextLine();
//			System.out.println("str : " + str);
//		}
		
		//2. do ~ while문
		String str = null;
		// 이 경우에는 do 안의 내용이 무조건 실행되고 나서 while의 조건문을 확인하니까 null;로 지정해도 문제가 생기지 않는다.
		
		do {
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		} while (!str.equals("exit"));
		}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		int menuNum = 0;
		do {
			System.out.println("1. 테스트1");
			System.out.println("2. 테스트2");
			System.out.println("3. 테스트3");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: System.out.println(1); break;
			case 2: System.out.println(2); break;
			case 3: System.out.println(3); break;
			case 9: System.out.println("종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다.");
			
			}
		} while(menuNum != 9);
	}
}
		
