package day6;

import java.util.Scanner;

public class Ex8_Array6_Divisor {

	public static void main(String[] args) {
		/*
		 * 정수 num의 약수를 배열에 저장한 후, 출력하는 코드를 작성하세요. 약수는 최대 10개만 저장 가능합니다.
		 */

		int max = 10;

		int num;
		int div = 0;
		int[] arr = new int[max];
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				if (div < max) {
					arr[div] = i;
					System.out.println(arr[div]);
					div++;

				}

			}

		}

	}
}
