package com.kh.example.chap03_sync.run;

import com.kh.example.chap03_sync.resource.Resources;
import com.kh.example.chap03_sync.thread.Customer;
import com.kh.example.chap03_sync.thread.Product;

public class Run {
	public static void main(String[] args) {
		Resources resources = new Resources();
		
		Thread t1 = new Product(resources);
		Thread t2 = new Customer(resources);
		
		t1.start();
		t2.start();
		
		//java.lang.IllegalMonitorStateException
		// wait()가 동기화된 상태(메소드 또는 블럭)에서 사용해야 하는데 동기화되지 않은 일반 메소드 안에서 사용되었기 때문에 발생한 에러 발생
		// 
	}

}
