package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
		//Person객체가 들어갈 수 있는 5개의 공간 생성 : pArr
		Person[] pArr = new Person[5];
		
		System.out.println("pArr : " + pArr);
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
		}
		
		// 각 인덱스 별로 객체를 생성하여 대입하기
		pArr[0] = new Person("강건강", 20, '남', 175.8, 66.9);
		pArr[1] = new Person("남나눔", 34, '남', 179.5, 96.1);
		pArr[2] = new Person("도대담", 14, '남', 190.0, 77.3);
		pArr[3] = new Person("류라라", 27, '여', 161.4, 56.8);
		pArr[4] = new Person("문미미", 53, '여', 157.9, 58.3);
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
		}
		// 이건 각 공간에 생성된 배열의 주소값이 나오는 것이고
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i].personInfo());
		}
		// 이건 각 배열에 있는 Person객체 안에 들어가서 personInfo라는 메소드를 갖고 오겠다는 내용
	}
	
	public void method2() {
		Person[] pArr = {new Person("강건강", 20, '남', 175.8, 66.9),
						new Person("남나눔", 34, '남', 179.5, 96.1),
						new Person("도대담", 14, '남', 190.0, 77.3),
						new Person("류라라", 27, '여', 161.4, 56.8),
						new Person("문미미", 53, '여', 157.9, 58.3)};
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getName() + "님의 정보 : " + pArr[i].personInfo());
		}
	}
}