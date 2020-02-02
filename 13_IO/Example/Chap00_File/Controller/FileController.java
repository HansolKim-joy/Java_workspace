package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method1() {
		
		try {
			File f1 = new File("test.txt");
			f1.createNewFile(); // 얘만 넣어도 되는데 윗 줄까지 왠만하면 같이 넣어주는 걸로
			
			File f2 = new File("c:/test/test.txt");
			f2.createNewFile(); 
			// C드라이브에 test.txt 파일은 만들어 줄 수 있지만 test 폴더는 만들어줄 수 없고 현재 존재하지 않기때문에
			// 지정된 경로를 찾을 수 없다는 에러가 나옴
			// C드라이브에 test폴더를 만들어주면 해결
			
			File f3 = new File("c:\\temp3\\temp2");
			File f4 = new File("c:\\temp3\\temp2\\test.txt");
//			f4.createNewFile(); // C드라이브에 temp3, 그 안에 temp2도 없기 때문에 이렇게 바로 하면 위와 같이 지정된 경로를 찾을 수 없다는 에러가 발생
			f3.mkdirs(); //make directories? 폴더를 만들어주는 것
			f4.createNewFile();
			f4.delete();
			
			System.out.println(f2.exists()); // true : 파일이 존재한다
			System.out.println(f3.exists()); // true : 폴더가 존재한다
			System.out.println(f3.isFile()); // false : f3은 파일이 아니다.
			
			// 그 외의 메소드들
			System.out.println("파일 명 : " + f1.getName());
			System.out.println("저장 절대 경로 : " + f1.getAbsolutePath());
			System.out.println("저장 상대 경로 : " + f1.getPath());
			// 저장 절대 경로 : 절대적인 경로 - 지금 나를 기준으로 어디에 있든지간에 바뀌지 않는 위치
			// 저장 상대 경로 : 상대적인 경로 - 지금 나를 기준으로 나타나지는 위치
			System.out.println("파일 용량 : " + f1.length());
			System.out.println("파일 용량 : " + f2.length());
			System.out.println("f1 상위 폴더 : " + f1.getParent());
			System.out.println("f4 상위 폴더 : " + f4.getParent());
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
