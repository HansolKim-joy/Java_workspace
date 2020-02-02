package com.kh.example.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class B_ArrayCopy {
	// 얕은 복사 : 배열의 주소만 복사
	// 깊은 복사 : 동일한  새로운 배열을 생성하여 실제 내부 값 복사
	//		1) for문을 이용한 1:1 복사
	//		2) System.arraycopy() 이용한 복사
	//		3) Arrays.copyOf() 이용한 복사
	//		4) clone() 이용한 복사              - 얘는 안함 // 자바에서 얘는 웬만하면 건들지 말라는 경고했음 
	
	public void method1() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = originArr; // 얕은 복사 
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		//원본 배열의 0번 인덱스를 99로 변경
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("originArr의 주소값 : " + originArr);
		System.out.println("copyArr의 주소값 : " + copyArr);
	}
	
	public void method2() {
		// 깊은 복사 1. for문 이용
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[5];
		
		for(int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i];
		}
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("======= origniArr의 0번째 인덱스를 99로 변경 ========");
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
	}  
	
	public void method3() {
		// 깊은 복사 2. arraycopy() 이용
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
//		System.arraycopy(src, srcPos, dest, destPos, length);
		// src : 원본 배열
		// srcPos : 원본 배열의 시작 위치 - 어디서부터 복사하기 시작할 것이냐
		// dest : 복사 배열 - 어떠한 값을 어디에다 복사를 할것이냐
		// destPos : 복사 배열의 시작 위치 
		// length : 복사 길이
		
		// originArr배열의 모든 데이터를 copyArr배열에 복사를 하는데
		// copyArr의 index3 에서부터 붙여넣고 싶음
		
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length;i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length;i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
	}
	public void method4() {
		// 깊은 복사 3. Array.copyOf() 이용
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		System.out.println("======= 처음 값 ========");
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
			// int에 기본값이 0이기 때문에 기본값으로 Heap영역에 초기화 되어있기 때문에 
			// 이렇게 보여지면 0으로 나옴
		}
		System.out.println();
		
		System.out.println("======= copyOf()로 복사 후 =========");
		// Arrays.copyOf(original, newLength)
		//               원본배열        복사할 길이
		copyArr = Arrays.copyOf(originArr, originArr.length);
		// Arrays (. 앞부분) 클래스는 배열을 사용할 때 편리하겠다 싶은 것들을 모아논 클래스 
		
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
	}
}
