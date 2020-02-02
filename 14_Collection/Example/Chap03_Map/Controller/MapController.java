package com.kh.example.map.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.vo.Snack;

public class MapController {
	public void doMap() {
		Map<String, Snack> map = new HashMap<String, Snack>(); // 키는 equals와 hashCode가 이미 오버라이딩 되어있는 String으로 많이 사용
		
		// put(K key, V value) : 키와 값 추가, 성공시 value(값) 반환
		map.put("새우깡", new Snack("짠맛", 1500));
		map.put("다이제", new Snack("단맛", 2500));
		map.put("포테이토칩", new Snack("짠맛", 1500));
		map.put("고소미", new Snack("고소한맛", 1000));
		System.out.println(map); // key = value 형식으로 출력 && value가 같아도 문제 없이 출력됨
		
		map.put("새우깡", new Snack("매운맛", 1500));
		System.out.println(map); // key가 같으니까 value가 덮어 씌워져서 나옴
		
		// 키 또는 값이 있는지 없는지 확인하는 메소드(2가지) 
		// containsKey(Object key) : key가 있으면 true 반환
		// containsValue(Object value) : value가 있으면 true 반환
		System.out.println(map.containsKey("새우깡"));
		System.out.println(map.containsValue(new Snack("짠맛", 1500))); // 주소값만 비교하는데 다른 객체로 인식하기 때문에 equals()와 hashCode() 오버라이딩 해줌
		
		// get(Object key) : 키의 값을 반환
		System.out.println(map.get("새우깡"));
		System.out.println(map.get("홈런볼")); // 없는 키를 넣으면 값이 null로 출력됨
		
		// Map을 List나 Set화 시켜서 iterator() 사용하기 - Entry 가장 많이 사용!!
		
		// 1. values() : 모든 value를 Collections에 담아 반환
		System.out.println(map.values()); // 모든 것들의 (key는 안 갖고 오고) value만 갖고 오는 것
		
		// 2. keySet() : 모든 key를 Set에 담아 반환(key들이 담겨 있는 Set을 반환해주는 메소드 )
		Set<String> set1 = map.keySet();
//		System.out.println(set1); //[다이제, 새우깡, 포테이토칩, 고소미]
		Iterator<String> it = set1.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("키 : " + key + ", 값 : " + map.get(key));
		}
		
		// 3. entrySet() : 모든 entry객체(키와 값의 쌍)를 Set에 담아 반환하는 메소드
		Set<Entry<String, Snack>> set2 = map.entrySet(); // java.util.Map.Entry import
		Iterator<Entry<String, Snack>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			System.out.println("키 : " + entry.getKey() + ", 값 : " + entry.getValue());
		}
		
		//TreeMap
		Map<String, Snack> map2 = new TreeMap<String, Snack>();
		map2.putAll(map);
		System.out.println(map2); // 오름차순으로 정렬되서 나옴 : String comparable이 구현되어있는데 우리가 키를 String으로 지정했기 때문에 아무런 지정없이 정렬됨 
		// 내림차순은 comparator로 할 수 있음
	}
	
	// Properties
	public void doProperties() {
		Properties prop = new Properties();
//		prop.put(key, value); // hashtable에 있는 것이어서 상속 받고 있는 것임 !!이거 사용하는 것 아님
		prop.setProperty("채소", "오이");
		prop.setProperty("과일", "사과");
		prop.setProperty("간식", "젤리");
		prop.setProperty("채소", "피망"); // 같은 키값은 덮어씌워져서 덮어씌워진 값으로 출력됨
		System.out.println(prop);
		
		System.out.println(prop.getProperty("채소"));
		System.out.println(prop.getProperty("채소", "땅콩")); // 키 "채소"가 있으면 있는 것을 출력하고
		System.out.println(prop.getProperty("견과", "땅콩")); // 키 "견과"가 없으면 "땅콩"을 츨력
		
	}
	
	public void fileSave() {
//		try (FileOutputStream fos = new FileOutputStream("test.properties");){ // properties 형식으로 저장
		try (FileOutputStream fos = new FileOutputStream("test.xml");){ // xml 형식으로 저장
			
			Properties prop = new Properties();
			prop.setProperty("title", "Properties Practice");
			prop.setProperty("language", "kor");
			
			// store(OutputStream os, String comments)
			// store(Writer writer, String comments)
			// os(또는 writer)에 prop저장(바이트 또는 문자 형식으로), comments는 주석으로 저장
//			prop.store(fos, "Properties Test File"); // properties 형식으로 저장하는 방법
			
			// storeToXML(OutputStream os, String comment)
			// 저장된 정보를 바이트 스트림으로 xml 출력 저장
			prop.storeToXML(fos, "storeToXML Test File");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
//		try(FileInputStream fis = new FileInputStream("test.properties");){ // properties 형식
		try(FileInputStream fis = new FileInputStream("test.xml");){ // xml 형식
			
			Properties prop = new Properties(); // 읽어오는 거 저장할 용도
			
			// load(InputStream is) : 바이트 스트림으로 저장된 파일의 내용을 읽어와서 Properties 객체에 저장
			// load(Reader reader) : 문자 스트림으로 저장된 파일의 내용을 읽어와서 Properties 객체에 저장
//			prop.load(fis); // 읽어와서 prop에 담겠다.
//			System.out.println(prop);
			
			// loadFromXML(InputStream is) : 바이트스트림으로 저장된 xml파일의 내용을 읽어와서 Properties 객체에 저장
			prop.loadFromXML(fis);
			System.out.println(prop);	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
