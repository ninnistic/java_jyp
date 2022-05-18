package day05;

import java.util.Scanner;

public class Ex4_DoWhile_Menu {

	public static void main(String[] args) {
		/* 메뉴 출력 에제를 do while문으로 작성하세요. */

		int menu;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("메뉴.");
			System.out.println("1. 학생정보 입력");
			System.out.println(" 2. 학생정보 출력");
			System.out.println(" 3. 학생정보 수정");
			System.out.println(" 4. 학생정보 삭제");
			System.out.println(" 5. 프로그램 종료");
			System.out.println("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
		} while (menu != 5);
		scan.close();

	}

}
