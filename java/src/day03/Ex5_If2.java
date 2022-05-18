package day03;

public class Ex5_If2 {

	public static void main(String[] args) {
		/*
		 * num이 6의 배수인지 아닌지 판별하는 코드를 중첩 if문으로 작성하세요.
		 */
		// num이 6의 배수이다 -> num을 6으로 나누었을 때 나머지가 0과 같다., num % 6 == 0

		int num = 12;

		if (num % 6 == 0) {
			System.out.println(num + "는 6의 배수");
		} else {
			System.out.println(num + "는 6의 배수 아님.");
		}
	}
}
