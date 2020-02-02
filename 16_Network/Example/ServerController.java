package com.kh.example.chap04_io.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.example.chap04_io.model.vo.Person;

public class ServerController {
	
	public void startServer() {
		// 1. ������ ��Ʈ ��ȣ ����
		int port = 8500;
		
		// 2. ������ ���� ��ü ����
		try {
			ServerSocket server = new ServerSocket(port);

			// 3. Ŭ���̾�Ʈ�� ��û�� �� ������ ��ٸ�
			System.out.println("Ŭ���̾�Ʈ ��û�� ��ٸ��� ���Դϴ�....");
			
			// 4. ��û�� accept()�� �����ϰ� Ŭ���̾�Ʈ�� ���� ��ü ����
			Socket client = server.accept();
//			String clientIP = client.getInetAddress().getHostAddress();
//			System.out.println(clientIP + "�� ������ ��û��....");
			
			// 5. ����� ��Ʈ�� ����
			// 6. ���� ��Ʈ������ ���� ����
			InputStream input = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(input);
			
			// 7. �а� ����
			Person message = null;
			while(true) {
				message = (Person)ois.readObject();
				
				if(message != null) {
					System.out.println(client.getInetAddress().getHostAddress() + "�� ���� �޼��� : " + message);
				}else {
					break;
				}
			}
			
			// 8. ��� ����
			ois.close();
			server.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
