package day05;

public class Ex8_NestedLoop3_Prime {

	public static void main(String[] args) {
		/* 1부터 100사이의 모든 소수를 출력하는 코드를 작성하세요. */
		// 소수인지를 판별한다.

		for (int num = 1; num <= 100; num++) {

			int count = 0;
			// i부터 num사이의 num의 약수 개수
			for (int i = 1; i <= num; i++) {
				// i가 num의 약수이다 -> num을 i로 나누었을때 나머지가 0과 같다.
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(num + " ");
			}
		}

	}
}
