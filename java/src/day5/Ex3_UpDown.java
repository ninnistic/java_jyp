package day5;

import java.util.Scanner;

public class Ex3_UpDown {

	public static void main(String[] args) {
		/*
		 * 랜덤으로 생성한 수(1~100)를 맞추는 게임을 작성하세요. 정수를 입력했을때 입력한 정수보다 랜덤으로 생성한 수가 크면 up 작으면
		 * down 표시 맞으면 맞췄습니다라고 표시 랜덤으로 생성한 수 40 입력 100 down 입력 50 down 입력 25 up 입력 40
		 * 정답입니다.
		 */

		int min = 1, max = 100;
		int r = (int) (Math.random() * (max - min + 1) + min);

		Scanner scan = new Scanner(System.in);
		System.out.print("게임을 시작하겠습니다. 숫자를 입력하세요. :  ");

		while (true) {
			
			int i = scan.nextInt();
			
			if (r > i) {
				System.out.println("UP");

			} else if (r < i) {
				System.out.println("DOWN");

			} else if (r == i) {
				System.out.println("정답입니다.");
				break;
			}

		}
	}

}
