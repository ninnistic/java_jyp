package day7;

import java.util.Scanner;

public class Ex5_Array5_Baseball {

	public static void main(String[] args) {
		/*
		 * 정수 3개짜리 배열 com을 생성한 후 랜덤으로 새 정수를 만들어 배열에 저장하는 코드를 작성하세요 (중복가능) /* 사용자가 정수 3개를
		 * 입력하여 3S가 될때까지 게임을 진행하도록 코드를 작성하세요. 단 사용자가 입력한 정수도 배열에 저장.
		 */

		// 배열에는 랜덤한 세 수의 값이 저장되어있다.
		// user값은 사용자가 입력하는 정수 세개로 치환이 가능하다.
		// 사용자가 입력한 정수도 배열에 저장해야 한다...

		int min = 1, max = 9;
		int com[] = new int[3];
		int user[] = new int[3];

		for (int i = 0; i < 3; i++) {
			com[i] = (int) (Math.random() * (max - min + 1) + min);

			System.out.println(com[i] + " ");
		}

		Scanner scan = new Scanner(System.in);

		int s = 0;
		int b = 0;

		while (true) {
			System.out.println("1에서 9사이의 정수를 3개 입력하세요.");
			System.out.print(" 숫자1 : ");
			user[0] = scan.nextInt();
			System.out.print(" 숫자2 : ");
			user[1] = scan.nextInt();
			System.out.print(" 숫자3 : ");
			user[2] = scan.nextInt();

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (com[i] == user[j]) {
						if (i == j) {
							s++;
						} else {
							b++;
						}
					}

				}

			}
			System.out.println(s + "S" + " " + b + "B");
			if (s == 3) {
				break;
			}
		

		}
	}
}