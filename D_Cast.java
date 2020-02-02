package com.kh.variable;

public class D_Cast {
	public void rule1() {
		boolean flag = true;
//		boolean flag2 = 100; //형변환에서 boolean은 제외되기 때문에 불가
		
		int num = 'A' ; 
	//크기적으로는 가능하지만 문자가 숫자로 들어가는 것이 이상하지만 문자가 숫자로 저장되어 있기 때문에 가능
		System.out.println("num : " + num);
		
		
		char ch = 97;
		System.out.println("ch : " + ch);
		
		char ch2 = (char) num;
		//그냥 num으로 입력했을 때 : Type mismatch: cannot convert from int to char
		//int는 4byte 이고 char는 2byte 이니까 넣을 수 없는데
		//**위와 다른 이유는 97은 리터럴이므로 인식가능한데 num은 변수이기 때문에 자체의 크기만 볼 수 있음 - 크기만의 비교
		//따라서 강제형변환이 필요해진다. 따라서 (char)를 앞에 입력하면서 오류 해결
		System.out.println("ch2 : " + ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3 : " + ch3);
		// 결과 값이 ?로 나오는데 이것은 문자를 찾을 수 없다는 의미임 - 문자가 ?인것은 아님
		// char의 범위는 0~ 이므로 음수값이 -를 입력하면 결과 값이 없다는 의미 
	}
	
	public void rule2 () {
		int iNum = 10;
		long lNum = 100;
		
//		int result = iNum + lNum;
		// iNum은 int이고 lNum은 long이므로 iNum이 long 형으로 따라가(자동 형변환) 오른쪽 결과 값은 long형으로 나오는데
		// 왼쪽에서 int형으로 result값을 뽑으려 하니 오류가 발생 
		
		//iNum + lNum을 int result로 저장할 수 있는 방법 : 
		// 방법 1. 수행 결과를 int로 강제 형변환 하는 방식
		int result = (int)(iNum + lNum);
		
		// 방법 2. long형을 int로 강제 형변환 시키는 방법
		int result2 = iNum + (int)lNum;
		
		// 번외, 결과 값을 저장하는 result를 long 형으로 받는 방법
		long result3 = iNum + lNum;
	}
	
	public void rule3() {
		int iNum = 290;
		
		byte bNum = (byte)iNum;
		// iNum으로 그냥 입력한 경우 : Type mismatch: cannot convert from int to byte
		
		System.out.println("bNum : " + bNum);
		
	}
	
	
	
	
	
	
	
}
