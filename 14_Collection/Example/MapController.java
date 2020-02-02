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
		Map<String, Snack> map = new HashMap<String, Snack>(); // Ű�� equals�� hashCode�� �̹� �������̵� �Ǿ��ִ� String���� ���� ���
		
		// put(K key, V value) : Ű�� �� �߰�, ������ value(��) ��ȯ
		map.put("�����", new Snack("§��", 1500));
		map.put("������", new Snack("�ܸ�", 2500));
		map.put("��������Ĩ", new Snack("§��", 1500));
		map.put("��ҹ�", new Snack("����Ѹ�", 1000));
		System.out.println(map); // key = value �������� ��� && value�� ���Ƶ� ���� ���� ��µ�
		
		map.put("�����", new Snack("�ſ��", 1500));
		System.out.println(map); // key�� �����ϱ� value�� ���� �������� ����
		
		// Ű �Ǵ� ���� �ִ��� ������ Ȯ���ϴ� �޼ҵ�(2����) 
		// containsKey(Object key) : key�� ������ true ��ȯ
		// containsValue(Object value) : value�� ������ true ��ȯ
		System.out.println(map.containsKey("�����"));
		System.out.println(map.containsValue(new Snack("§��", 1500))); // �ּҰ��� ���ϴµ� �ٸ� ��ü�� �ν��ϱ� ������ equals()�� hashCode() �������̵� ����
		
		// get(Object key) : Ű�� ���� ��ȯ
		System.out.println(map.get("�����"));
		System.out.println(map.get("Ȩ����")); // ���� Ű�� ������ ���� null�� ��µ�
		
		// Map�� List�� Setȭ ���Ѽ� iterator() ����ϱ� - Entry ���� ���� ���!!
		
		// 1. values() : ��� value�� Collections�� ��� ��ȯ
		System.out.println(map.values()); // ��� �͵��� (key�� �� ���� ����) value�� ���� ���� ��
		
		// 2. keySet() : ��� key�� Set�� ��� ��ȯ(key���� ��� �ִ� Set�� ��ȯ���ִ� �޼ҵ� )
		Set<String> set1 = map.keySet();
//		System.out.println(set1); //[������, �����, ��������Ĩ, ��ҹ�]
		Iterator<String> it = set1.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Ű : " + key + ", �� : " + map.get(key));
		}
		
		// 3. entrySet() : ��� entry��ü(Ű�� ���� ��)�� Set�� ��� ��ȯ�ϴ� �޼ҵ�
		Set<Entry<String, Snack>> set2 = map.entrySet(); // java.util.Map.Entry import
		Iterator<Entry<String, Snack>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			System.out.println("Ű : " + entry.getKey() + ", �� : " + entry.getValue());
		}
		
		//TreeMap
		Map<String, Snack> map2 = new TreeMap<String, Snack>();
		map2.putAll(map);
		System.out.println(map2); // ������������ ���ĵǼ� ���� : String comparable�� �����Ǿ��ִµ� �츮�� Ű�� String���� �����߱� ������ �ƹ��� �������� ���ĵ� 
		// ���������� comparator�� �� �� ����
	}
	
	// Properties
	public void doProperties() {
		Properties prop = new Properties();
//		prop.put(key, value); // hashtable�� �ִ� ���̾ ��� �ް� �ִ� ���� !!�̰� ����ϴ� �� �ƴ�
		prop.setProperty("ä��", "����");
		prop.setProperty("����", "���");
		prop.setProperty("����", "����");
		prop.setProperty("ä��", "�Ǹ�"); // ���� Ű���� ��������� ������� ������ ��µ�
		System.out.println(prop);
		
		System.out.println(prop.getProperty("ä��"));
		System.out.println(prop.getProperty("ä��", "����")); // Ű "ä��"�� ������ �ִ� ���� ����ϰ�
		System.out.println(prop.getProperty("�߰�", "����")); // Ű "�߰�"�� ������ "����"�� ����
		
	}
	
	public void fileSave() {
//		try (FileOutputStream fos = new FileOutputStream("test.properties");){ // properties �������� ����
		try (FileOutputStream fos = new FileOutputStream("test.xml");){ // xml �������� ����
			
			Properties prop = new Properties();
			prop.setProperty("title", "Properties Practice");
			prop.setProperty("language", "kor");
			
			// store(OutputStream os, String comments)
			// store(Writer writer, String comments)
			// os(�Ǵ� writer)�� prop����(����Ʈ �Ǵ� ���� ��������), comments�� �ּ����� ����
//			prop.store(fos, "Properties Test File"); // properties �������� �����ϴ� ���
			
			// storeToXML(OutputStream os, String comment)
			// ����� ������ ����Ʈ ��Ʈ������ xml ��� ����
			prop.storeToXML(fos, "storeToXML Test File");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
//		try(FileInputStream fis = new FileInputStream("test.properties");){ // properties ����
		try(FileInputStream fis = new FileInputStream("test.xml");){ // xml ����
			
			Properties prop = new Properties(); // �о���� �� ������ �뵵
			
			// load(InputStream is) : ����Ʈ ��Ʈ������ ����� ������ ������ �о�ͼ� Properties ��ü�� ����
			// load(Reader reader) : ���� ��Ʈ������ ����� ������ ������ �о�ͼ� Properties ��ü�� ����
//			prop.load(fis); // �о�ͼ� prop�� ��ڴ�.
//			System.out.println(prop);
			
			// loadFromXML(InputStream is) : ����Ʈ��Ʈ������ ����� xml������ ������ �о�ͼ� Properties ��ü�� ����
			prop.loadFromXML(fis);
			System.out.println(prop);	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
