package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a = new Account();
		
		// 현재 잔액조회
		a.displayBalance();
		
		// 100만원 입금
		a.deposit(1000000);
		a.displayBalance();
		
		// 150만원 추가입급
		a.deposit(1500000);
		a.displayBalance();
		
		// 50만원 출금
		a.withdraw(500000);
		a.displayBalance();
		
		// 누군가의 접근
//		a.balance -= 2000000; 
		// 임의의 사용자가 변수자체로의 접근(함수로의 접근 아님) - private의 문제점
		// The field Account.balance is not visible - private을 설정했을때 이렇게 하면 뜨는 오류
		// private은 나 자신(Account)에서만 볼 수 있게끔 제한해주기 때문에
		// 외부 클래스인 Run에서는 볼 수 없음

		a.withdraw(500000);  
		a.displayBalance();
		
	}
}
