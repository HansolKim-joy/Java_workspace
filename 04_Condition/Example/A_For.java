package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 	for(�ʱ�� ; ���ǽ�; ������){
	 		����� ����;
	 	}
	 	�ʱ�� -> ���ǽ� -> (���ǽ��� true�� ��)���� ���� -> ������ -> ���ǽ� -> (�ݺ�)
	 	���ǽ� ����� false�� �ɶ����� �ݺ�
	 	
	 	for�� �ȿ� �ִ� �ʱ��, ���ǽ�, ������ ��� ���� ����
	 	������, ��� �������� �� �ݺ����� �������� ���� ������
	 	for�� ���̳� �ۿ��ٰ� �ʱ���� �������� ������ �������� ������ �󸶳� �ɰ����� ��� ǥ�� �ؾ���
	 	��, for() �ȿ����� ������ �� ��� �ʿ��� �����
	 	*/
	public void method1() {
		// 1���� 5���� ���
		for(int i =1 ; i <= 5; i++) {
			System.out.println(i + "��° �ݺ��� ����" );
		}
	}
	public void method1_1() {
		for(int i=1; i<=5; i++) {
			System.out.println("�� �̸��� ���Ѽ��Դϴ�.");
		}
	}
	
	public void method2() {
		//5���� 1���� ����ϱ�
		for(int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
	}
	public void method2_1() {
		//8���� 3���� ���
		for(int i = 8; i >= 3; i--) {
			System.out.println(i);
		}
	}
	public void method3() {
		//1���� 10������ Ȧ���� ��� : 1,3,5,7,9
//		for(int i = 1; i<=10; i+=2 ) {
//			System.out.print(i+ " ");
		
		for(int i = 1; i<=10 ; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		// for���� if���� ��ø���� ǥ���� ���
	}
	public void method4() {
		// ���� �ΰ��� �Է� �޾� �� ���� ���� ���
		/*
		 	���� �ΰ��� �Է��ϼ���.
		 	��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.
		 	ù ���� ���� : 
		 	�� ��° ���� : 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ΰ��� �Է��ϼ���.");
		System.out.println("��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.");
		
		//System.out.prinln("���� �ΰ��� �Է��ϼ���."\n + "��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.");
		System.out.print("ù ��° ���� : ");
		int start = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int end = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if(start > end) {
			max = start;
			min = end;
		} else {
			max = end;
			min = start;
		}
		
		for(int i = min; i<= max; i++ ) {
			System.out.println(i);
			
		// for(; i <= min; min++){
		//		System.out.println(min);
		// ������ if������ min�� �����صױ� ������ �ʱ���� �Է����� �ʾƵ� �����ϰ�
		// �̷��� �Ǹ� �ȿ� �ԷµǴ� ���ǹ��� �����Ŀ��� �ϴ� �������� �� �Է��ؾ� �Ѵ�.
		}
	}
	public void method4_1() {
		// ���� �ϳ��� �Է� �޾� �� ���� 1~9������ ���϶��� �� ���� ������ ���
		// ������ ���� ������ "1~9 ������ ����� �Է��Ͽ��� �մϴ�." ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num >=1 && num <=9) {
			for(int i = num; i <= num; i++) {
				for(int j = 1; j <= 9; j++) {
					System.out.println(i + "*" + j + " = " + (i * j));
					
//			for(int i =1; i <= 9; i++){
//				System.out.println(num + "*" + i + " = " + (num * i));
				
				}
			}
		} else {
			System.out.println("1~9 ������ ����� �Է��Ͽ��� �մϴ�.");
		}	
	}
	public void method5() {
		//1���� 10������ ������ ������ ���� 1���� ���������� ���� �հ�
//		Math.random(); //������ ����(�Ǽ�)�� ��ȯ�ϴ� �޼ҵ�
		// ���� Math.random()�� ���� : 0 <= Math.random() < 1 
		// 10���� ����� ���� 10 ���ϱ� : 0 <= Math.random() * 10 < 10
		// 10�� �����ϱ� ���� 1 ���ϱ� :  1 <= {Math.random() * 10} + 1 < 11
		// ������ ����� ���� int����ȯ : 1 <= (int)({Math.random() * 10} + 1) < 11
		
		int random = (int)((Math.random() * 10)+1);
		
		int sum = 0;
		
		for(int i = 1; i <= random; i++) {
			sum +=i;
		}
		System.out.printf("1���� %d���� ���� �հ� : %d", random, sum);
	}
	public void method6() {
		//2�ܺ��� 9�ܱ��� ���
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
//				System.out.print(i + "*" + j + " = " + j*j);
				System.out.printf("%d * %d = %d%n", i, j, (i*j));
			}
			System.out.println();
		}
	}
	public void method7() {
		// �Ƴ��α� �ð� ��� : 0�� 0�� ~ 23�� 59��
		
		for(int si = 0; si <= 23; si++) {
			for(int bun = 0; bun <= 59; bun++) {
				System.out.printf("%d�� %d�� ", si, bun);
			}
			System.out.println();
		}
	}
	public void method8() {
		// �� �ٿ� ��(*)ǥ�� 5�� ��µǴµ�
		// �� ���� ����ڰ� �Է��� ����ŭ ���
		/*
		 	����� �� �� : 3
		 	*****
		 	*****
		 	*****
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �� �� : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void method9() {
		// �� �ٿ� ��ǥ ���ڸ� �Էµ� �� ���� ĭ �� ��ŭ �Է�
		// ��, �� ���� ĭ ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ������ ���
		/*
		 	�� �� : 6
		 	ĭ �� : 6
		 	1*****
		 	*2****
		 	**3***
		 	***4**
		 	****5*
		 	*****6
		 	*/
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� : ");
		int row = sc.nextInt();
		
		System.out.print("ĭ �� : ");
		int col = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int j =1; j <= col; j++) {
				if(i == j) {
					System.out.print(i);
				}else {
					System.out.print("*");
				}
			}
			System.out.println(); 
		}
	}
}
