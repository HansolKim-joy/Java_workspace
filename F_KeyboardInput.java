package com.kh.variable;

import java.util.Scanner;

public class F_KeyboardInput {
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : "); 
		// 안내문구 역할 - 없으면 무엇을 하라는 지 모르기 때문에 사용자에게 불친절해짐 / 사용자 입장에서 생각해서 만들기
		String name = sc.nextLine(); 
		// 이 코드를 사용하면 위의 문장의 결과를 사용자가 입력할 때까지 기다림 
		// 그리고 그 결과 값을 name이라는 문자열에 입력함
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		// 정수가 아닌 수가 입력되면 빨갛게 오류로 표시됨
		
		System.out.print("키(소수점 첫째 자리까지 입력) : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님은 " + age + "세이며, 키는 " + height + "cm 입니다.");
		
	}
	public void inputScanner2() {
		// Scanner를 사용할 때 유의할 점에 대한 연습 메소드
		// 사용자에게 이름과 나이를 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 읿력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.nextLine();
		
		// 해결하는 방법 
		// 방법1. 줄바꿈을 가져갈 수 있는 nextLine() 추가
		int age = sc.nextInt();
		sc.nextLine(); // 값을 갖고 오는 용도가 아닌 버퍼에 남아있는 줄바꿈만 빼주는 역할을 하는 코드
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		
		// 방법2. age를 받을 때도 nextLine()을 쓰되 int로 파싱하기?
		// 파싱 : 문자열을 기본 자료형으로 바꿔주는 일
		// "1"는 숫자로 바꾸는 게 가능하지만, "박신우"는 숫자로 바꾸는 것이 불가능함
		// "true"는 boolean으로 해서 바꾸는 건 가능하지만, "박신우"는 boolean으로 해서 T/F로 바꾸는 것은 불가능함
//		String userAge = sc.nextLine();
//		int age = Integer.parseInt(userAge); // 파싱하는 방법 - Integer.parseInt(xx); 하기 => 나중 배움
//		// 52,53번째의 문장을 하나로 합친 것이
//		// => int age = Integer.parseInt(sc.nextLine());
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.nextLine();
		
		// 방법3. next()로 주소를 받기 - but 한계가 존재
		// 한계 : "63번째 줄"에 나타남 => 해결법은 "배열"인데 아직 배우지 않았음
//		int age = sc.nextInt(); // 버퍼에 줄바꿈이 남아져 있는 상태
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.next(); 
		// 주소를 서울시 은평구로 입력하면 - 서울시만 나옴
		// next();는 띄어쓰기를 구분자로 인식하지 않기 때문에 띄어쓰기 전만 출력된다 ------ 이것이 바로 한계!
		
		//boolean은 파싱하는 것이 유일한 방법
		
		// + 추가 : char형을 받고 싶을 때는?
		System.out.print("성별을 입력하세요 : "); // F or M 으로 받는다고 가정
	
//		String userGender = sc.nextLine();
//		char gender = userGender.charAt(0); 
		//70, 71번째 줄을 한 줄로 줄인 것이 73번째 줄
		char gender = sc.nextLine().charAt(0);
		// charAt(int index) : 문자열의 index번째의 문자를 가져와주는 메소드
		// 문자열의 시작은 0번째로 시작함
		// => charAt(0) = String에서 0번째 index의 char를 갖고 오라는 의미
		
		System.out.println(name + "님은 " + age + "세이며, 현재는 " + address + "에 살고 있습니다.");
		System.out.println("gender : " + gender);
		
		// 저장 후 실행했는데 앞에 것이 나오고 inputScanner2의 형식은 나타나지 않음??
		// => fk.inputScanner2로 안 바꿨음 - 프로그램 문제 아니고 내 문제! 잘 확인하기
		

		
		
	}
	
}
