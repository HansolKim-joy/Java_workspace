package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceController {
	public void method() {
		// Parent 클래스의 num필드에 접근
		System.out.println("Parent 클래스의 num필드에 접근");
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("Parent 안에 있는 num : " + p.getNum());
		
		System.out.println();
		
		System.out.println("Child1클래스의 str필드 접근");
		Child1 c1 = new Child1();
		c1.setStr("Hello");
		System.out.println("Child1 안에 있는 str : " + c1.getStr());
		
		System.out.println("Child1클래스의 num필드 접근");
		c1.setNum(99);
		System.out.println("Chile1 안에 있는 num : " + c1.getNum());
		
		System.out.println();
		
		System.out.println("Child2클래스의 str필드 접근");
		Child2 c2 = new Child2();
		c2.setStr("World");
		System.out.println("Child2 안에 있는 str : " + c2.getStr());
		
		System.out.println("Child2클래스가 상속받은 Parent의 필드 접근");
//		c2.num;
		// Parent클래스에서 num필드를 private으로 설정해두었기 때문에 상속받았다 하더라도 자기 자신이 아닌 c2에서는 보이지 않는다.
		c2.setNum(999);
		System.out.println("Child2 안에 있는 num : " + c2.getNum());
		System.out.println("Parent 안에 있는 num : " + p.getNum());
		// Child2의 num은 Parent에서 물려받았지 연결되어 있는 것이 아니기 때문에
		// Child2에서 num값을 설정해줘도 Parent의 num값은 변하지 않고 Parent객체에서 setter로 설정해준 값이 유지됨
	}
}
