package day15;

import java.util.Scanner;

public class Ex13_Exception_Test1 {

	public static void main(String[] args) {
		/* 5개짜리 정수 배열을 생성한 후, 정수를 입력받아
		 *  입력받은 정수를 출력하는 코드를 작성하세요. 단 중간에 잘못된 값을 입력하면 다시 입력받도록 코드를 작성하세요 */
		// 예외처리는 언제 해야할까? : 정수를 입력하지 않는경우.

		Scanner scan = new Scanner(System.in);
		int max = 5;
		int arr[] = new int[max];
		int count = 0;

		while (count < 5) {
			try {
				System.out.println(count+1 + "번째 정수 입력 : ");
				arr[count] = scan.nextInt();
				count++;
			} catch (Exception e) {
				System.out.println("입력된 값이 정수가 아닙니다. 다시 정수를 입력하세요.");
				/* 문자 또는 문자열을 입력하고 엔터를 친 경우 입력 버퍼에 해당 값들이 여전히 남아있어서
				 * scan.next();로 처리를 하지 않으면 무한루프에 빠지게 된다.
				 * 남아있는 값들을 제거해서 무한루프에 빠지지 않게 하기 위해, 
				 * scan.next()로 제거해준다. (return이나 break는 안먹힘...)
				 */
				scan.next(); //이걸 넣어서 삽입된 다른 문자나, 정수가 아닌 값들을 버려줘야 한다...라고 하네요..
			}
		}
		for (int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println("프로그램 종료");
		scan.close();

	}
}
