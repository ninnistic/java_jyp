package day5;

import java.util.Scanner;

public class Ex11_BaseballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 숫자 야구 게임을 작성하세요. 중복되지 않은 1~9사이의 세 정수를 입력받아 맞추는 게임 (3,8,9) 입력했을때 1,2,3 1B 입력
		 * 456 OUT 입력789 2S 입력 839 1S 2B
		 */
		int com1 = 3, com2 = 8, com3 = 9;
		int user1, user2, user3;
		int s = 0, b = 0;

		Scanner scan = new Scanner(System.in);

		// 숫자만 맞으면 ball이고 자리까지 맞으면 strike이고 다 틀리면 out
		System.out.println("숫자를 입력하세요.");

		while (s < 3) {
			user1 = scan.nextInt();
			user2 = scan.nextInt();
			user3 = scan.nextInt();

			if (com1 == user1) {
				s++;
			} else if (com1 == user2) {
				b++;
			} else if (com1 == user3) {
				b++;
			}

			if (com2 == user2) {
				s++;
			} else if (com2 == user1) {
				b++;
			} else if (com2 == user3) {
				b++;
			}

			if (com3 == user3) {
				s++;
			} else if (com3 == user2) {
				b++;
			} else if (com3 == user1) {
				b++;
			}

			if (s == 0 && b == 0) {
				System.out.println("아웃!");
			} else if (s == 0 && b == 1) {
				System.out.println("0S 1B");
			} else if (s == 0 && b == 2) {
				System.out.println("0S 2B");
			} else if (s == 0 && b == 3) {
				System.out.println("0S 3B");
			} else if (s == 1 && b == 0) {
				System.out.println("1S");
			} else if (s == 1 && b == 1) {
				System.out.println("1S 1B");
			} else if (s == 1 && b == 2) {
				System.out.println("1S 2B");
			} else if (s == 2 && b == 0) {
				System.out.println("2S");
			} else if (s == 2 && b == 1) {
				System.out.println("2S 1B");
			} else {
				System.out.println("정답입니다.");

			}
		}
	}
}
