package com.kh.example.set.model.compare;

import java.util.Comparator;

import com.kh.example.set.model.vo.Dog;

public class DogComparator implements Comparator<Dog>{

	@Override
	public int compare(Dog arg0, Dog arg1) { //���� o1,o2�� �����µ� ���� �ٸ��� ����?? : �Ű� �Ƚᵵ ��
		// ������ �������� ����
		
		double standard = arg0.getWeight();
		double object = arg1.getWeight();
		
		if(standard > object) {
			return 1;
		}else if(standard == object) {
//			return 0; //���� �� �����Ը� ������ ���� ��ü�� �� �˰� �ϳ��� �� ������ ��
			return arg0.getName().compareTo(arg1.getName());
			// �̸����ε� ������ �Ǳ� ������ �����԰� ������
			// �̸��� �ٸ��� ������ ���̸� �ٸ� ��ü�� �����ϰ� �ǰ�
			// ����� ���̸� ã�� �� ����
		}else {
			return -1;
		}
	}
}
