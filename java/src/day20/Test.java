package day20;

import java.util.Scanner;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);
		int exitMenu = 4;
		int menu;
		String fileName;

		do {
			printMenu();
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.print("파일명 : ");
				fileName = scan.next();
				list.add(fileName);
				System.out.println("파일이 저장 되었습니다.");
				break;
			case 2:
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i) + " ");
				}
				System.out.println();

				break;
			case 3:
				System.out.print("검색어 : ");
				String keyword = scan.next();
				for (int i = 0; i < list.size(); i++) {
					int index = list.get(i).indexOf(keyword);
					if (index > -1) {
						System.out.println(list.get(i));
					}
				}

				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력 되었습니다.");
			}
		} while (menu != exitMenu);
	}

	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 파일 저장");
		System.out.println("2. 파일 확인");
		System.out.println("3. 파일 검색");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴를 선택하세요 : ");
	}

}
