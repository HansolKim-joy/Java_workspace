package com.kh.example.array;

import java.util.Arrays;

public class C_ArraySort {
	// 정렬 : 안에 들어가는 데이터의 순서(위치)를 바꾸고 싶을때 사용
	public void method1() {
		//변수의 두 값 변경하기
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
//		num1 = num2;
//		num2 = num1;
		
		int temp; // 임시로 값을 저장할 변수 생성
		// 적은 수의 변수들의 순서를 바꿀때 사용하기 좋음 - 일일이 만들어줘야함
		
		temp = num1; // temp = 10
		num1 = num2; // num1 = 20
		num2 = temp; // num2 = 10
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int[] arr = {2, 1, 3};
		
		int temp2;
		temp2 = arr[0];
		arr[0] = arr[1];
		arr[1] = temp2;
	}
	
	public void method2() {
		int[] iArr = {2, 5, 4, 6, 1, 3};
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(iArr);
		// sort 메소드는 오름차순으로 정리만 가능함
		// 내림차순은 다른 걸로 만들어서 해야함	
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
	}
}
