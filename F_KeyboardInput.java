package com.kh.variable;

import java.util.Scanner;

public class F_KeyboardInput {
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : "); 
		// �ȳ����� ���� - ������ ������ �϶�� �� �𸣱� ������ ����ڿ��� ��ģ������ / ����� ���忡�� �����ؼ� �����
		String name = sc.nextLine(); 
		// �� �ڵ带 ����ϸ� ���� ������ ����� ����ڰ� �Է��� ������ ��ٸ� 
		// �׸��� �� ��� ���� name�̶�� ���ڿ��� �Է���
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		// ������ �ƴ� ���� �ԷµǸ� ������ ������ ǥ�õ�
		
		System.out.print("Ű(�Ҽ��� ù° �ڸ����� �Է�) : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "���� " + age + "���̸�, Ű�� " + height + "cm �Դϴ�.");
		
	}
	public void inputScanner2() {
		// Scanner�� ����� �� ������ ���� ���� ���� �޼ҵ�
		// ����ڿ��� �̸��� ���̸� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �߷��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ��� : ");
//		int age = sc.nextInt();
//		
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.nextLine();
		
		// �ذ��ϴ� ��� 
		// ���1. �ٹٲ��� ������ �� �ִ� nextLine() �߰�
		int age = sc.nextInt();
		sc.nextLine(); // ���� ���� ���� �뵵�� �ƴ� ���ۿ� �����ִ� �ٹٲ޸� ���ִ� ������ �ϴ� �ڵ�
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String address = sc.nextLine();
		
		// ���2. age�� ���� ���� nextLine()�� ���� int�� �Ľ��ϱ�?
		// �Ľ� : ���ڿ��� �⺻ �ڷ������� �ٲ��ִ� ��
		// "1"�� ���ڷ� �ٲٴ� �� ����������, "�ڽſ�"�� ���ڷ� �ٲٴ� ���� �Ұ�����
		// "true"�� boolean���� �ؼ� �ٲٴ� �� ����������, "�ڽſ�"�� boolean���� �ؼ� T/F�� �ٲٴ� ���� �Ұ�����
//		String userAge = sc.nextLine();
//		int age = Integer.parseInt(userAge); // �Ľ��ϴ� ��� - Integer.parseInt(xx); �ϱ� => ���� ���
//		// 52,53��°�� ������ �ϳ��� ��ģ ����
//		// => int age = Integer.parseInt(sc.nextLine());
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.nextLine();
		
		// ���3. next()�� �ּҸ� �ޱ� - but �Ѱ谡 ����
		// �Ѱ� : "63��° ��"�� ��Ÿ�� => �ذ���� "�迭"�ε� ���� ����� �ʾ���
//		int age = sc.nextInt(); // ���ۿ� �ٹٲ��� ������ �ִ� ����
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.next(); 
		// �ּҸ� ����� ���򱸷� �Է��ϸ� - ����ø� ����
		// next();�� ���⸦ �����ڷ� �ν����� �ʱ� ������ ���� ���� ��µȴ� ------ �̰��� �ٷ� �Ѱ�!
		
		//boolean�� �Ľ��ϴ� ���� ������ ���
		
		// + �߰� : char���� �ް� ���� ����?
		System.out.print("������ �Է��ϼ��� : "); // F or M ���� �޴´ٰ� ����
	
//		String userGender = sc.nextLine();
//		char gender = userGender.charAt(0); 
		//70, 71��° ���� �� �ٷ� ���� ���� 73��° ��
		char gender = sc.nextLine().charAt(0);
		// charAt(int index) : ���ڿ��� index��°�� ���ڸ� �������ִ� �޼ҵ�
		// ���ڿ��� ������ 0��°�� ������
		// => charAt(0) = String���� 0��° index�� char�� ���� ����� �ǹ�
		
		System.out.println(name + "���� " + age + "���̸�, ����� " + address + "�� ��� �ֽ��ϴ�.");
		System.out.println("gender : " + gender);
		
		// ���� �� �����ߴµ� �տ� ���� ������ inputScanner2�� ������ ��Ÿ���� ����??
		// => fk.inputScanner2�� �� �ٲ��� - ���α׷� ���� �ƴϰ� �� ����! �� Ȯ���ϱ�
		

		
		
	}
	
}
