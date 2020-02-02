package com.kh.variable;

public class C_Overflow {
	public void overflow() {
		byte bNum = 127;
		bNum = (byte)(bNum + 1); // 바이트 + int 형이기 때문에 에러가 났었음 - 앞을 byte로 묶으면서 해결
		System.out.println("bNum : " + bNum);
	}
	
	public void calc() {
		int num1 = 1000000;
		int num2 = 700000;
		
//		int result = num1 * num2;
		long result =(long)num1 * num2;
		
		System.out.println("계산 결과 : " + result);
		// int로 했을 때 : 계산 결과 7천억 예상 - 범위를 벗어나서 결과 값이 다르게 나옴
		// long으로 했을 때 : int 보다 크기가 큰 데이터를 담을 수 있는 자료형으로 7천억으로 맞게 나옴
		
	}
}
