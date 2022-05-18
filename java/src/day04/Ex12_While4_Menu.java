package day04;

import java.util.Scanner;

public class Ex12_While4_Menu {

	public static void main(String[] args) {
		/*
		 * 다음과 같은 메뉴가 출력되고 종료메뉴를 입력할 때 까지 반복하는 코드를 while문으로 작성하세요.
		 * 
		 * 
		 * 메뉴 1. 학생정보입력 2. 학생정보 출력 3. 학생정보 수정 4. 학생정보 삭제 5. 프로그램 종료 메뉴를 선택하세요 :
		 */
		Scanner scan = new Scanner(System.in);

		int menu = -1;

		while (menu != 5) {
			System.out.println("메뉴.");
			System.out.println("1. 학생정보 입력");
			System.out.println(" 2. 학생정보 출력");
			System.out.println(" 3. 학생정보 수정");
			System.out.println(" 4. 학생정보 삭제");
			System.out.println(" 5. 프로그램 종료");
			System.out.println("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
		}

		System.out.println("방법 1 종료.");

		while (true) {
			System.out.println("메뉴.");
			System.out.println("1. 학생정보 입력");
			System.out.println(" 2. 학생정보 출력");
			System.out.println(" 3. 학생정보 수정");
			System.out.println(" 4. 학생정보 삭제");
			System.out.println(" 5. 프로그램 종료");
			System.out.println("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
			if (menu == 5) {
				break;
			}
		}
		scan.close();

	}

}
