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
				"1.����ó ����\r\n"
				+ "2.����ó ã��\r\n"
				+ "3.����ó ����\r\n"
				+ "4.����ó ����\r\n"
				+ "5.����ó ��� ����\r\n"
				+ "6.�����ϱ�\n>>>");
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
				System.out.println("�����մϴ�.");
				a=false;
				break;
			}
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}
}
