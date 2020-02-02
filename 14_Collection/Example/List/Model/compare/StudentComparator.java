package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

public class StudentComparator implements Comparator<Student> {
	
	@Override
	public int compare(Student o1, Student o2) {
		// 점수 오름차순 정렬
		// 비교 주체가 비교 대상보다 크면 양수
		// 비교 주체가 비교 대상보다 작으면 양수
		// 비교 주체가 비교 대상과 같으면 0을 반환
		
		int standard = o1.getScore(); // 주체의 역할을 하도록 할 것임
		int object = o2.getScore(); // 대상 역할을 하도록 할 것임
		
		// 점수가 같을 때 이름으로 정렬 해주기 위해 작성됨
		String standardName = o1.getName();
		String objectName = o2.getName();
		
		if(standard > object) {
			return 1;
		}else if(standard == object) {
//			return 0;
			return standardName.compareTo(objectName); // 이름에 대한 오름차순으로 나오게 함 
		}else {
			return -1;
		}
	}
}
