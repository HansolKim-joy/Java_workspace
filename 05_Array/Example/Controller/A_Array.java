package com.kh.example.array;

import java.util.Scanner;

public class A_Array {
	//배열 : 같은 자료형의 변수를 하나의 묶음으로 다루는 것

	// 배열 선언 
	//		자료형[] 배열명;
	//		자료형 배열명[]; // 더 많이 사용!
	// 배열 할당
	//		자료형[] 배열명 = new 자료형[배열크기];
	//		자료형 배열명[] = new 자료형[배열크기];
	//		new연산자를 통해 Heap영역에 배열크기만큼 공간 생성
	//		공간이 생성되는 순간 그 공간에 대한 주소 값이 생김
	//		그 주소값이 Stack에 있는 배열명 공간에 대입(참조하고 있음)

	//////////////////////////////////////////////////// 위는 공간만 생성한 것이고 아래는 공간에 값이 부여하는 것 (구분 해야함)

	// 배열 초기화
	//		1) 인덱스 이용
	//			배열명[인덱스번호] = 값;
	//		2) for문 이용 : 규칙이 있을 때만 사용 가능
	//			for(int i = 0; i < 배열명.length; i++){
	//				배열명[i] = 값;
	//		3) 선언과 동시에 초기화
	//			자료형[] 배열명 = {값};
	//			자료형[] 배열명 = new 자료형[]{값};
	
	public void method1() {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		int num6 = 60;
		int num7 = 70;
		int num8 = 80;
		int num9 = 90;
		
		int sum1 = 0;
		sum1 += num1;
		sum1 += num2;
		sum1 += num3;
		sum1 += num4;
		sum1 += num5;
		sum1 += num6;
		sum1 += num7;
		sum1 += num8;
		sum1 += num9;
		
		int arr[] = new int [9];
		// 1. 인덱스 이용 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		arr[7] = 80;
		arr[8] = 90;
//		arr[9] = 100; // java.lang.ArrayIndexOutOfBoundsException: 9
		
		// 2. for문 이용 초기화
		for(int i = 0; i < arr.length;i++) { 
			// arr.length로 하는 이유는 : 
			// 왜 그냥 크기로 안하고 arr.length로 입력하는가?
			// arr.length의 크기를 변화 시킬 수 있기 때문에? - 사실 배열의 크기는 변경 불가능 / 그냥 배열이 바꿔치기 되는 것임
			arr[i] = (i + 1) * 10;
		}
		
		int sum2 = 0;
		for(int i = 0; i < arr.length; i++) {
			sum2 += arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i +"] : " + arr[i]);
		}
	}
	
	public void method2() {
		// 배열은 한 번 지정한 배열의 크기를 변경할 수 없음
		double[] dArr = new double[10];
		System.out.println("dArr의 주소 : " + dArr);
		// 이렇게 하면 주소값이 나오는데 이게 실제 주소값은 아니고 가공처리해서 보여지는 값일뿐이다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 배열 크기 : ");
		int size = sc.nextInt();
		
		dArr = new double[size];
		System.out.println("dARR의 주소 : " + dArr);
		// 원래 Heap영역의 10칸짜리가 size 크기로 줄어드는 것이 아니라
		// new double[size]에 의해서 Heap영역에 size칸의 공간이 만들어지고 그 것을 이제 dArr에 저장해서
		// 원래 10칸짜리의 주소값이 저장된 dArr이 size칸의 주소값으로 변경되어 저장되는 것
		// 즉, 첫번째 10칸짜리의 공간이 size칸으로 줄어드는 것이 아니라는 것
		
		// 참고로, dArr에 저장되있던 주소값을 결과적으로 아무것도 없게 만들고 싶으면
		// dArr = null; 이라고 하면 Heap영역에 저장된 공간의 내용을 참조 하지 않는 Stack영역에서의 dArr 공간에 아무것도 없는 상태가 됨
		
		// 할당된 배열 지우기 
		dArr = null;
	}
	
	public void method3() {
		// 배열 초기화
		// 1. 인덱스 이용 초기화
		int[] iArr = new int[5];
		iArr[0] = 1;
		iArr[1] = 2;
		iArr[2] = 3;
		iArr[3] = 4;
		iArr[4] = 5;
		
		// 2. for문 이용 초기화
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = (i + 1);
		}
		
		// 3. 선언과 동시에 초기화
		int[] iArr2 = {1, 2, 3, 4, 5};
		int[] iArr3 = new int[]{1, 2, 3, 4, 5};
		
	}
}
