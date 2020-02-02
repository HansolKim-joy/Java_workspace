package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
//		str1 == st2; => �ּҰ��� 
//		str1.equals(str2); => str1�� str2�� �����
		
		System.out.println("str1�� str2�� �ּҴ� ������? : " + (str1 == str2));
		System.out.println("str1�� str3�� �ּҴ� ������? : " + (str1 == str3));
		
		System.out.println("str1�� hashCode : " + str1.hashCode());
		System.out.println("str2�� hashCode : " + str2.hashCode());
		System.out.println("str3�� hashCode : " + str3.hashCode());
		
		// hashcode�� ���� �ּҰ��� ������ �ٸ��� �˼� ����
		
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
		
		// str1�� str2�� Heap���� �ȿ� String pool ������ java��� ������ ����� �� �ּҰ��� �����ϴ� �������� ���� ���� �ٶ󺸰� �ְ�
		// str3�� Heap������ java�� ��� �ִ� ��ü�� �����ؼ� �� �ּҰ��� �����ϰ� �ִ� ���̱� ������
		// str1�� str2�� �ּҰ��� ���� �������� str3�� �� �ּҰ����� �ٸ� �ּҰ��� ������ ���̴�.
		
		str2 += "oracle"; // javaoracle;
		
		System.out.println("str1�� str2�� �ּҴ� ������? : " + (str1 == str2));
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
	}
	
	public void method2() {
		// StringBuffer Test
		// ����ؼ� ���� �����ؾ� �� �� String���� ��� ���� ���� ����� ���� ��ġ�� �ٲ��ֱ� ������
		// ������ �÷��Ͱ� ��� ������ ���ϴ� ������ ����(�Һ��̶�� Ư¡ ������)
		// ������ ���� �б⸸ �ϴ� ��쿡�� �Һ� Ŭ������ StringŬ������ �����ϰ�����
		// �����ؾ��ϴ� ���� ���� ��� StringBuffer�̳� StringBuilder�� �ϴ� ���� �� ȿ������
		
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("�ʱ� buffer1�� ���뷮 : " + buffer1.capacity()); // �⺻ 16���� ũ��� ����
		System.out.println("buffer1�� ����ִ� ���� ���� ���� : " + buffer1.length());
		
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100); // ���뷮�� 100���� �������Ѽ� 16���� ����������
		System.out.println("�ʱ� buffer2�� ���뷮 : " + buffer2.capacity());
		System.out.println("buffer2�� ����ִ� ���� ���� ���� : " + buffer2.length());
		
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc"); 
		System.out.println("�ʱ� buffer3�� ���뷮 : " + buffer3.capacity()); // �⺻ 16���� ũ�⿡�� ���� abc�� ũ�� 3���� �������� ���뷮�� 19�� ����
		System.out.println("buffer3�� ����ִ� ���� ���� ���� : " + buffer3.length()); // abc�� ó���� �� �ֱ� ������ ���̰� 3���� ��µ�
		
		System.out.println();
	
		// StringBuilder Test
		// StringBuffer�� StringBuilder�� �Ȱ����� ������ safe����� �����ϴ��� ���ϴ����� ����
		
		StringBuilder builder = new StringBuilder("abc");
		System.out.println("�ʱ� builder�� ���뷮 : " + builder.capacity()); 
		System.out.println("builder�� ����ִ� ���� ���� ���� : " + builder.length()); 
		
		System.out.println();
		
//		builder.append("abc"); // StringBuilder�� ��ȯ �� - append�޼ҵ忡 ���콺���� �ϸ� ù�� ó���� ������ ���� ��ȯ��
//		System.out.println("abc�߰� �Ŀ� builder : " + builder); // abcabc ��� => append�� �߰��ϴ�
//		System.out.println("abc�߰� �Ŀ� builder�� ���뷮 : " + builder.capacity()); 
//		System.out.println("abc�߰� �Ŀ� builder�� ���� : " + builder.length()); 
//		
//		System.out.println();
//		
//		builder.append("def");
//		System.out.println("def�߰� �Ŀ� builder : " + builder); // abcabcdef��� 
//		System.out.println("def�߰� �Ŀ� builder�� ���뷮 : " + builder.capacity()); 
//		System.out.println("def�߰� �Ŀ� builder�� ���� : " + builder.length());
		
		// ���� �ּ��� ������ �ѹ��� ���� �� ����
		builder.append("abc").append("def"); // �޼ҵ� ü�̴�
		// builder.append("abc")�� ��ȯ���� StringBuilder�̰�
		// �ٽ� StringBuilder.append("def")�� �ϴ� ���̱� ������ ���� �ڵ�� ����
		// ��ȯ���� �⺻���� ��쿡�� �� �ȿ� �޼ҵ尡 ���� ������ �޼ҵ� ü�̴� �Ұ� && void�� �翬�� ��ȯ���� ���� ������ �翬�� �޼ҵ� ü�̴� �Ұ� 
		
		System.out.println("abc, def �߰� ���� builder : " + builder);
		System.out.println("abc, def �߰� ���� builder ���뷮 : " + builder.capacity());
		System.out.println("abc, def �߰� ���� builder ���� : " + builder.length());
		
		System.out.println();
		// append�� ���� ���ڿ��� �� �ڿ��� ���� �� �ִµ� �׷��� ���� ���� ��� - insert�޼ҵ� ���
		builder.insert(2, "zzz"); //�ι�° �ε����Ŀ� zzz�� ����
		System.out.println("�ε���2�� zzz �߰� ���� builder : " + builder);
		
		System.out.println();
		builder.delete(2, 5); //start <= �ε��� < end ���� ���� ������ ���� - �ڹٿ����� ó������ �� ���������� ������ // DB���� ����
		System.out.println("�ε���2���� 5���� ���� ���� builder : " + builder);
		
		System.out.println();
		
		builder.reverse();
		System.out.println("reverse ���� builder : " + builder); // ���ڿ��� �Ųٷ� ���
		
		System.out.println();
		
		StringBuilder sb = new StringBuilder("abc");
		sb = sb.append("zzz").insert(2, "yy").reverse().delete(1, 3); // zcyyba ��� ����
		System.out.println(sb); // ������ zcyyba ���
		
	}
	
	public void method3() { // String �ȿ� �ִ� method��
		
		String str = "Hello World";
		// 1. charAt(int index) : char
		//		String�� index��° char ��ȯ
		char ch = str.charAt(4);
		System.out.println(ch);
		
		// 2. concat(String str) : String
		//		�Ű������� ���� ���� ���� String ���� �̾���� ��(String)�� ��ȯ
		
		String concat = str.concat("!!!");
		System.out.println(concat);
		
		str += "!!!";
		System.out.println(str);
		// concat�� ���� ���
		
		// 3. equals() : boolean
		System.out.println("concat.equals(str) : " + concat.equals(str));
		
		// 4. substring(int beginIndex) : String
		//	  substring(int beginIndex, int endIndex) : String
		//		String�� �Ϻθ� ��ȯ - �Ű������� �ϳ���, �� �ε������� ������ ��ȯ
		//						- �Ű������� �ΰ���, ���� �ε������� �� �ε��� ������ ��ȯ
		System.out.println("str.substring(6) : " + str.substring(6)); // �ε��� 6������ ������ ��ȯ�ض�
		System.out.println("str.substring(0,5) : " + str.substring(0, 5)); // �ε��� 0������ 5�� �̸����� ��ȯ�ض�
		
		// 5. replace(char oldChar, char newChar) : String
		//		���� char�� ���ο� char�� ��ü�ؼ� ��ȯ
		System.out.println("str.replace('l','e') : " + str.replace('l', 'e'));
		
		// 6. toUpperCase()/ toLowerCase() : String
		//		��� �빮�ڷ� ��ȯ / ��� �ҹ��ڷ� ��ȯ
		System.out.println("str.toUpperCase() : " + str.toUpperCase());
		System.out.println("str.toLowerCase() : " + str.toLowerCase());
		
		// 7. equalsIgnoreCase() : boolean
		//		��ҹ��� ���о��� �� ���ϴ� ���ڿ��� ���縵�� ���ؼ� �´��� Ʋ���� ��ȯ
		String str2 = "Wonderful";
		String str3 = "wonderful";
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		System.out.println("str2.equalsIgnoreCase(str3) : " + str2.equalsIgnoreCase(str3));
		
		// 8. trim() : String
		//		��/�ڿ� �ִ� ����(�� ����)�� ������ ���ڿ��� ���븸 ��ȯ - ���ڿ� ������ �߰��� �ִ� ������ �������� ����
		String str4 = "     Java";
		String str5 = "Java     ";
		String str6 = "    Ja  va    ";
		System.out.println(str4 + "| str4.trim() : " + str4.trim());
		System.out.println(str5 + "| str5.trim() : " + str5.trim());
		System.out.println(str6 + "| str6.trim() : " + str6.trim());
		
		// 9. split(String str) : String[]
		//		���ڿ��� �и��Ͽ� �迭�� ��� ��ȯ
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framework";
		String[] splitArr = splitStr.split(", ");
		System.out.println("�и��� ���ڿ� ���� (split) : " + splitArr.length);
		
		// �Ϲ� for��
//		for(int i = 0; i < splitArr.length; i++) {
//			System.out.println(splitArr[i]);
//		} 

		// ���� for��(for-each��) 
		// ???????????????? => �츮�� ���� ��� splitArr(�� �迭�� �ʿ� ���� / �÷��ǵ� ����)�� �˾Ƽ� ó������ ������ ����
		// �� ������ ��� s��� ���� ��� �ٷ� println ���ְڴ�.(���⼱ String �迭�̰� �� �ȿ� ������ String�̴ϱ� String s�� ����)
		for(String s : splitArr) {
			System.out.println(s);
		}
	}
	
	public void method4() {
		// StringTokenizer = split�� ���� ����� �ϴ� Ŭ����
		// �׷� �� �ұ�?? -> �������� ����
		String str = "Java, Oracle, JDBC, Front, Server, Framework";
		StringTokenizer stObj = new StringTokenizer(str, ", ");
		System.out.println("�и��� ���ڿ� ���� : " + stObj.countTokens());
		while(stObj.hasMoreTokens()) { // stObj�� �� ��ū�� �ִ°�? true�� ������
			System.out.println(stObj.nextToken()); // ���� �ִٴ� ��ū�� ���� ���
		}
		System.out.println("���� ���� ���� ���ڿ� ���� : " + stObj.countTokens()); // �ִ� ���� ������ �� �������� ������ 0�� ����
		
		System.out.println();
		
		String str2 = "Apple,Banana-Cream*Dessert#Egg Fruits";
		StringTokenizer stObj2 = new StringTokenizer(str2, ", -*#"); // ������ ���ؿ� ���� ������ ��� ���� 
		System.out.println("�и��� ���ڿ� ���� : " + stObj2.countTokens());
		while(stObj2.hasMoreTokens()) {
			System.out.println(stObj2.nextToken());
		}
		
		// split()�� StrinTokenizer�� ������
		// 1. �и��� ���ڿ��� String[]�� ó���ϰ� ���� �� string()�޼ҵ�
		//	   �и��� ���ڿ��� ��ü�� ó���ϰ� ���� �� StringTokenizerŬ����
		// 2. split()�޼ҵ��� �����ڴ� 1��
		//	  StringTokenizerŬ������ �����ڴ� ������ ����
	}
}
