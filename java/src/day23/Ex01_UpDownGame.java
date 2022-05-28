package day23;

import java.util.*;

public class Ex01_UpDownGame {

	public static void main(String[] args) {
		// 1~100 사이의 랜덤한 수를 맞추는 UP DOWN 게임 프로그램 작성하세요.
		/* 기록을 저장하는 기능 추가
		 * 기록은 최대 5등까지
		 * 5등이내의 기록은 이름을 기록하여 저장
		 * 
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료 
		 */
		List<UpDown> list = new ArrayList<UpDown>();
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		boolean end = false;
		int menu = -1;
		int max = 10, min = 1; // 나중에 100으로 수정. 
		int user;
		int count = 0;

		// Main menu 출력
		int r = random.nextInt(max) + min;
		System.out.println("Random number : " + r);

		while (true) {
			printMainMenu();
			menu = scan.nextInt();

			// 잘못된 메뉴 입력시 예외처리 
			// 인데 작동안함.. 나중에 수정*****
			try {
				if (menu != 1 && menu != 2 && menu != 3) {
					menu = Integer.parseInt(scan.nextLine());
					System.out.println("Error! You should choice a number between 1 to 3");
					continue;
				}
			} catch (Exception e) {
				System.out.println("Warning! Insert only number type");
				continue;

			}

			System.out.println(" >> 1. Game Start!");

			if (menu == 1) {
				while (true) {
					System.out.print(" Insert ONE random number between 1 ~ 100 : ");
					user = scan.nextInt();
					count++;
					if (user > r) {
						System.out.println("Down");

					} else if (user < r) {
						System.out.println("Up");

					} else if (user == r) {

						System.out.println("---Victory! Result : " + count + " trials");
						end = true;
						System.out.print(">> Write your name : ");
						String name = scan.next();
						saveRecord(name, count, list);

						break;

					}

				}
			} else if (menu == 2) {
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}

			} else if (menu == 3) {
				break;
			}

		}
	}

	// 메인 Menu Print
	public static void printMainMenu() {
		System.out.println(" [  UpDown Game  ] ");
		System.out.println("1. Game Start \n2. Game Scores \n3. Exit ");
		System.out.print(">> : ");
	}

	private static void saveRecord(String name, int count, List<UpDown> list) {
		// count를 받아 이름과 같이 저장?

		list.add(new UpDown(name, count));
		// 정렬
		list.sort(new Comparator<UpDown>() {
			@Override
			public int compare(UpDown u1, UpDown u2) {
				if (u1.getCount() != u2.getCount()) {
					return u1.getCount() - u2.getCount();
				}
				return 0;
			}
		});
		System.out.println("The result is succesfully saved, check out the result at No.2");
		System.out.println("---------------------");
		if (list.size() > 5) {
			list.remove(5);
		}
	}

}
