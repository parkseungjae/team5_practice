package com.care.telephone_juhee;

import java.util.Scanner;

public class telephone_main_juhee {

	public void telMain() {
		Scanner scanner = new Scanner(System.in);
		telephone_juhee tel = new telephone_juhee();
		int select;
		boolean a=true;
		while(a){
			System.out.println(
				"1.연락처 저장\r\n"
				+ "2.연락처 찾기\r\n"
				+ "3.연락처 수정\r\n"
				+ "4.연락처 삭제\r\n"
				+ "5.연락처 모두 보기\r\n"
				+ "6.종료하기\n>>>");
			select = scanner.nextInt();
			tel.setSelect(select);
			
			switch (select){
			case 1: {
				tel.saveNum();
				tel.term();
				break;
			}case 2: {
				tel.searchNum();
				tel.term();
				break;
			}case 3: {
				tel.reviseNum();
				tel.term();
				break;
			}case 4: {
				tel.removeNum();
				tel.term();
				break;
			}case 5: {
				tel.viewAll();
				tel.term();
				break;
			}case 6: {
				System.out.println("종료합니다.");
				a=false;
				break;
			}
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}
