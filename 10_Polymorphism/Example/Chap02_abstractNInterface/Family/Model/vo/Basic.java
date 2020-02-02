package com.kh.example.chap02_abstractNInterface.family.model.vo;

import java.io.Serializable;

public interface Basic extends Cloneable, Serializable {
	//							----------------------  => Marker Interface : interface 내부에 선언된것은 아무것도 없고 이름만 선언된 것
	//										ㄴ 사용하는 이유 : 메소드 강제 오버라이딩이 목적이 아니라 이 interface를 구현한 클래스의 특성을 나타내기 위해서 사용
	
	
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	// 인터스페이스에서는 public abstract 생략가능 하기 때문에
	
	
	// 얘를 다른 클래스에 넣기 위해서 다른 클래스 선언부 마지막부분에 [implements 인터페이스명]을 해준다

}
