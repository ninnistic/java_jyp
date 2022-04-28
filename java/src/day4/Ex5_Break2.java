package day4;

import java.util.Scanner;

public class Ex5_Break2 {

	public static void main(String[] args) {
		/*
		 * 양의 정수를 5번 입력하고, 입력한 정수를 콘솔에 출력하는 코드를 작성해보세요. 입력받은 정수가 음수이면 반복문을 빠져나오게 수정해보세요.
		 * 양의 정수를 무한으로 입력하고, 입력한 정수를 콘솔에 출력하는 코드를 작성하세요.
		 */

		/*
		 * 반복횟수 :무한대 규칙성 : Scanner를 이용하여 정수를 입력받아 num에 저장하고, num이 음수이면 반복문을 빠져나가고(출력이 안되고) 아니면
		 * num을 출력 반복문 종료 후 : 없음
		 */

		Scanner scan = new Scanner(System.in);

		int num = 1;
		for (int i = 1; ;i++) {
			System.out.print("정수를 입력하세요: ");
			num = scan.nextInt();

			if (num < 0) {
				break;
			}
			System.out.println(num);
		}
	}
}

// 무한으로 하고싶다면 그냥 조건식을 지우면 됨..