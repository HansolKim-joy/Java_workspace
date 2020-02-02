package com.kh.example.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class B_ArrayCopy {
	// ���� ���� : �迭�� �ּҸ� ����
	// ���� ���� : ������  ���ο� �迭�� �����Ͽ� ���� ���� �� ����
	//		1) for���� �̿��� 1:1 ����
	//		2) System.arraycopy() �̿��� ����
	//		3) Arrays.copyOf() �̿��� ����
	//		4) clone() �̿��� ����              - ��� ���� // �ڹٿ��� ��� �����ϸ� �ǵ��� ����� ������� 
	
	public void method1() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = originArr; // ���� ���� 
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		//���� �迭�� 0���� �ε����� 99�� ����
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("originArr�� �ּҰ� : " + originArr);
		System.out.println("copyArr�� �ּҰ� : " + copyArr);
	}
	
	public void method2() {
		// ���� ���� 1. for�� �̿�
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
		
		System.out.println("======= origniArr�� 0��° �ε����� 99�� ���� ========");
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
		// ���� ���� 2. arraycopy() �̿�
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
//		System.arraycopy(src, srcPos, dest, destPos, length);
		// src : ���� �迭
		// srcPos : ���� �迭�� ���� ��ġ - ��𼭺��� �����ϱ� ������ ���̳�
		// dest : ���� �迭 - ��� ���� ��𿡴� ���縦 �Ұ��̳�
		// destPos : ���� �迭�� ���� ��ġ 
		// length : ���� ����
		
		// originArr�迭�� ��� �����͸� copyArr�迭�� ���縦 �ϴµ�
		// copyArr�� index3 �������� �ٿ��ְ� ����
		
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
		// ���� ���� 3. Array.copyOf() �̿�
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		System.out.println("======= ó�� �� ========");
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
			// int�� �⺻���� 0�̱� ������ �⺻������ Heap������ �ʱ�ȭ �Ǿ��ֱ� ������ 
			// �̷��� �������� 0���� ����
		}
		System.out.println();
		
		System.out.println("======= copyOf()�� ���� �� =========");
		// Arrays.copyOf(original, newLength)
		//               �����迭        ������ ����
		copyArr = Arrays.copyOf(originArr, originArr.length);
		// Arrays (. �պκ�) Ŭ������ �迭�� ����� �� ���ϰڴ� ���� �͵��� ��Ƴ� Ŭ���� 
		
		
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
