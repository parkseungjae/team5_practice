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
		
		while(true) {//전원기능
			System.out.println("라디오 전원을 키시겠습니까 (y/n)");
			power=input.next();
		if(power.equals("y")) {//전원을 킬 경우
			System.out.println("전원이 켜졌습니다");
	        System.out.println("1. 채널 변경 ");
	        System.out.println("2. 볼륨 변경 ");
	        System.out.println("3. 전원 끄기");
	        System.out.println("<<< ");
	        n1=input.nextInt();
	        switch(n1) {
	        case 1 ://채널 변경 기능
	        	while(n1A!=3) {
	        	System.out.println("입력하세요 : ");
	        	System.out.println("1. 채널 +1");
	        	System.out.println("2. 채널 -1");
	        	System.out.println("3. 종료하기");
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
	        		System.out.println("라디오가 종료됩니다");
	        		break;
	        	}
	        	}break;
	        	case 2 ://볼륨 변경 기능
		        	while(n2A!=3) {
		        		System.out.println("입력하세요 : ");
			        	System.out.println("1. 볼륨 +1");
			        	System.out.println("2. 볼륨 -1");
			        	System.out.println("3. 종료하기");
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
			        		System.out.println("종료하기");
			        		break;
			        	}		
	        	}break;
	        	case 3:
	        		System.out.println("전원이 종료됩니다");
	        		break;
	        	}break;
	        }else if(power.equals("n") ) {//전원을 끌 경우
			System.out.println("전원을 종료합니다");
			break;
	        }
		}
			
		} 

		
		
		
		
		
	}

