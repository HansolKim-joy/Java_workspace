package com.kh.example.chap04_field.model.vo;

public class Product {
	private String name = "초코파이"; 
	private String brand = "오리온";
	private int price = 1500;
	private static int num = 100;
	
	{
		name = "칸초";
		brand = "롯데";
		price = 1000;
		num -= 10;
	}
	
	static {
//		name = "홈런볼";
//		brand = "해태";
//		price = 2000;
//		// Cannot make a static reference to the non-static field name
//		// 인스턴스변수는 객체가 만들어져야 메모리영역(Heap영역)에 올라가는데
//		// static이 붙은 초기화 블록의 것은 프로그램이 시작하자마자 메모리영역(Static영역)에 올라가기 때문에 오류발생
		
		num = 150;
		num--;
	}
	
	public void inform() {
		System.out.println(name + ", " + brand + ", " + price + ", " + num);
	}
}
