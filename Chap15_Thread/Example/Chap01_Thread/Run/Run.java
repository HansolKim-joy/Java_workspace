package com.kh.example.chap01_thread.run;

import com.kh.example.chap01_thread.thread.Thread1;
import com.kh.example.chap01_thread.thread.Thread2;
import com.kh.example.chap01_thread.thread.Thread3;

public class Run {
	public static void main(String[] args) {
		
		Thread1 thread1 = new Thread1();
//		thread1.start(); // 메인과 다른 스레드가 생성되고 메인스레드가 일하고 start()의 스레드가 시작됨
//		thread1.run(); // 메인이 실행되고 run이 쌓이기 때문에 스레드가 실행된 후에 메인메소드의 내용이 출력됨
		
		Thread2 t2 = new Thread2();
		Thread thread2 = new Thread(t2);
//		thread2.start(); // 
		
		Thread3 thread3 = new Thread3();
//		thread3.start();
		
//		thread1.start();
		// java.lang.IllegalThreadStateException
		// 한번 종료된 스레드를 다시 실행시킬 수 없기(호출할 수 없기) 때문에 발생하는 에러
		
		// 기본 우선순위인 5를 갖고 있음
		System.out.println("t1 우선순위 : " + thread1.getPriority());
		System.out.println("t2 우선순위 : " + thread2.getPriority());
		System.out.println("t3 우선순위 : " + thread3.getPriority());
		
		// 스레드의 우선순위 변경
		thread1.setPriority(3);
		thread2.setPriority(Thread.MAX_PRIORITY); // 스레드 우선 순위 최고 : 10
		thread3.setPriority(Thread.MIN_PRIORITY); // 스레드 우선 순위 최저 : 1
		
		System.out.println("t1 우선순위 : " + thread1.getPriority()); 
		System.out.println("t2 우선순위 : " + thread2.getPriority());
		System.out.println("t3 우선순위 : " + thread3.getPriority());
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		// 요즘 왠만하면 우선 순위 둔다고 해도 눈에 보일 정도로 다르지 않음
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			// 자신(main thread)이 하던 작업을 잠시 멈추고 다른 스레드(thread1, thread2, thread3)가 지정된 시간동안 실행되도록 함
			// 실행되고 있는 위치의 스레드가 자신이 되는 것! => 실행되고 있는 위치를 보면 됨
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("-------------------- main end!");
		
	}
}
