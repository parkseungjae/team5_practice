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
		System.out.println("���� ��ǥ �µ� : " + getTemp() + "��");
	}
	public void humPrint() {
		System.out.println("���� ��ǥ ���� : " + getHum() + "%");
	}
	public void windPrint() {
		System.out.println("���� ��ǥ �ٶ����� : " + getWind() + "�ܰ�");
	}
	public void funcPrint(int inputFuncNum) {
		String arr[][] = {{"1. �µ� UP", "2. �µ� DOWN"},
				{"1. ���� UP", "2. ���� DOWN"},
				{"1. �ٶ����� UP", "2. �ٶ����� DOWN"}};
		forPrint(arr, inputFuncNum);
		System.out.println("3. ���� ����");
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
			System.out.print("������ on?(y/n): ");
			power = sc.next();
			System.out.println();
			if(power.equals("y")) {
				while(inputFuncNum != 4) {
					System.out.println("1. �ù�");
					System.out.println("2. ����");
					System.out.println("3. ��ǳ");
					System.out.println("4. ���� off");
					System.out.print(">>> ");
					inputFuncNum = sc.nextInt();
					System.out.println();

					switch(inputFuncNum) {
					case 1 :
						System.out.println("=== �ù� ===");
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
								System.out.println("�µ� ���� ����\n");
								break;
							default : 
								System.out.println("�ٽ� �Է��ϼ���.");
							}
						}
						break;
					case 2 :
						System.out.println("=== ���� ===");
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
								System.out.println("���� ���� ����\n");
								break;
							default : 
								System.out.println("�ٽ� �Է��ϼ���.");
							}
						}
						break;
					case 3 :
						System.out.println("=== ��ǳ ===");
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
								System.out.println("��ǳ ���� ����\n");
								break;
							default : 
								System.out.println("�ٽ� �Է��ϼ���.");
							}
						}
						break;
					case 4 :
						System.out.println("������ ���� off\n");
						break;
					default :
						System.out.println("�ٽ� �Է��ϼ���.\n");
					}
				}
				break;
			}else if(power.equals("n")) {
				System.out.println("������ ������ Ű���ʰڽ��ϴ�.\n");
				break;
			}else {
				System.out.println("�ٽ� �Է��ϼ���.\n");
			}
		}
	}
}
