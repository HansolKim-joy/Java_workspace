package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
//		str1 == st2; => 주소값비교 
//		str1.equals(str2); => str1과 str2의 내용비교
		
		System.out.println("str1과 str2의 주소는 같은가? : " + (str1 == str2));
		System.out.println("str1과 str3의 주소는 같은가? : " + (str1 == str3));
		
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());
		System.out.println("str3의 hashCode : " + str3.hashCode());
		
		// hashcode로 실제 주소값이 같은지 다른지 알수 없음
		
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
		
		// str1과 str2는 Heap영역 안에 String pool 영역에 java라는 공간이 생기고 그 주소값을 참조하는 형식으로 같은 곳을 바라보고 있고
		// str3는 Heap영역에 java를 담고 있는 객체를 생성해서 그 주소값을 참조하고 있는 것이기 때문에
		// str1과 str2는 주소값이 같게 나오지만 str3는 그 주소값과는 다른 주소값이 나오는 것이다.
		
		str2 += "oracle"; // javaoracle;
		
		System.out.println("str1과 str2의 주소는 같은가? : " + (str1 == str2));
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
	}
	
	public void method2() {
		// StringBuffer Test
		// 계속해서 값을 변경해야 할 때 String같은 경우 값이 새로 생기고 참조 위치만 바꿔주기 때문에
		// 가비지 컬렉터가 계속 지워야 하하는 단점이 있음(불변이라는 특징 때문에)
		// 변경이 적고 읽기만 하는 경우에는 불변 클래스인 String클래스가 용이하겠지만
		// 변경해야하는 값이 많은 경우 StringBuffer이나 StringBuilder로 하는 것이 더 효율적임
		
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("초기 buffer1의 수용량 : " + buffer1.capacity()); // 기본 16문자 크기로 지정
		System.out.println("buffer1에 들어있는 실제 값의 길이 : " + buffer1.length());
		
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100); // 수용량을 100으로 지정시켜서 16에서 증가시켜줌
		System.out.println("초기 buffer2의 수용량 : " + buffer2.capacity());
		System.out.println("buffer2에 들어있는 실제 값의 길이 : " + buffer2.length());
		
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc"); 
		System.out.println("초기 buffer3의 수용량 : " + buffer3.capacity()); // 기본 16문자 크기에서 문자 abc의 크기 3개가 더해져서 수용량이 19로 증가
		System.out.println("buffer3에 들어있는 실제 값의 길이 : " + buffer3.length()); // abc가 처음에 들어가 있기 때문에 길이가 3으로 출력됨
		
		System.out.println();
	
		// StringBuilder Test
		// StringBuffer과 StringBuilder는 똑같은데 쓰레드 safe기능을 제공하느냐 안하느냐의 차이
		
		StringBuilder builder = new StringBuilder("abc");
		System.out.println("초기 builder의 수용량 : " + builder.capacity()); 
		System.out.println("builder에 들어있는 실제 값의 길이 : " + builder.length()); 
		
		System.out.println();
		
//		builder.append("abc"); // StringBuilder가 반환 값 - append메소드에 마우스오버 하면 첫줄 처음에 나오는 것이 반환값
//		System.out.println("abc추가 후에 builder : " + builder); // abcabc 출력 => append는 추가하는
//		System.out.println("abc추가 후에 builder의 수용량 : " + builder.capacity()); 
//		System.out.println("abc추가 후에 builder의 길이 : " + builder.length()); 
//		
//		System.out.println();
//		
//		builder.append("def");
//		System.out.println("def추가 후에 builder : " + builder); // abcabcdef출력 
//		System.out.println("def추가 후에 builder의 수용량 : " + builder.capacity()); 
//		System.out.println("def추가 후에 builder의 길이 : " + builder.length());
		
		// 위의 주석된 내용을 한번에 줄일 수 있음
		builder.append("abc").append("def"); // 메소드 체이닝
		// builder.append("abc")의 반환값이 StringBuilder이고
		// 다시 StringBuilder.append("def")를 하는 것이기 때문에 위에 코드는 가능
		// 반환값이 기본형일 경우에는 그 안에 메소드가 없기 때문에 메소드 체이닝 불가 && void는 당연히 반환값이 없기 때문에 당연히 메소드 체이닝 불가 
		
		System.out.println("abc, def 추가 후의 builder : " + builder);
		System.out.println("abc, def 추가 후의 builder 수용량 : " + builder.capacity());
		System.out.println("abc, def 추가 후의 builder 길이 : " + builder.length());
		
		System.out.println();
		// append는 기존 문자열의 맨 뒤에만 붙일 수 있는데 그러고 싶지 않은 경우 - insert메소드 사용
		builder.insert(2, "zzz"); //두번째 인덱스후에 zzz를 넣음
		System.out.println("인덱스2에 zzz 추가 후의 builder : " + builder);
		
		System.out.println();
		builder.delete(2, 5); //start <= 인덱스 < end 보다 작은 정도의 내용 - 자바에서는 처음포함 끝 불포함으로 생각함 // DB에선 포함
		System.out.println("인덱스2부터 5까지 삭제 후의 builder : " + builder);
		
		System.out.println();
		
		builder.reverse();
		System.out.println("reverse 후의 builder : " + builder); // 문자열을 거꾸로 출력
		
		System.out.println();
		
		StringBuilder sb = new StringBuilder("abc");
		sb = sb.append("zzz").insert(2, "yy").reverse().delete(1, 3); // zcyyba 출력 예상
		System.out.println(sb); // 예상대로 zcyyba 출력
		
	}
	
	public void method3() { // String 안에 있는 method들
		
		String str = "Hello World";
		// 1. charAt(int index) : char
		//		String에 index번째 char 반환
		char ch = str.charAt(4);
		System.out.println(ch);
		
		// 2. concat(String str) : String
		//		매개변수로 들어온 값을 원래 String 끝에 이어붙인 값(String)을 반환
		
		String concat = str.concat("!!!");
		System.out.println(concat);
		
		str += "!!!";
		System.out.println(str);
		// concat과 같은 방법
		
		// 3. equals() : boolean
		System.out.println("concat.equals(str) : " + concat.equals(str));
		
		// 4. substring(int beginIndex) : String
		//	  substring(int beginIndex, int endIndex) : String
		//		String의 일부를 반환 - 매개변수가 하나면, 그 인덱스부터 끝까지 반환
		//						- 매개변수가 두개면, 시작 인덱스부터 끝 인덱스 전까지 반환
		System.out.println("str.substring(6) : " + str.substring(6)); // 인덱스 6번부터 끝까지 반환해라
		System.out.println("str.substring(0,5) : " + str.substring(0, 5)); // 인덱스 0번부터 5번 미만까지 반환해라
		
		// 5. replace(char oldChar, char newChar) : String
		//		지정 char를 새로운 char로 대체해서 반환
		System.out.println("str.replace('l','e') : " + str.replace('l', 'e'));
		
		// 6. toUpperCase()/ toLowerCase() : String
		//		모두 대문자로 반환 / 모두 소문자로 반환
		System.out.println("str.toUpperCase() : " + str.toUpperCase());
		System.out.println("str.toLowerCase() : " + str.toLowerCase());
		
		// 7. equalsIgnoreCase() : boolean
		//		대소문자 구분없이 그 비교하는 문자열의 스펠링만 비교해서 맞는지 틀린지 반환
		String str2 = "Wonderful";
		String str3 = "wonderful";
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		System.out.println("str2.equalsIgnoreCase(str3) : " + str2.equalsIgnoreCase(str3));
		
		// 8. trim() : String
		//		앞/뒤에 있는 공백(빈 공간)을 제거한 문자열의 내용만 반환 - 문자열 내용의 중간에 있는 공백은 제거하지 않음
		String str4 = "     Java";
		String str5 = "Java     ";
		String str6 = "    Ja  va    ";
		System.out.println(str4 + "| str4.trim() : " + str4.trim());
		System.out.println(str5 + "| str5.trim() : " + str5.trim());
		System.out.println(str6 + "| str6.trim() : " + str6.trim());
		
		// 9. split(String str) : String[]
		//		문자열을 분리하여 배열에 담아 반환
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framework";
		String[] splitArr = splitStr.split(", ");
		System.out.println("분리된 문자열 개수 (split) : " + splitArr.length);
		
		// 일반 for문
//		for(int i = 0; i < splitArr.length; i++) {
//			System.out.println(splitArr[i]);
//		} 

		// 향상된 for문(for-each문) 
		// ???????????????? => 우리가 돌릴 대상 splitArr(꼭 배열일 필요 없음 / 컬렉션도 가능)이 알아서 처음부터 끝까지 돌림
		// 그 돌려서 잠깐 s라는 곳에 담아 바로 println 해주겠다.(여기선 String 배열이고 그 안에 내용이 String이니까 String s로 지정)
		for(String s : splitArr) {
			System.out.println(s);
		}
	}
	
	public void method4() {
		// StringTokenizer = split과 같은 기능을 하는 클래스
		// 그럼 왜 할까?? -> 차이점에 나옴
		String str = "Java, Oracle, JDBC, Front, Server, Framework";
		StringTokenizer stObj = new StringTokenizer(str, ", ");
		System.out.println("분리된 문자열 개수 : " + stObj.countTokens());
		while(stObj.hasMoreTokens()) { // stObj에 더 토큰이 있는가? true면 안으로
			System.out.println(stObj.nextToken()); // 갖고 있다는 토큰을 빼서 출력
		}
		System.out.println("값을 꺼낸 후의 문자열 개수 : " + stObj.countTokens()); // 있는 것을 위에서 다 빼내었기 때문에 0개 남음
		
		System.out.println();
		
		String str2 = "Apple,Banana-Cream*Dessert#Egg Fruits";
		StringTokenizer stObj2 = new StringTokenizer(str2, ", -*#"); // 나누는 기준에 대한 순서는 상관 없음 
		System.out.println("분리된 문자열 개수 : " + stObj2.countTokens());
		while(stObj2.hasMoreTokens()) {
			System.out.println(stObj2.nextToken());
		}
		
		// split()과 StrinTokenizer의 차이점
		// 1. 분리한 문자열을 String[]로 처리하고 싶을 때 string()메소드
		//	   분리한 문자열을 객체로 처리하고 싶을 때 StringTokenizer클래스
		// 2. split()메소드의 구분자는 1개
		//	  StringTokenizer클래스의 구분자는 여러개 가능
	}
}
