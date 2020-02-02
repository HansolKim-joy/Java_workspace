package com.kh.example.chap02_control.thread;

public class Thread4 implements Runnable{

	@Override
	public void run() {
		int count = 0;
		
		// count가 10 미만이면서 현재의 스레드의 intrerupted가 false인 경우 while문 안에 실행
		while(count < 10 && !Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(1000);
				System.out.println((++count) + "초");
			} catch (InterruptedException e) {
				System.out.println(count + "초에 카운트 종료");
				// 이 안에서 interrupt()를 다시 발생시키면 isInterrupted가 계속 true가 될테니까 while의 조건에 맞지 않아져서 while문이 종료될 것임
				Thread.currentThread().interrupt();
			}
		}	
	}
}
