package com.kh.variable;

public class E_PrintMethod {
	String str1 ="안녕하세요";
	String str2 = "반갑습니다"; 
	//이러한 변수를 전역 변수라고 부름 - 클래스 안에 모든 메소드에 적용되는 변수
	
	public void printExample() {
//		String str1 = "안녕하세요";
//		String str2 = "반갑습니다";
		// printExample 메소드 안에서만 사용되는 변수를 지역 변수라고 부름
		
		System.out.print(str1);
		System.out.print(str2);
	}
	
	public void printlnExample() {
//		String str1 = "안녕하세요";
//		String str2 = "반갑습니다"; 
		//이렇게 주석처리하게 되면 24,25번째 줄에서의 str1,2가 한 메소드 안에서 찾을 수 없다는 의미로 에러가 발생
		//그러나 클래스 지정 바로 아랫줄 클래스 영역 내에 str1,2를 입력하면
		//printExample 메소드와 printlnExample 메소드 모두 클래스 안에 들어가므로 에러가 해결
		
		System.out.println(str1);
		System.out.println(str2);	
	}
	
	public void printfExample() {
		//안녕하세요, 박신우입니다. 반갑습니다. => 출력하고 싶은 내용
		//-------             -------
		// str1                 str2
		// %s : 문자열                    %s : 문자열 
		System.out.printf("%s, 박신우입니다. %s.", str1, str2 );
		//               ("출력하고 싶은 내용" , 각각 형식에 들어가는 내용의 변수들) - 형태 
		
		//반갑습니다, 친하게 지내요. => 출력하고 싶은 내용
		System.out.printf("%s, 친하게 지내요.", str2);
		
		System.out.println();
		
		//미니 문제
		// 안녕하세요, 저는 20살 박신우 강사입니다. 만나서 반갑습니다.
		int age = 20;
		String name = "박신우";
		String job = "강사";
		
		System.out.printf("%s, 저는 %d살 %s %s입니다. 만나서 %s.", str1, age, name, job, str2);
	}
	
	
	
}
