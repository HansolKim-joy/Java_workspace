package com.kh.example.chap02_sendMsg.contoller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	// Server Socket
	//		��Ʈ�� ����Ǿ� �ܺ��� ��û�� ��ٸ��� ��û�� ������
	//		Socket�� �����Ͽ� ���ϰ� ���ϰ��� ����� �̷�������� ��
	//		�� ��Ʈ�� �� ServerSocket�� ���� ����
	// Socket
	//		���μ��� �� ��� ���
	//		InputStream/OutputStream ���� : �� ��Ʈ���� ���� ���μ��� ���� ���(�����)�� �̷����
	
	public void serverStart() {
		// ������ TCP���� ���α׷��� ����
		// 1) ���� ��Ʈ ��ȣ ����
		// 2) ������ ���� ��ü ���� �� ��Ʈ�� ����
		// 3) Ŭ���̾�Ʈ�� ��û�� ���⸦ ��ٸ�
		// 4) ���� ��û�� ���� ���� ����(accept()) Ŭ���̾�Ʈ�� ���� ���� ��ü ����
		// 5) ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
		// 6) ���� ��Ʈ���� ���� ���� ����
		// 7) ��Ʈ���� ���� �а� ����
		// 8) ��� ����
		
		// 1) ���� ��Ʈ ��ȣ ����
		int port = 8500; // 0~ 65535(1023�� ���ϴ� �̹� ������� ��Ʈ�� ������ �̿��� ��Ʈ �����ϱ�)
		
		// 2) ������ ����(ServerSocket) ��ü ���� �� ��Ʈ�� ����
		try {
			ServerSocket server = new ServerSocket(port);
			
			// 3) Ŭ���̾�Ʈ�� ��û�� ���⸦ ��ٸ�
			System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �ֽ��ϴ�...");
			
			// 4) ���� ��û�� ���� ���� ����(accept()) Ŭ���̾�Ʈ�� ���� ���� ��ü ����
			Socket client = server.accept();
			String clientIP = client.getInetAddress().getHostAddress();
			System.out.println(clientIP + "�� ������ ��û��...");
			
			// 5) ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
			InputStream input = client.getInputStream(); // ���Ͼȿ� InputStream�� OutputStream�� ����
 			OutputStream output = client.getOutputStream();
			
			// 6) ���� ��Ʈ���� ���� ���� ����
 			BufferedReader br = new BufferedReader(new InputStreamReader(input));
 			PrintWriter pw = new PrintWriter(output); // print�� ����ִ� �޼ҵ�
 			
			// 7) ��Ʈ���� ���� �а� ����
			String message = br.readLine();
			System.out.println(clientIP + "�� ���� �޼��� : " + message);
			
			pw.println("������ �ݰ����ϴ�.");
			pw.flush(); // ���ۿ� ���� �ִ� ���� ���� ���� - ���۸� ������ ����� ����
			
 			// 8) ��� ����
			pw.close();
			br.close();
			output.close(); // pw�� br�ȿ� �ֱ� ������ ���� �� ���൵ ��
			input.close(); // pw�� br�ȿ� �ֱ� ������ ���� �� ���൵ ��
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
