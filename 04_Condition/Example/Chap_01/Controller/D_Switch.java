package com.kh.example.chap01.condition;

import java.util.Scanner;

public class D_Switch {
	// ���ǽ��� ��� ���� case���� ã�� ����� �����ϴ� ���ǹ�
	// �ش��ϴ� ���� case�� ���� ��쿡�� default�� ��ɹ� ����
	
	//case�� ���๮ ���̿��� �ݷ�(:)�� ��� �ϸ� 
	//break�� ������ ������ �ʰ� ��� ������
	
	public void method1() {
		// ���� �� ���� ���� ��ȣ ���� 1���� �Է� �޾Ƽ�
		// ���� ��ȣ ���ڿ� �ش��ϴ� ����� �����ϰ� ����ϼ���
		/*
		 	ù ��° �� : 
		 	�� ��° �� : 
		 	������(+,-,*,/) : 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° �� : ");
		int first = sc.nextInt();
		
		System.out.print("�� ��° �� : ");
		int second = sc.nextInt();
		sc.nextLine();
		
		System.out.print("������(+ , - , * ,/) : ");
		char op = sc.nextLine().charAt(0);
		//java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//���� nextInt ���� nextLine �� �ٹٲ��� ���� ���� �ǵ� �� �ٹٲ޸� ���� ���¿��� charAt(0)�� �ϴϱ� ������ �߻��ߴٴ� ����
		//** nextInt�� ���� 100�� �ִٰ� ���ۿ� �ٹٲ��� 100�� �ִ� ���� �ƴ� - ������ nextInt���� ���� �ٹٲ� �ϳ��� ��������
		//���� �ذ� : ���� sc.nextLine() �ؼ� �ٹٲ� ���� ����! 
		//�迭������ ���� ������ �������� ���ø����̼�(?)���鶧�� ���� ���� �� ����
		
		int result = 0; // ���� ��� �����س��� ����
		
		switch(op) {
		case '+' :
			result = first + second;
			break;
		case '-' :
			result = first - second;
			break;
		case '*' :
			result = first * second;
			break;
		case '/' : 
			result = first / second;	
		}
		
		System.out.println(first + " " + op + " " + second + " = " + result);
	}
	
	public void method2() {
		// ������ �Է��Ͽ� ����� 1000, �ٳ����� 3000, �����ƴ� 2000, Ű���� 5000,
		// ���ϰ��Կ� ���� ������ �Է��������� "�߸��Է��Ͽ����ϴ�." ����ϰ� �Ͽ���
		// ���� �̸��� �Է��ϼ��� : 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �̸��� �Է��ϼ��� : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit){
		case "���" :
			price = 1000;
			break;
		case "�ٳ���" :
			price = 3000;
			break;
		case "������" :
			price = 2000;
			break;
		case "Ű��" :
			price = 5000;
			break;
		default :
			System.out.println("�߸��Է��Ͽ����ϴ�.");
			return;
			// break�� ������ case���� ���������� �ϴ� �����ε�
			// return�� ���� ȣ���� �޼ҵ忡�� ���ư��� ���. 
			// �� ��, ���� ������ ���ư� ���� �ְ� �ƹ��͵� ���� ���ư� ���� ����
			// ȣ���Ѵٴ� ���� run Ŭ�������� main �޼ҵ尡 ȣ���ϰ� �ִ� ���� �ǹ��ϰ�
			// ds.method2(); �� ȣ�� �� �ٸ� ���� ���� ������ �׳� ����ȴ�?
			
			//return �ؿ� �ǹ� ���� �ڵ�� ������� �ʱ� ������ ������ �߻��ϴµ�
			//�� ��쿡�� return�� ���ԵǴ� default�� �ƴ� �ٸ� case������ �� �Ʒ����� system.out.println(~~)�� �ǹ� �ִ� �ڵ��̱� ������ ������ ������ �߻����� ����
		}
		
		System.out.println(fruit + "�� ������ " + price + "�� �Դϴ�.");
		// �ٸ� ������ �Է��ϸ� price�� �ʱ�ȭ ���� 0�̹Ƿ� �׳� 0���� ��µ�
	}
	
	public void method3() {
		//����ڰ� �Է��� �޴� ��ȣ�� ���� �޴��� ��µǰ� �Ͻÿ�
		/*
		 	1. ȸ�� ���
		 	2. ȸ�� ����
		 	3. ȸ�� ����
		 	�޴� ��ȣ�� �Է��ϼ��� : 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ȸ�� ���");
		System.out.println("2. ȸ�� ����");
		System.out.println("3. ȸ�� ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("ȸ�� ��� �޴��Դϴ�.");
			break;
		case 2:
			System.out.println("ȸ�� ���� �޴��Դϴ�.");
			break;
		case 3:
			System.out.println("ȸ�� ���� �޴��Դϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	public void method4() {
		//1������ 12������ �Է� �޾� �ش��ϴ� ���� ������ ��¥�� ����ϼ���
		// �Է��Ͻ� ���� 00�ϱ��� �Դϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("1��~12������ �� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		
		switch(num) {
		case 1 :
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
			break;
		case 2:
			System.out.println("�Է��Ͻ� ���� 28�� Ȥ�� 29�ϱ��� �Դϴ�.");
			break;
		case 3:
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
		case 4:
			System.out.println("�Է��Ͻ� ���� 30�ϱ��� �Դϴ�.");
			break;
		case 5:
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
			break;
		case 6:
			System.out.println("�Է��Ͻ� ���� 30�ϱ��� �Դϴ�.");
			break;
		case 7:
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
			break;
		case 8:
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
			break;
		case 9:
			System.out.println("�Է��Ͻ� ���� 30�ϱ��� �Դϴ�.");
			break;
		case 10:
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
			break;
		case 11:
			System.out.println("�Է��Ͻ� ���� 30�ϱ��� �Դϴ�.");
			break;
		case 12:
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
			break;
		default:
			System.out.println("�ݵ�� 1~12 ������ ���ڸ� �Է����ּ���.");
			
		/* 1,3,5,7,8,10,12�� ��� 31�ϱ��� ���������� (��, ���� �͵��� �ݺ��Ǵ� ��쿡��)
		 * case 1:
		 * case 3:
		 * ........
		 * case 12:
		 * System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
		 * break;
		 * case 2:
		 * System.out.pritnln("�Է��Ͻ� ���� 28�� Ȥ�� 29�ϱ��� �Դϴ�.");
		 * break;
		 * case 4: case 6 :case 9: case 11: (���� 1,3 ��� ó�� ���η� ������ ���� ������ ���η� �����ص� �������)
		 * System.out.println("�Է��Ͻ� ���� 30�ϱ��� �Դϴ�.");
		 * break;
		 * default:
		 * System.out.println("�ݵ�� 1~12 ������ ���ڸ� �Է����ּ���.");
		 */
		}
		
	}
}
