package com.kh.example.chap01_throws.run;

import com.kh.example.chap01_throws.controller.ThrowsController;

public class Run {
	public static void main(String[] args) {
		// 메인 메소드에서도 예외 상황을 호출한 쪽(JVM)으로 위임할 수 있음 ====> 비정상 종료
		ThrowsController tc = new ThrowsController();
		
		try {// 예외가 발생할 수 있는 코드가 들어감
			tc.method1();
		} catch (Exception e) {
//			e.printStackTrace(); // 예외 내용과 예외 발생 위치를 콘솔에 출력해주는 메소드
			// 이 경우 에러가 아니고 에러가 난 내용과 위치를 알려주는 것으로 출력해준 것 : 에러의 출력이기 때문에 에러처럼 빨갛게 보여지는 것
			
			System.out.println("예외 상황이 발생하였습니다.");
		}
		
		System.out.println("정상적으로 종료됨...");
		// catch 전까지는 문제가 해결 되지 않았지만 얘가 뜨는 이유는  catch가 에러를 잡아주었기 떄문에 에러없이 출력될 수 있는 것이고
		
	}
}
