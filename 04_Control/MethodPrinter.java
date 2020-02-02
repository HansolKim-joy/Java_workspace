package com.kh.test;

public class MethodPrinter {
	public void methodA() {
		System.out.println("methodA() 호출됨....");
		methodB();
		//Unreachable code
		//앞에 return 때문에 methodB가 실행될 일이 없다는 의미 
		System.out.println("methodA() 끝....");
	}
	public void methodB() {
		System.out.println("methodB() 호출됨....");
		methodC();
		System.out.println("methodB() 끝....");
	}
	public void methodC() {
		System.out.println("methodC() 호출됨....");
		System.out.println("methodC() 끝....");
	}
}
