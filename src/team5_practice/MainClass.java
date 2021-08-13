package team5_practice;
import java.util.Scanner;

import com.care.airconditioner_jeonwujin.AirConditioner;

public class MainClass {

	public static void main(String[] args) {
		AirConditioner ac = new AirConditioner();
		// 각자 객체 생성 위치 2
		// 각자 객체 생성 위치 3
		// 각자 객체 생성 위치 4
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;

		while(inputNum != 5) {
			System.out.println("==== 가전제품 ====");
			System.out.println("1. 에어컨");
			System.out.println("2. 전화기");
			System.out.println("3. 라디오");
			System.out.println("4. 욕조");
			System.out.println("5. 프로그램 종료");
			System.out.print(">>> ");
			inputNum = sc.nextInt();
			System.out.println();

			switch(inputNum) {
			case 1 :
				System.out.println("=== 에어컨 기능 ===");
				ac.airConditionerFunc();
				break;
			case 2 :
				System.out.println("=== 전화기 기능 ===");
				// 전화기 메소드 위치
				break;
			case 3 :
				System.out.println("=== 라디오 기능 ===");
				// 라디오 메소드 위치
				break;
			case 4 :
				System.out.println("=== 욕조 기능 ===");
				// 욕조 메소드 위치
				break;
			case 5 :
				System.out.println("=== 프로그램 종료 ===");
				break;
			default :
				System.out.println("다시 입력하세요\n");
			}
		}
	}
}