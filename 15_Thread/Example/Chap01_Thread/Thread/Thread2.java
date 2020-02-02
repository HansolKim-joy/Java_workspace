package com.kh.example.chap01_thread.thread;

// ½º·¡µå »ý¼º¹æ¹ý 2 : Runnable implements ÇÏ±â
public class Thread2 implements Runnable{

	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " ON... ");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
