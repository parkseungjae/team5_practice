package com.care.airconditioner_jeonwujin;

import java.util.Scanner;

public class AirConditioner {
	private int temp = 25, hum = 50, wind = 2;

	public void tempUp() {
		if(temp >= 18 && temp < 30)
			temp = temp + 1;
		tempPrint();
	}
	public void tempDown() {
		if(temp > 18 && temp <= 30)
			temp = temp - 1;
		tempPrint();
	}
	public void humUp() {
		if(hum >= 30 && hum < 70)
			hum = hum + 5;
		humPrint();
	}
	public void humDown() {
		if(hum > 30 && hum <= 70)
			hum = hum - 5;
		humPrint();
	}
	public void windUp() {
		if(wind >= 1 && wind < 5)
			this.wind = wind + 1;
		windPrint();
	}
	public void windDown() {
		if(wind > 1 && wind <= 5)
			wind = wind - 1;
		windPrint();
	}
	public void tempPrint() {
		System.out.println("현재 목표 온도 : " + getTemp() + "℃");
	}
	public void humPrint() {
		System.out.println("현재 목표 습도 : " + getHum() + "%");
	}
	public void windPrint() {
		System.out.println("현재 목표 바람세기 : " + getWind() + "단계");
	}
	public void funcPrint(int inputFuncNum) {
		String arr[][] = {{"1. 온도 UP", "2. 온도 DOWN"},
				{"1. 습도 UP", "2. 습도 DOWN"},
				{"1. 바람세기 UP", "2. 바람세기 DOWN"}};
		forPrint(arr, inputFuncNum);
		System.out.println("3. 조작 종료");
		System.out.print(">>> ");
	}
	public void forPrint(String arr[][], int inputFuncNum) {
		for(int i = 0; i < 2; i++) {
			System.out.println(arr[inputFuncNum-1][i]);
		}
	}

	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getHum() {
		return hum;
	}
	public void setHum(int hum) {
		this.hum = hum;
	}
	public int getWind() {
		return wind;
	}
	public void setWind(int wind) {
		this.wind = wind;
	}

	public void airConditionerFunc() {
		Scanner sc = new Scanner(System.in);
		String power;
		int inputFuncNum = 0, inputTempNum = 0, inputHumNum = 0,
				inputWindNum = 0;

		while(true) {
			System.out.print("에어컨 on?(y/n): ");
			power = sc.next();
			System.out.println();
			if(power.equals("y")) {
				while(inputFuncNum != 4) {
					System.out.println("1. 냉방");
					System.out.println("2. 제습");
					System.out.println("3. 송풍");
					System.out.println("4. 전원 off");
					System.out.print(">>> ");
					inputFuncNum = sc.nextInt();
					System.out.println();

					switch(inputFuncNum) {
					case 1 :
						System.out.println("=== 냉방 ===");
						tempPrint();
						while(inputTempNum != 3) {
							funcPrint(inputFuncNum);
							inputTempNum = sc.nextInt();
							System.out.println();

							switch(inputTempNum) {
							case 1 :
								tempUp();
								break;
							case 2 :
								tempDown();
								break;
							case 3 :
								System.out.println("온도 조작 종료\n");
								break;
							default : 
								System.out.println("다시 입력하세요.");
							}
						}
						break;
					case 2 :
						System.out.println("=== 제습 ===");
						humPrint();
						while(inputHumNum != 3) {
							funcPrint(inputFuncNum);
							inputHumNum = sc.nextInt();
							System.out.println();

							switch(inputHumNum) {
							case 1 :
								humUp();
								break;
							case 2 :
								humDown();
								break;
							case 3 :
								System.out.println("습도 조작 종료\n");
								break;
							default : 
								System.out.println("다시 입력하세요.");
							}
						}
						break;
					case 3 :
						System.out.println("=== 송풍 ===");
						windPrint();
						while(inputWindNum != 3) {
							funcPrint(inputFuncNum);
							inputWindNum = sc.nextInt();
							System.out.println();

							switch(inputWindNum) {
							case 1 :
								windUp();
								break;
							case 2 :
								windDown();
								break;
							case 3 :
								System.out.println("송풍 조작 종료\n");
								break;
							default : 
								System.out.println("다시 입력하세요.");
							}
						}
						break;
					case 4 :
						System.out.println("에어컨 전원 off\n");
						break;
					default :
						System.out.println("다시 입력하세요.\n");
					}
				}
				break;
			}else if(power.equals("n")) {
				System.out.println("에어컨 전원을 키지않겠습니다.\n");
				break;
			}else {
				System.out.println("다시 입력하세요.\n");
			}
		}
	}
}
