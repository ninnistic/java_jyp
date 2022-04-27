package day3;

public class Ex12_For3_Even {

	public static void main(String[] args) {
		/* 1부터 10사이의 짝수를 출력하는 코드를 작성하세요 */

		// <방법1> i는 1부터 5까지 1씩 증가 / 2*i를 출력
		
		for(int i = 1; i<=5; i++) {
			System.out.println(2*i);
		}
		
		// <방법2> i는 1부터 10까지 증가, i가 짝수이면 i를 출력
		for(int i = 1; i<=10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		
		
		// <방법 3> i는 2부터 10까지 2씩 증가. i출력 내 코드.
		for (int i=2; i<=10; i += 2) {
			System.out.println(i);
		}
		
		
		
		// <내 코드>
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}

	}

}
