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
		
		B_Constant bc = new B_Constant(); //�� �������� ����Ұ� �̷� ����
//		bc.finalConstant(); //�� ������ �� �� finalConstant�� ����ϰڴٴ� �̾߱�
		String str1 = "����" + 123 + 45 + "���";
		String str2 = 123 + 45 + "����" + "���";
//		System.out.println(str1);
//		System.out.println(str2);
		
		
		C_Overflow co = new C_Overflow(); // ��� ��ġ�� �ִ��� �𸣱⿡ �������� - Ctrl + Shift + O �� �ذ�
//		co.overflow(); // co �ȿ� overflow��� �޼ҵ带 ������ ���ڴ�. ���� - Ctrl + F11
//		co.calc(); // 7õ���� ���;� �ϴµ� �����÷ο� �Ǽ� ������� �ٸ��� ���� - �������� ���� �����÷ο� ���� ����
		
		D_Cast dc = new D_Cast();
//		dc.rule1();
//		dc.rule3();
		// 290�� �־��µ� byte�� ���� ����ȯ�� �����ָ鼭 128�� �ִ�� ���� byte�� ������ �ս��� �Ͼ�� ��� ���� ����
		
		E_PrintMethod ep = new E_PrintMethod();
//		ep.printExample(); 
		// ��� : �ȳ��ϼ���ݰ����ϴ� �ϰ� Ŀ���� '��' �ڿ��� ��
//		ep.printlnExample(); 
		// ��� : �ȳ��ϼ��� (������) �ݰ����ϴ� (������) �ϰ� ������ �����ٿ� Ŀ���� ��
		// ��, str1�� ������ ������ ���� ���� �� println�� ����
//		ep.printfExample();
		//printf�� printó�� �ٹٲ� �ȵǱ� ������ �پ����� ��µ�!
		
		
		F_KeyboardInput fk = new F_KeyboardInput();
//		fk.inputScanner();
		// ���� ������ ��µ� ���� ������ terminated ��� ǥ�õǰ� 
		// scanner�� ����� �� ��쿡�� Run �̶�� �߰� ���� ���� ����� ���� 
		// ���� �Է��ϰ� ���͸� ġ�� terminated��� ������ ���� �׸� � �׸�� �ٲ�� ����� ���� �ٲ�
		
		fk.inputScanner2();
	}
}
