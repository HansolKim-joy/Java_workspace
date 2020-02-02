package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		Set<Dog> set = new HashSet<Dog>();
		
		set.add(new Dog("샤샤", 4.0));
		set.add(new Dog("호두", 4.5));
		set.add(new Dog("우유", 8.1));
		System.out.println(set);
		
		set.add(new Dog("샤샤", 4.0)); 
		System.out.println(set); // 주소값으로만 비교하고 있기 때문에 내용으로 비교하고 싶으면 Dog에서 equals와 hashCode 오버라이딩 해야함
		
		// String클래스에는 이미 equals와 hashCode가 오버라이딩 되어있어서 내가 따로 오버라이딩 해주지 않아도 중복제거 됨  => 예시
//		Set<String> test = new HashSet<String>();
//		test.add("예시 1");
//		test.add("예시 2");
//		test.add("예시 3");
//		System.out.println(test);
//		test.add("예시 2");
//		System.out.println(test);
		
		Set<Dog> set2 = new LinkedHashSet<Dog>(); // LinkedHashSet : 중복이 제거되면서 순서가 유지되는 특징
		set2.add(new Dog("초코", 2.1));
		set2.add(new Dog("콩이", 8.3));
		set2.add(new Dog("두부", 5.1));
		set2.add(new Dog("초코", 2.1)); // 중복제거됨
		System.out.println(set2);

		set2.add(new Dog("로이", 6.1));
		set2.add(new Dog("공주", 5.2));
		set2.add(new Dog("왕자", 9.5));
		set2.add(new Dog("조이", 12.5));
		System.out.println(set2);
		
		Set<Dog> set3 = new TreeSet<Dog>(set2); // set2에 있는 elements들을 사용하는 set3를 만든 것
		System.out.println(set3);
		// java.lang.ClassCastException: com.kh.example.set.model.vo.Dog cannot be cast to java.lang.Comparable
		// "TreeSet의 특징 : 정렬"인데 Dog를 정렬할 기준이 없기 때문에 정렬할 수 없다고 하는 에러 
		
		Set<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.add(new Dog("초코", 6.1));
		set4.add(new Dog("콩이", 8.3));
		set4.add(new Dog("두부", 5.1));
		set4.add(new Dog("초코", 2.1));
		set4.add(new Dog("로이", 6.1));
		set4.add(new Dog("공주", 5.2));
		set4.add(new Dog("왕자", 9.5));
		set4.add(new Dog("조이", 12.5));
		System.out.println(set4);
		//[초코(2.1kg), 두부(5.1kg), 공주(5.2kg), 초코(6.1kg), 콩이(8.3kg), 왕자(9.5kg), 조이(12.5kg)]
		// 6.1kg의 초코가 먼저 들어가있어서 로이가 나오지 않음
		
		//////////////////////////////////////////////////////////////////////////////////////////
		
		// 요소 뽑아내기 
		// 방법 1. Set을 List화 시키기 : addAll()
		List<Dog> list = new ArrayList<Dog>();
		list.addAll(set4); // List화 시키기
		System.out.println(list);
		System.out.println(list.get(3));
		
		// 방법 2. Iterator 활용하기 : iterator()
		Iterator<Dog> it = set4.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasNext()) { // 이미 위에서 한번 했기 때문에 단방향 특징에 의해 다시 앞으로 가서 찍을 수 없음
			System.out.println("re : " + it.next());
		}
	}
}
