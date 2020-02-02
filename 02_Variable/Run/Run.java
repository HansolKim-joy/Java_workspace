package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_Constant;
import com.kh.variable.C_Overflow;
import com.kh.variable.D_Cast;
import com.kh.variable.E_PrintMethod;
import com.kh.variable.F_KeyboardInput;

public class Run {
	public static void main(String[] args) {
		A_Variable av = new A_Variable();
//		av.declareVariable();
//		av.initVariable();
		
		B_Constant bc = new B_Constant(); //이 문장은는 사용할게 이런 느낌
//		bc.finalConstant(); //이 문장은 그 중 finalConstant를 사용하겠다는 이야기
		String str1 = "기차" + 123 + 45 + "출발";
		String str2 = 123 + 45 + "기차" + "출발";
//		System.out.println(str1);
//		System.out.println(str2);
		
		
		C_Overflow co = new C_Overflow(); // 어떠한 위치에 있는지 모르기에 에러였음 - Ctrl + Shift + O 로 해결
//		co.overflow(); // co 안에 overflow라는 메소드를 가지고 오겠다. 실행 - Ctrl + F11
//		co.calc(); // 7천억이 나와야 하는데 오버플로우 되서 결과값이 다르게 나옴 - 생각보다 많은 오버플로우 현상 주의
		
		D_Cast dc = new D_Cast();
//		dc.rule1();
//		dc.rule3();
		// 290을 넣었는데 byte로 강제 형변환을 시켜주면서 128을 최대로 갖는 byte는 데이터 손실이 일어나며 결과 값을 도출
		
		E_PrintMethod ep = new E_PrintMethod();
//		ep.printExample(); 
		// 결과 : 안녕하세요반갑습니다 하고 커서가 '다' 뒤에로 감
//		ep.printlnExample(); 
		// 결과 : 안녕하세요 (다음줄) 반갑습니다 (다음줄) 하고 마지막 다음줄에 커서가 감
		// 즉, str1이 끝나고 다음쭐 까지 가는 게 println의 역할
//		ep.printfExample();
		//printf도 print처럼 줄바꿈 안되기 때문에 붙어져서 출력됨!
		
		
		F_KeyboardInput fk = new F_KeyboardInput();
//		fk.inputScanner();
		// 위의 경우들은 출력된 문장 윗줄이 terminated 라고 표시되고 
		// scanner를 사용한 이 경우에는 Run 이라고 뜨고 실행 중인 결과로 나옴 
		// 이후 입력하고 엔터를 치면 terminated라고 나오고 빨간 네모가 까만 네모로 바뀌고 비샐행 모드로 바뀜
		
		fk.inputScanner2();
	}
}
