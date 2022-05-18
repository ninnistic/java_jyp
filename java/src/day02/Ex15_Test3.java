package day02;

public class Ex15_Test3 {

	public static void main(String[] args) {
		/*
		 * Q. month가 주어졌을 때, 해당 달의 마지막 일을 출력하는 코드를 if문으로 작성하세요. 31 : 1 3 5 7 8 10 12 30
		 * : 4 6 9 11 28 : 2 그 외의 달은 잘못된 월입니다 라고 출력.
		 */

		int month = 13;
		int lastDay = 28;

		if (month == 2) {
			System.out.println("마지막 일은 " + lastDay + "일 입니다.");
		} else if (month % 2 == 1 && month < 9 || month == 8 || month == 10 || month == 12) {
			System.out.println("마지막 일은 " + (lastDay + 3) + "일 입니다.");
		} else if (month % 2 == 0 && month < 14 || month == 9 || month == 11) {
			System.out.println("마지막 일은 " + (lastDay + 2) + "일 입니다.");
		} else {
			System.out.println("잘못된 달 입니다.");
		}

		// 선생님 코드

	}
}
