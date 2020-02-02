package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
//		List list1 = new ArrayList(); // 제네릭 타입을 지정해 주지 않아서 Object형으로 나옴
//		list1.
		
		List<Student> list = new ArrayList<Student>(/*3*/); // 이면 3개짜리가 생성(없으면 기본 10개짜리)  
		// 앞에 있는 제네릭 타입을 보고 추정해줄 수 있기 때문에 ArrayList뒤에는 <> 안은 생략은 가능(자바 버전에 따라 다름)
		
		// add(E e) : 리스트 끝에 데이터 e를 추가
		list.add(new Student("테스트", 0));
		list.add(new Student("도대담", 60));
		
		System.out.println("list : " + list);
		
		list.add(new Student("남나눔", 90));
		list.add(new Student("하현호", 85)); // 원래 3개짜리로 지정했는데 자동으로 늘어나서 들어감 ( 장점 1: 크기에 제약이 없다)
		
		System.out.println("현재 list에 담긴 element 개수 : " + list.size()); 
		System.out.println("list : " + list);
		
		list.add(new Student("문미미", 66));
		System.out.println("현재 list에 담긴 element 개수 : " + list.size()); 
		System.out.println("list : " + list);
		
		// 컬렉션 장점 2 : 추가/삭제/정렬 등의 기능처리가 간단
		// add(int index, E e) : index번째 인덱스에 e 추가
		list.add(0, new Student("류라라", 100));
		System.out.println("list : " + list);
		
		list.add(3, new Student("강건강", 40));
		System.out.println("list : " + list);
		
		// remove(int index) : 해당 index번 객체 삭제
		list.remove(1);
		System.out.println("list : " + list);
		
		// remove(Object o) : 해당 Object 객체 삭제
		list.remove(new Student("강건강", 40)); 
		System.out.println("list : " + list); // 왜 안지워지지? => 새로운 객체를 생성하고 다른 주소값을 보고 있기 때문에
		// Object클래스 안에 있는 equals / hashCode 메소드를 오버라이딩(재정의)해서 주소값을 비교하는 게 아니라 안의 필드값을 비교하도록 해야함
		// 이렇게 하기 위해 필드를 저장한 클래스에 가서 equals / hashCode 메소드를 오버라이딩함
		
		// 정렬 방법 1. Collections 클래스 이용 - Collection에 사용하기 유용한 것들을 모아놓은 클래스
		Collections.sort(list); 
		// 정렬기준이 없기 때문에 sort에 빨간줄 에러 발생 => 정렬 기중르 세워줘야 함 by Comparable, Comparator 인터페이스
		// Student클래스에서 Comparable 인터페이스를 받고 compareTo 메소드를 이용해 기준을 만들어 주니까 사용가능 해짐 => 이름 오름차순으로 정렬해주어서 그렇게 출력됨
		System.out.println("이름 오름차순 : " + list); 
		
//		ArrayList<String> strList = new ArrayList<String>(); // 제네릭이 String이고 그 정렬기준이 이미 있어서 한번 해본것
//		strList.add("저녁시간");
//		strList.add("점심시간");
//		strList.add("퇴근시간");
//		strList.add("기상시간");
//		strList.add("출근시간");
//		strList.add("취침시간");
//		
//		System.out.println(strList);
//		Collections.sort(strList); // String은 이미 정렬기준이 존재하고 있기 때문에 에러없이 정렬기준으로 출력됨
//		System.out.println(strList);
		
		// 정렬 방법 2. List.sort()메소드 이용
		list.add(new Student("박보배", 85));
		list.sort(new StudentComparator());
		System.out.println("점수 오름 차순 : " + list);
		
		// set(int index, E e) : index번째 인덱스에 있는 요소를 e로 수정
		list.set(2, new Student("도대담", 31));
		System.out.println("list : " + list);
		
		// get(int index) : index번 인덱스에 있는 요소를 가지고 옴
		Student s = list.get(2);
		System.out.println(s);
		System.out.println("list : " + list); // 원래의 리스트에서 빠지는 것이 아니고 그냥 갖고 오는 것일 뿐
		
		// subList(int index1, int index2) : index1번째 인덱스부터 index2번 인덱스까지 리스트 반환
		System.out.println("list 추출 : " + list.subList(2, 5)); // index2번째 인덱스는 포함하지 않고 출력됨
		
		// contains(Object o) : o가 리스트에 존재한다면 true반환 
		// indexOf(Object o) : o가 리스트에 위치하는 인덱스 번호 반환, 없다면 -1 반환
		System.out.println("남나눔, 90이 있는가? : " + list.contains(new Student("남나눔", 90)));
		System.out.println("남나눔, 90의 인덱스 위치는? : " + list.indexOf(new Student("남나눔", 90)));
		System.out.println("테스트, 0의 인덱스 위치는? : " + list.indexOf(new Student("테스트", 0))); // 리스트에 없기 때문에 -1 반환하는 예시
		
		// clear() : 저장된 모든 객체를 삭제
		// isEmpty() : 리스트가 비었을 때 true 반환
		list.clear();
		System.out.println("list : " + list);
		System.out.println("list가 비었나요? : " + list.isEmpty());
		
	}
}
