package day7;

import java.util.Scanner;

public class Ex5_Solution {

	public static void main(String[] args) { /*
												 * 정수 3개짜리 배열 com을 생성한 후 랜덤으로 새 정수를 만들어 배열에 저장하는 코드를 작성하세요 (중복가능) /*
												 * 사용자가 정수 3개를 입력하여 3S가 될때까지 게임을 진행하도록 코드를 작성하세요. 단 사용자가 입력한 정수도 배열에 저장.
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

		System.out.println();

		Scanner scan = new Scanner(System.in);

		int s;
		int b;

		s = 0;
		b = 0;
		System.out.print("1에서 9사이의 정수를 중복되지 않게 입력하세요. : ");
		for (int i = 0; i < user.length; i++) {
			user[i] = scan.nextInt();
		}
		// 스트라이크 개수 확인
		for (int i = 0; i < com.length; i++) {
			if (com[i] == user[i]) {
				s++;
			}

		}
		// 볼 개수 확인
		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < user.length; j++) {
				if (i == j) {
					continue;
				}
				if (com[i] == user[j]) {
					b++;
				}
			}
		}

		s = 0;
		b = 0;

		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < user.length; j++) {
				if (com[i] == user[j]) {
					if (i == j) {
						s++;
					} else {
						b++;
					}
				}
			}
		}

		if (s != 0) {
			System.out.print(s + "S");
		}
		if (b != 0) {
			System.out.println(b + "B");
		}
		if (s == 0 && b == 0) {
			System.out.println("OUT");

		}
		System.out.println();

	}

}
