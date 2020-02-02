package com.kh.example.chop05_construnctor.run;

import com.kh.example.chop05_construnctor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User();
		// 매개변수 있는 생성자를 만든 상태에서 기본생성자를 지웠을때 나는 에러
		// The constructor User() is undefined
		u1.inform();
		
		User u2 = new User("id입니다","pwd입니다");
		u2.inform();
		
		User u3 = new User("id입니다","pwd입니다","이름입니다");
		u3.inform();
	}
}
