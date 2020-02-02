package com.kh.example.chop05_construnctor.model.vo;

import java.util.Date;

public class User {
	// - userId : String
	// - userPwd : String
	// - userName : String
	// - enrollDate : Date(java.util)
	
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	// import 되는 것 중에 java.util을 해라
	
	// 생성자 사용 목적(객체가 하는 일)
	//	1. 객체를 생성해주기 위한 목적
	//	2. 매개변수로 전달받은 값으로 필드 초기화
	
	
	// 생성자 사용 규칙
	//	1. 생성자명은 클래스명과 동일해야 한다.
	//	2. 반환형(리턴형)이 없다.
	
	//필드밑에 생성자를 주로 넣음
	
	public User() {} // 기본생성자 : 매가변수가 없는 생성자
	// JVM이 기본적으로 생성해줌 
	// 매개변수 있는 생성자를 만들면 JVM이 자동으로 생성이 되지 않기 때문에 반드시 명시해야 함
	
	// 밖에서 객체를 생성할 수 있게 할때는 public / 아닐떄는 private
	// + 클래스명 + () + {}
	// 메소드와 차이점 : 반환자가 없음
	
//	public User() {}
	// Duplicate method User() in type User
	// 같은 이름의 생성자(메소드도 마찬가지)가 있을 때 오버로딩이 적용되지 않으면 에러발생 
	
	
	public User(String userId, String userPwd) {
//		System.out.println(id);
//		System.out.println(pwd);
		this.userId = userId;
		// userId가 매개변수와 전역변수로 모두 이름이 같은게 사용되면
		// 이 안에서 사용되고 있기때문에 먼저 매개변수를 인지한다.
		// 이 문제를 해결하기 위해 this 사용 - 나 자신에 있는 userId를 찾으면 전역변수니까 앞의 공간을 나타내는 곳에 this 추가
		this.userPwd = userPwd;
	}
	
	
	public User(String userId, String userPwd, String userName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId,userPwd);
		// 이렇게 하면 44, 48번째 줄의 this가 호출되는 것;;
		this.userName = userName;
	}
	
//	public User(String id, String name) {
//		// Duplicate method User(String, String) in type User
//		// 오버로딩 불가 : 매개변수 개수, 타입, 순서가 같기 때문에 - 변수명은 달라도 상관 없이 적용되지 않음
//		userId = id;
//		userName = name;
//	}
	
	public User(String userId, String userPwd, String userName,Date enrollDate) {
	this(userId, userPwd, userName);
	this.enrollDate = enrollDate;
	
	}
	
	public void inform() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
	}
}
