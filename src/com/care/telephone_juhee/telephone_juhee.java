package com.care.telephone_juhee;

import java.util.HashMap;
import java.util.Scanner;

public class telephone_juhee {
	private Scanner scanner = new Scanner(System.in);
	private String id, phoneNum; 
	private int num, select; 
	HashMap<String, String> phoneNumMap = new HashMap<String, String>();
//전화 기능
/*
연락처 저장
연락처 수정
연락처 찾기
연락처 삭제
연락처 모두 보기
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
	//메소드
	public void saveNum() {
		System.out.print("저장할 이름 입력>>>");
		this.id = scanner.next();
		System.out.print("연락처 입력>>>");
		this.phoneNum = scanner.next();
		this.setPhoneNumMap();
		System.out.println(this.id+"가 저장되었습니다.");
	}
	public void reviseNum() {
		System.out.print("변경할 이름 입력>>>");
		this.id = scanner.next();
		System.out.print("수정할 연락처 입력>>>");
		this.phoneNum = scanner.next();
		phoneNumMap.replace(id, phoneNum);
		System.out.println("수정되었습니다.");
	}
	public void searchNum() {
		System.out.print("찾을 이름 입력>>>");
		this.id = scanner.next();
		System.out.println(id+"의 연락처는 "+phoneNumMap.get(id)+"입니다.");
	}
	public void removeNum() {
		System.out.println("지울 연락처 이름 입력>>>");
		this.id = scanner.next();
		phoneNumMap.remove(id);
		System.out.println("삭제되었습니다.");
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
