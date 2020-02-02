package com.kh.example.chap01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		
		try(FileInputStream fis = new FileInputStream("a_byte.txt");) {
			// abcdefgcde ��� �Ǿ� �ϴµ�...
//			while(fis.read() != -1) {
//				System.out.print((char)fis.read() + " ");
//			}
//			// b d f c e : read�� ������ �ִ� ���� �о���� ������ while������ �ѹ� ������(a)
//			// ���ͼ� �ٽ� �о(b)�� ����Ʈ �ǰ� �װ��� �ݺ��Ǳ� ������ ������ ������ ��
			
			int value;
			while((value = fis.read()) != -1) {
				System.out.print((char)value + " ");
			}
			 
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileSave() {
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("a_byte.txt" /*true*/);
			// FileOutputStream�� boolean append��� �Ű������� �ٿ��ٶ�� �ϸ�(��, ���� true��� �ϸ�)
			// true�� append��� �ϴ� ���̱� ������ a_byte.txt�� append(�̾����)�ǰ� ��
			
			// write(int b) : void
			fos.write(97);
			
			// write(byte[] b) : void
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			//			    b  c    d    e    f    g
			fos.write(bArr);
			
			// wirte(byte[] b, int off, int len) : void
			fos.write(bArr, 1, 3); // 1 index���� 3��
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			// IOException�� ���� ó�� ������ FileNotFoundException�� �������� ũ�� ������ 
			// catch�� �� ������ �� �����ؾ��� 
			// ��Ȳ�� ���� �������� ���� �͵��� Exception�� �� �� ����
			// �ǹ������� ������ �ڵ带 ¥�� ���� Exception���θ� ó�� �ϴ� ��쵵 ����
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
