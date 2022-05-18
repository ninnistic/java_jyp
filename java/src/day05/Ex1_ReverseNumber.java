package day05;

import java.util.Scanner;

public class Ex1_ReverseNumber {

	public static void main(String[] args) {
		/*
		 * 양의 정수를 입력받아 입력받은 정수를 역으로 출력하는 코드를 작성하세요. 1234면 4321이 출력되도록. 1230 => 0을 출력을
		 * 하고, 1230 => 123, 123에서 => 3을 추출해서 출력, 123을 12로 만든다 12에서 2를 출력 12 -> 1 1에서 1을
		 * 출력 -> 0
		 * 
		 * 945 -> 5, 945 - 94 94 -> 4 , 94 -> 9 9 -> 9, 9 -> 0
		 * 
		 * 반복횟수 : num이 0이 아닐 때 까지 규칙성 : num의 1의 자리를 출력한 후, num을 10으로 나눈 몫을 num에 저장한다.
		 */

		Scanner scan = new Scanner(System.in);

		int num = 0354;
	
		while (num <= 0) {

			num = scan.nextInt();
		}

		while (num > 0) {
			System.out.print(num % 10);
			num = num / 10;
		}

		scan.close();

	
	
	//선생님 코드
		/* Scanner scan = new Scanner(System.in);
		 * int num = scan.next();
		 * 
		 * while(num ! = 0) {
		 * System.out.print(num%10);
		 * reverseNum = 10* reversenNum + num % 10; (4300 을 0034로 출려가는 방법..(0ㅇ이 앞으로 올떄))
		 * num = num / 10;
		 *
		 *근데 이거는 0432 일 경우에 0을 저장을 못한다.
		 */
		
		
	
	
	}

}
