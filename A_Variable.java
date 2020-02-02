package com.kh.variable;

public class A_Variable { //클래스
	
	public void declareVariable() { //메소드
		//변수 선언 후 초기화
		//A. 변수 선언 : 자료형 변수명;
		//1. 논리형 
		boolean isTrue;
		
		//2. 문자형
		//2-1. 문자 
		char ch;
		//2-2. 문자열
		String str;
		
		//3. 숫자형
		//3-1. 정수
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		//3-2. 실수
		float fNum;
		double dNum;
		
		//B. 초기화(대입) : 변수명 = 값;
		isTrue = true;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
//		fNum = 4.0;
		//Type mismatch: cannot convert from double to float
		// : 4.0은 실수인데 기본적으로 실수는 double이 기본형이기 때문에 
		// 4.0을 float가 아닌 double으로 보고 있음
		// 근데 fNum은 자료형은 float(4byte)인데 넣고자 하는 값은 8byte인 double형이기 때문에
		// 큰 값을 작은 공간에 집어 넣을 수 없다면서 에러가 떴음
		fNum = 4.0f;
		// 문장 자체에서 주석을 넣고 싶으면 ctrl + / 하기 = 그 문장에 커서를 두고
		dNum = 8.0;
		
		ch = 'A';
		str = "A";
		//문자열은 ""를 사용해서 집어 넣는다 & 문자를 넣고 싶으면 ''를 사용해서 집어 넣는다.
		//한 글자를 string 안에 넣어도 상관 없다 = 한 글자 이상을 넣을 수 있다고 했기 때문에
		//하지만 char 안에 여러 글자를 넣게 되면 빨간 줄 - 에러 발생
		
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
		//insert 버튼 누르면 뒤에 말이 밀리면서 지워짐 - 다시 insert 버튼 누르기 
		// 저장하는 습관!! 저장 저장 저장 저장 저장 저장 저장
		// main 메소드 안에 모든 코드를 넣으면 느려짐 - 따라서 실행부와 기능(로직)은 따로 만들어 주는 것이 좋음
		//지금 이 것은 로직 메소드 이고
		//이제 실행 메소드(main 메소드)를 해보자
	}
	public void initVariable() {
		// 변수 선언과 동시에 초기화
		// 1. 논리형
		boolean isTrue = false;
		
		// 2. 문자형
		// 2-1. 문자
		char ch = '가'; // 영어일 필요 없음
		// 2-2. 문자열
		String str = "KH정보교육원";
		
		// 3. 숫자형
		// 3-1. 정수
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		
		// 3-2. 실수
		float fNum = 4.0f;
		double dNum = 8.0d;
		
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : "+ str);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : "+ lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
	}
	
}
