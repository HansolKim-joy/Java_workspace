package com.kh.example.chap01_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetExample {
	// InetAddress 클래스 : IP주소를 다루기 위해 자바에서 제공하는 클래스
	public static void main(String[] args) {
		
		try {
			// static InetAddress getLocalHost() : 지역 호스(네트워크에 연결되어 있는 컴퓨터)의 Host명과 IP주소 반환
			InetAddress localIP = InetAddress.getLocalHost(); // static이기 때문에 객체 생성 불가
			
			// String getHostName() : 호스트 이름 반환
			System.out.println("내 PC명 : " + localIP.getHostName());
			
			// String getHostAddress() : 호스트의 IP 주소 반환
			System.out.println("내 IP : " + localIP.getHostAddress());
			
			// byte[] getAddress() : IP주소를 byte배열로 반환
			byte[] ipAddress = localIP.getAddress();
			System.out.println(Arrays.toString(ipAddress)); // 배열을 문자열로 바꾸는 것 - 오버플로우 되어서 보여지기 때문에 위와 다를 수 있음
			
			System.out.println();
			
			// static InetAddress getByName(String host) : 도메인 명(host)을 통해 IP주소 얻음
			InetAddress ieiIP = InetAddress.getByName("www.iei.or.kr");
			System.out.println("iei 서버 명 : " + ieiIP.getHostName());
			System.out.println("iei 서버 ip : " + ieiIP.getHostAddress());
			
			System.out.println();
			
			InetAddress[] googleIPs = InetAddress.getAllByName("www.google.com");
			System.out.println("구글 IP 개수 : " + googleIPs.length);
			for(InetAddress ip : googleIPs) {
				System.out.println(ip.getHostAddress());
			}
			
			System.out.println();
			
			InetAddress[] naverIPs = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 IP 개수 : " + naverIPs.length);
			for(InetAddress ip : naverIPs) {
				System.out.println(ip.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
