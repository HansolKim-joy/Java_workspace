package com.kh.example.chap04_io.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.example.chap04_io.model.vo.Person;

public class ServerController {
	
	public void startServer() {
		// 1. 서버용 포트 번호 지정
		int port = 8500;
		
		// 2. 서버용 소켓 객체 생성
		try {
			ServerSocket server = new ServerSocket(port);

			// 3. 클라이언트의 요청이 올 때까지 기다림
			System.out.println("클라이언트 요청을 기다리는 중입니다....");
			
			// 4. 요청을 accept()로 수락하고 클라이언트용 소켓 객체 생성
			Socket client = server.accept();
//			String clientIP = client.getInetAddress().getHostAddress();
//			System.out.println(clientIP + "가 연결을 요청함....");
			
			// 5. 입출력 스트림 생성
			// 6. 보조 스트림으로 성능 개선
			InputStream input = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(input);
			
			// 7. 읽고 쓰기
			Person message = null;
			while(true) {
				message = (Person)ois.readObject();
				
				if(message != null) {
					System.out.println(client.getInetAddress().getHostAddress() + "가 보낸 메세지 : " + message);
				}else {
					break;
				}
			}
			
			// 8. 통신 종료
			ois.close();
			server.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
