package day22;

public class Ex01_RecursiveMethod {

	public static void main(String[] args) {
		try {
			System.out.println(factorial1(4));
			System.out.println(factorial2(4));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/* 팩토리얼 메소드를 반복문으로 구현 */
	public static int factorial1(int n) {
		if (n < 0) {
			throw new RuntimeException("음수 팩토리얼은 구할 수 없습니다."); // 음수면 계산을 하지 않기위해, 예외처리한다.
		}
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;

		}
		return result;
	}

	public static int factorial2(int n) {
		if (n < 0) {
			throw new RuntimeException("음수 팩토리얼은 구할 수 없습니다."); // 음수면 계산을 하지 않기위해, 예외처리한다.
		}
		if (n == 1 || n == 0) { // 수학적으로 0! = 1 //이 조건을 붙여줘야 한다.
			return 1; //조건 없으면 stackoverflow 에러, 종료조건이 있어야 한다.
		}
		return n * factorial2(n - 1);
	}
	/* 팩토리얼 메소드를 재귀메소드로 구현 */

}
