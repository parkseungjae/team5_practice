package com.care.telephone_juhee;

import java.util.HashMap;
import java.util.Scanner;

public class telephone_juhee {
	private Scanner scanner = new Scanner(System.in);
	private String id, phoneNum; 
	private int num, select; 
	HashMap<String, String> phoneNumMap = new HashMap<String, String>();
//��ȭ ���
/*
����ó ����
����ó ����
����ó ã��
����ó ����
����ó ��� ����
*/	
	public Scanner getScanner() {
		return scanner;
	}
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getSelect() {
		return select;
	}
	public void setSelect(int select) {
		this.select = select;
	}
	public HashMap<String, String> getPhoneNumMap() {
		return phoneNumMap;
	}
	public void setPhoneNumMap() {
		phoneNumMap.put(id, phoneNum);
	}
	//�޼ҵ�
	public void saveNum() {
		System.out.print("������ �̸� �Է�>>>");
		this.id = scanner.next();
		System.out.print("����ó �Է�>>>");
		this.phoneNum = scanner.next();
		this.setPhoneNumMap();
		System.out.println(this.id+"�� ����Ǿ����ϴ�.");
	}
	public void reviseNum() {
		System.out.print("������ �̸� �Է�>>>");
		this.id = scanner.next();
		System.out.print("������ ����ó �Է�>>>");
		this.phoneNum = scanner.next();
		phoneNumMap.replace(id, phoneNum);
		System.out.println("�����Ǿ����ϴ�.");
	}
	public void searchNum() {
		System.out.print("ã�� �̸� �Է�>>>");
		this.id = scanner.next();
		System.out.println(id+"�� ����ó�� "+phoneNumMap.get(id)+"�Դϴ�.");
	}
	public void removeNum() {
		System.out.println("���� ����ó �̸� �Է�>>>");
		this.id = scanner.next();
		phoneNumMap.remove(id);
		System.out.println("�����Ǿ����ϴ�.");
	}
	public void viewAll() {
		System.out.println(getPhoneNumMap());
	}
	public void term() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
