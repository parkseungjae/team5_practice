package team5_practice;
import java.util.Scanner;

import com.care.airconditioner_jeonwujin.AirConditioner;
import com.care.bath_parkseungjae.Bath;
import com.care.radio_ohsungtaek.RadioFunc;
import com.care.telephone_juhee.telephone_main_juhee;

public class MainClass {

	public static void main(String[] args) {
		AirConditioner ac = new AirConditioner();
		telephone_main_juhee tel = new telephone_main_juhee();
		Bath b = new Bath();
		RadioFunc rf = new RadioFunc();
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;

		while(inputNum != 5) {
			System.out.println("==== ������ǰ ====");
			System.out.println("1. ������");
			System.out.println("2. ��ȭ��");
			System.out.println("3. ����");
			System.out.println("4. ����");
			System.out.println("5. ���α׷� ����");
			System.out.print(">>> ");
			inputNum = sc.nextInt();
			System.out.println();

			switch(inputNum) {
			case 1 :
				System.out.println("=== ������ ��� ===");
				ac.airConditionerFunc();
				break;
			case 2 :
				System.out.println("=== ��ȭ�� ��� ===");
				tel.telMain();
				break;
			case 3 :
				System.out.println("=== ���� ��� ===");
				rf.radioFunc();
				break;
			case 4 :
				System.out.println("=== ���� ��� ===");
				b.bath();
				break;
			case 5 :
				System.out.println("=== ���α׷� ���� ===");
				break;
			default :
				System.out.println("�ٽ� �Է��ϼ���\n");
			}
		}
	}
}