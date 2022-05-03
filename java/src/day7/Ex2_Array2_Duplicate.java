package day7;

import java.util.Scanner;

public class Ex2_Array2_Duplicate {

	public static void main(String[] args) {

		/* 정수 num을 입력받고, 입력받은 정수가 배열에 있는지 없는지 확인하는 코드를 작성하세요. */

		Scanner scan = new Scanner(System.in);
		int num;
		int count = 0;
		int arr[] = { 1, 2, 3 };
		System.out.println("정수를 입력하세요. :  ");
		num = scan.nextInt();

		if (arr[0] == num) {
			count++;
		}
		if (arr[1] == num) {
			count++;
		}
		if (arr[2] == num) {
			count++;
		}
		if (count >= 1) {
			System.out.println("배열 array에는" + num + "가 있습니다.");
		} else {
			System.out.println("배열 array에는" + num + "가 없습니다.");
		}

		System.out.println("------------------------------------------");
		// 반복문 사용, 배열 전체를 탐색 > 있는지를 확인할 수 있다. 어디에 있는지는 모른다.
		count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
			}
		}
		if (count >= 1) {
			System.out.println("배열 array에는" + num + "가 있습니다.");
		} else {
			System.out.println("배열 array에는" + num + "가 없습니다.");
		}

		System.out.println("------------------------------------------");
		// 카운트 안쓰고 하기, 첫번째 중복 숫자가 나오면 확인 중단.
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				break;
		//반복문에서  break를 만나면 i는 3보다 작고, break를 안만나면 i는 3인 특성을 이용. 있으면 i번지에 있음.
			}
		}
		if (i < arr.length) {
			System.out.println("배열 array에는" + num + "가 있습니다.");
		} else {
			System.out.println("배열 array에는" + num + "가 없습니다.");
		}
		// 별도 설명 배열 출력시 주소
		System.out.println(arr); // 주소값.

		scan.close();
	}

}
