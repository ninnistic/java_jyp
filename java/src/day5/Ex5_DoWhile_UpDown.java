package day5;

import java.util.Scanner;

public class Ex5_DoWhile_UpDown {

	public static void main(String[] args) {

		int min = 1, max = 100;
		int r = (int) (Math.random() * (max - min + 1) + min);

		Scanner scan = new Scanner(System.in);
		System.out.println("랜덤으로 생성한 수 " + r);
		int num;

		do {
			System.out.print("숫자를 입력하세요 :  ");
			num = scan.nextInt();

			// 1미만 100 초과인 경우 스킵하는 방법
			if (num < 1 || num > 100) {
				continue;

			}
			if (num > r) {
				System.out.println("Down");
			} else if (num < r) {
				System.out.println("Up");
			}

		} while (num != r);
		System.out.println("정답입니다.");
		scan.close();

	}

}
