package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a = new Account();
		
		// ���� �ܾ���ȸ
		a.displayBalance();
		
		// 100���� �Ա�
		a.deposit(1000000);
		a.displayBalance();
		
		// 150���� �߰��Ա�
		a.deposit(1500000);
		a.displayBalance();
		
		// 50���� ���
		a.withdraw(500000);
		a.displayBalance();
		
		// �������� ����
//		a.balance -= 2000000; 
		// ������ ����ڰ� ������ü���� ����(�Լ����� ���� �ƴ�) - private�� ������
		// The field Account.balance is not visible - private�� ���������� �̷��� �ϸ� �ߴ� ����
		// private�� �� �ڽ�(Account)������ �� �� �ְԲ� �������ֱ� ������
		// �ܺ� Ŭ������ Run������ �� �� ����

		a.withdraw(500000);  
		a.displayBalance();
		
	}
}
