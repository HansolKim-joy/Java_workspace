package com.kh.example.chop05_construnctor.run;

import com.kh.example.chop05_construnctor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User();
		// �Ű����� �ִ� �����ڸ� ���� ���¿��� �⺻�����ڸ� �������� ���� ����
		// The constructor User() is undefined
		u1.inform();
		
		User u2 = new User("id�Դϴ�","pwd�Դϴ�");
		u2.inform();
		
		User u3 = new User("id�Դϴ�","pwd�Դϴ�","�̸��Դϴ�");
		u3.inform();
	}
}
