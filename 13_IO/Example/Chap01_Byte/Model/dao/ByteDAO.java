package com.kh.example.chap01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		
		try(FileInputStream fis = new FileInputStream("a_byte.txt");) {
			// abcdefgcde 출력 되야 하는데...
//			while(fis.read() != -1) {
//				System.out.print((char)fis.read() + " ");
//			}
//			// b d f c e : read는 다음에 있는 것을 읽어오기 때문에 while문에서 한번 읽히고(a)
//			// 들어와서 다시 읽어서(b)가 프린트 되고 그것이 반복되기 문에 띄엄띄엄 나오게 됨
			
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
			// FileOutputStream에 boolean append라는 매개변수를 붙였다라고 하면(즉, 내가 true라고 하면)
			// true면 append라고 하는 것이기 때문에 a_byte.txt에 append(이어써짐)되게 됨
			
			// write(int b) : void
			fos.write(97);
			
			// write(byte[] b) : void
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			//			    b  c    d    e    f    g
			fos.write(bArr);
			
			// wirte(byte[] b, int off, int len) : void
			fos.write(bArr, 1, 3); // 1 index부터 3개
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			// IOException의 예외 처리 범위가 FileNotFoundException의 범위보다 크기 때문에 
			// catch할 때 순서를 잘 생각해야함 
			// 상황에 따라 마지막에 오는 것들은 Exception이 올 수 있음
			// 실무에서는 간편한 코드를 짜기 위해 Exception으로만 처리 하는 경우도 있음
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
