package com.care.radio_ohsungtaek;

import java.util.Scanner;

public class radioFunc {
	public static void main(String[] args) {
		radio rd = new radio();
		Scanner input = new Scanner(System.in);
		
		String power;
		int channel=0,volume=0;
		int n1=0,n1A=0,n1B=0,n1C=0,n1D,n1E;
		int n2=0,n2A=0,n2B=0,n2C=0,n2D,n2E;
		int n3=0,n30,n3B=0,n3C=0,n3D,n3E;
		
		while(true) {//�������
			System.out.println("���� ������ Ű�ðڽ��ϱ� (y/n)");
			power=input.next();
		if(power.equals("y")) {//������ ų ���
			System.out.println("������ �������ϴ�");
	        System.out.println("1. ä�� ���� ");
	        System.out.println("2. ���� ���� ");
	        System.out.println("3. ���� ����");
	        System.out.println("<<< ");
	        n1=input.nextInt();
	        switch(n1) {
	        case 1 ://ä�� ���� ���
	        	while(n1A!=3) {
	        	System.out.println("�Է��ϼ��� : ");
	        	System.out.println("1. ä�� +1");
	        	System.out.println("2. ä�� -1");
	        	System.out.println("3. �����ϱ�");
	        	System.out.println();
	        	n1A = input.nextInt();
	        	switch(n1A) {
	        	case 1 :
	        		rd.channelUp();
	        		rd.channelPrint();
	        		break;
	        	case 2 :
	        		rd.channelDown();
	        		rd.channelPrint();
	        		break;
	        	case 3 :
	        		System.out.println("������ ����˴ϴ�");
	        		break;
	        	}
	        	}break;
	        	case 2 ://���� ���� ���
		        	while(n2A!=3) {
		        		System.out.println("�Է��ϼ��� : ");
			        	System.out.println("1. ���� +1");
			        	System.out.println("2. ���� -1");
			        	System.out.println("3. �����ϱ�");
			        	n2A = input.nextInt();
			        	switch(n2A) {
			        	case 1 :
			        		rd.volumeUp();
			        		rd.volumePrint();
			        		break;
			        	case 2 :
			        		rd.volumeDown();
			        		rd.volumePrint();
			        		break;
			        	case 3 :
			        		System.out.println("�����ϱ�");
			        		break;
			        	}		
	        	}break;
	        	case 3:
	        		System.out.println("������ ����˴ϴ�");
	        		break;
	        	}break;
	        }else if(power.equals("n") ) {//������ �� ���
			System.out.println("������ �����մϴ�");
			break;
	        }
		}
			
		} 

		
		
		
		
		
	}

