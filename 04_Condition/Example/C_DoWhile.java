package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile { 
	public void method1() {
		// Ű����� ���ڿ� ���� �Է� �޾� ��� �ݺ� ����
		// ��, exit�� ������ �ݺ� ����
		/*
		 	���ڿ� �Է� : �ȳ��ϼ���
		 	str : �ȳ��ϼ���
		 	���ڿ� �Է� : apple
		 	str : apple
		 	���ڿ� �Է� : exit
		 	str : exit
		 */
		Scanner sc = new Scanner(System.in);
		
		//1. while��
		
//		String str = null; 
//		// �������� int i = 0; �ϴ� �Ͱ� ����
//		//java.lang.NullPointerException
//		//null�̶�� �ϸ� ������ �� ���� �ǵ� exit�� ���϶�� �ϴϱ� �� �� ���ٰ� �ϴ� ����
//		
//		String str = "";
//		//null�� �������¿� �����ϰ� �ƹ��͵� ���� �Ϳ� ���� "" �̷��� �Է��ϴ� ���� �ƹ��͵� �� �ִ´ٴ� ���� �����ִ� ���̹Ƿ� ������ �߻����� �ʴ´�
//		
//		while(!str.equals("exit")) {
//			System.out.print("���ڿ� �Է� : ");
//			str = sc.nextLine();
//			System.out.println("str : " + str);
//		}
		
		//2. do ~ while��
		String str = null;
		// �� ��쿡�� do ���� ������ ������ ����ǰ� ���� while�� ���ǹ��� Ȯ���ϴϱ� null;�� �����ص� ������ ������ �ʴ´�.
		
		do {
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		} while (!str.equals("exit"));
		}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		int menuNum = 0;
		do {
			System.out.println("1. �׽�Ʈ1");
			System.out.println("2. �׽�Ʈ2");
			System.out.println("3. �׽�Ʈ3");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: System.out.println(1); break;
			case 2: System.out.println(2); break;
			case 3: System.out.println(3); break;
			case 9: System.out.println("�����մϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			
			}
		} while(menuNum != 9);
	}
}
		