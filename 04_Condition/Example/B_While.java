package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 	while(���ǽ�){
	 		����� ����;
	 		[������ or �б⹮]; // []�� ������ �� �ִٴ� ǥ��
	 	}
	 	���ǽ� Ȯ�� -> (���ǽ� true�� ��) ���� ���� ���� -> ���ǽ� Ȯ�� -> (�ݺ�)
	 	���ǽ� ����� false�� �� ������ �ݺ� 
	 */
	public void method1() {
		// 1���� 5���� ���
		int i = 1;
		
		while(i <= 5) {
			System.out.println(i + "��° �ݺ��� ����");
			i++;
		}
	}
	
	public void method1_1() {
		//�ڱ�Ұ� 5�� �ϱ�
		int i = 1;
		
		while(i <= 5) {
			System.out.println("�� �̸��� ���Ѽ��̾�.");
			i++;
		}
	}
	
	public void method2() {
		// 5���� 1���� �ݺ�
		int i = 5;
		
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void method3() {
		// 1���� 10������ Ȧ���� ���
		int i = 1;
		
		while(i <= 10) {
			System.out.println(i + " ");
			i += 2;
		}
	}
	
	public void method4() {
		// ���� �� ���� �Է� �޾� �� ���� ���� ���
		// ���� �� ���� �Է��ϼ���.
		// ��, ù ��° ���ڰ� �ι�° ���ں��� �۰� �Է����ּ���.
		// ù ��° ���� : 
		// �� ��° ���� :
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� ���� �Է��ϼ���.\n"
				+ "��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.");
		System.out.print("ù ��° ���� : ");
		int first = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int second = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if(first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}
		
		while(min <= max) {
			System.out.print(min + " ");
			min++;
		}
	}
	
	public void method4_1() {
		// ������ �ϳ� �Է� �޾� �� ���� 1~9 ������ �� �϶��� �� ���� ������ ���
		// ������ �±� ������ 1~9 ������ ����� �Է��Ͽ��� �մϴ�. ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		int su = 1;
		if(dan >=1 && dan <= 9) {
			while(su <= 9) {
				System.out.println(dan + " * " + su + " = " + dan * su);
				su++;
			}
		} else {
			System.out.println("1~9 ������ ����� �Է��Ͽ��� �մϴ�.");
		}
	}
	
	public void method5() {
		// 1���� 10 ������ ������ ������ ���� 1���� ���������� ���� �հ� ���
		
		
		int random = (int)(Math.random() * 10 + 1);
		
		int sum = 0;
		
		int i = 1;
		
		while(i <= random) {
			sum += i;
			i++;
		}
		System.out.printf("1���� %d������ ���� �հ� : %d", random,sum);
	}
	
	public void method6() {
		// ����ڿ��� ���ڿ��� �Է� �޾� �ε��� ���� ���� ���
		// ���ڿ� �Է� : apple
		// 0 : a
		// 1 : p
		// 2 : p
		// 3 : l
		// 4 : e
		
		// ���ڿ��� 5�� �̸� index�� 5�� ���;� �ϰ� 
		// ���ڿ��� 4�� �̸� index�� 4�� ���;� �Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : "); // apple �Է½�
		String str = sc.nextLine(); // str�� apple�� �� �ִ� ��Ȳ
		
		// ��� 1. for�� ���
		
//		for(int i = 0; i < 5; i++) {
//			char ch = str.charAt(i);
//			System.out.println(i + " : " + ch);
//		}
//		
		
//		// ** ���ڿ��� ���̸� ��ȯ�ϴ� �޼ҵ尡 ���� : length()
//		int length = str.length();
//		System.out.println(str + "�� ���� : " + length);
//		
//		// ��õ�
//		for(int i = 0; i < length; i++) {
//			char ch = str.charAt(i);
//			System.out.println(i + " : " + ch);
//		}
		
		
		// ��� 2. while�� ���
		int i = 0;
		
		while(i < str.length()) {
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
			i++;
		}	
	}
	
	public void method7() {
		// 2�ܺ��� 9�ܱ��� ���
		
		int dan = 2;
		
		while(dan <= 9) {
			int su = 1;
			while(su <= 9) {
				System.out.printf("%d * %d = %d",dan,su,dan*su);
				System.out.println();
				su++;
			}
			dan++;
			System.out.println();
		}
	}
	
	public void method8() {
		// �Ƴ��α� �ð�
		
		int hour = 0;
		
		while(hour < 24) {
			int min = 0;
			while(min < 60) {
				System.out.printf("%2d�� %2d��%n", hour, min);
				min++;
			}
			hour++;
			System.out.println();
		}
		// %d : ������ �ڸ��� Ȯ���ϰڴ�.
		// %2d : 2�ڸ� ������ �ڸ��� Ȯ���ϰڴ�.
		// �̴� ��ĭ�� ���ؼ� ������ ���ĵ� ������ �������� %-2d�� ���� ���ĵ� ������ ��������. 
	}
	
	public void method9() {
		// �޴� �ݺ������� for������ while���� ���� ����
		
		int menuNum = 0; 
		//While�ȿ� menuNum�� �־��ٸ� while ���ǹ��� ������ �� menuNum�� �����Ƿ�
		//������ �߻��ϱ� ������ �� ���� menuNum ������ while���� ���� ��������� �Ѵ�.
		
		while(menuNum != 9){
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 1~5��ġ ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. 1~10���� Ȧ�� ���");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			menuNum = sc.nextInt();
			// ���� int menuNum���� ��� ������
			// while�� �ۿ� menuNum�� ���� ������ ���� �Ͽ����Ƿ�
			// �� menuNum�̶�� ������ ������ �ʿ䰡 �����Ƿ� int��� �������� �־��� �ʿ䰡 ����.
			
			// ģ���ϰ� �ȳ����� ��� �ݺ��Ǵ� ���� ���Ƽ� ��� ���� �ȳ����� ���� ��±��� �ݺ��Ǹ� ����.
			//���� while�� �ȿ� �� 211 ~ ���� �� �ݺ����� �ִ� ���� ����
			
			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 9: System.out.println("�����մϴ�."); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");	
			}
		}
	}
}
