package com.kh.example.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break문은 나를 포함하는 가장 가까운 반복문을 나감
	
	public void method1() {
		// 문자열을 입력 받아 글자 개수를 출력하는 반복 프로그램
		// 단, end가 입력되면 반복 종료
		// do~while 사용
		
//		Scanner sc = new Scanner(System.in);
//		String str = null;
//		do {
//			System.out.print("문자열을 입력하세요 : ");
//			str = sc.nextLine();
//			int num = str.length();
//			
//			System.out.println(num);
//		} while(!str.equals("end"));
		// 이건 내가 한 거 - break 안쓰는거
		
		// 이제부터는 break쓰는 거 
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			if(str.contentEquals("end")) {
				break;
			}
			
			System.out.println(str + "의 글자 개수 : " + str.length());
		}while(true); 
		// break를 안쓰고 while(true)일때의 상황 : : 무한 반복문 / 무한 루프
	}
	
	public void method2() {
		// 1부터 사용자에게 입력 받은 숫자까지의 합 출력
		// for문 사용
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 : ");
		int sum = 0;
		int num = sc.nextInt();
		
		for(int i = 1; /* i <= num */; i++) { 
			// break를 사용하기 위해 조건문을 주석처리 했지만
			// 그냥 break가 포함된 if문을 馨 조건식을 주석처리에서 빼면도 실행가능함
			sum += i;
			if(i == num) {
				break;
			}
		}
		System.out.print(sum);
	}
}
