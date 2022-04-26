package day2;

public class Ex17_Test5 {

	public static void main(String[] args) {
		/*
		 * num이 2의 배수이면 2의 배수라고 출력하고, num이 3의 배수이면 3의 배수라고 출력하고, num이 6의 배수이면 6의 배수라고
		 * 출력하고, num이 2,3,6의 배수가 아니면 2,3,6의 배수가 아니라고 출력한다. 단, num이 6이면 6의 배수라고 출력해야 한다.
		 */

		int num = 9;

		if (num % 6 == 0) {
			System.out.println(num + "은 6의 배수입니다.");
		} else if (num % 2 == 0) {
			System.out.println(num + "은 2의 배수입니다.");
		} else if (num % 3 == 0) {
			System.out.println(num + "은 3의 배수입니다.");
		} else {
			System.out.println("2,3,6의 배수가 아닙니다.");
		}
	}

}
