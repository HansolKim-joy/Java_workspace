package com.kh.example.set.model.compare;

import java.util.Comparator;

import com.kh.example.set.model.vo.Dog;

public class DogComparator implements Comparator<Dog>{

	@Override
	public int compare(Dog arg0, Dog arg1) { //쌤은 o1,o2로 나오는데 나는 다르게 나옴?? : 신경 안써도 됨
		// 몸무게 오름차순 정렬
		
		double standard = arg0.getWeight();
		double object = arg1.getWeight();
		
		if(standard > object) {
			return 1;
		}else if(standard == object) {
//			return 0; //같을 때 몸무게만 같으면 같은 객체인 줄 알고 하나를 안 나오게 함
			return arg0.getName().compareTo(arg1.getName());
			// 이름으로도 정렬이 되기 때문에 몸무게가 같더라도
			// 이름이 다르기 때문에 로이를 다른 객체로 인지하게 되고
			// 사라진 로이를 찾을 수 있음
		}else {
			return -1;
		}
	}
}
