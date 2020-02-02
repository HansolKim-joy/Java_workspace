package com.kh.example.chap02_sendMsg.contoller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	// 클라이언트 용 TCP 소켓 프로그래밍 순서
	// 1) 서버의 IP주소와 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
	// 2) 입출력 스트림 생성
	// 3) 보조 스트림을 통해 성능 개선
	// 4) 스트림을 통해 읽고 쓰기
	// 5) 통신 종료
	
	public void clientStart() {
		// 1) 서버의 IP주소와 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
		int port = 8500;
		try { // 지금은 내가 server이고 client이니까 내 IP를 갖고 오지만 실제로는 실제 server의 IP를 갖고 와야 함
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIP, port); // 만약 연결에 실패할 경우 null 반환
			
			if(socket != null) { // 연결에 성공했을 때
				// 2) 입출력 스트림 생성
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				
				// 3) 보조 스트림을 통해 성능 개선
				BufferedReader br = new BufferedReader(new InputStreamReader(input));
				PrintWriter pw = new PrintWriter(output);
				
				// 4) 스트림을 통해 읽고 쓰기
				pw.println("반가워요.");
				pw.flush();
				System.out.println(br.readLine());
				
				// 5) 통신 종료
				pw.close();
				br.close();
				socket.close();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
