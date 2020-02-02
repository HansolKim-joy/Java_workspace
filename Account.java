package com.kh.example.chap01_encapsulation;

public class Account {
	// class 영역에 있는 변수 : 멤버 변수 = 필드 = 멤버 필드 = 전역변수
	// 무조건 멤버 변수에서는 private을 붙여야 한다.
	
	private String name = "박신우";
	private String phone = "010-9468-8140";
	private String pwd = "1q2w3e4r";
	private int bankCode = 3030;
	private int balance = 0; // 잔액
	
	// 입금 메소드
	public void deposit(int money) { // 메소드 영역
		// method 영역에 있는 변수 : 지역변수
		if(money > 0) {
			balance += money;
			System.out.println(name + " 님의 계좌에 " + money + "원이 입금되었습니다.");
		}else {
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}
	
	// 출금 메소드
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name + " 님의 계좌에 " + money + "원이 출금되었습니다.");
		}else {
			System.out.println("잔액이 부족합니다. 잔액을 확인하세요.");
		}
	}
	
	// 잔액 조회 메소드
	public void displayBalance() {
		System.out.println(name + " 님의 계좌에 잔액은 " + balance + "원입니다.");
	}
}
