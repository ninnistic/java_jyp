package day03;

import java.util.Scanner;

public class Ex3_Scanner3 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 출력하는 코드를 작성하세요.
		 * 산술연선자는 문자로 받아주세요.
		 * 
		 * 방법1
		 * 정수 1을 입력 하세요 : 1
		 * 정수 2를 입력하세요 : 2
		 * 산술 연산자를 입력하세요 : +
		 * 1+2
		 * 
		 * 방법2
		 * 두 정수와 산술 연산자를 입력하세요(예: 1 + 2) : 1 + 2
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1을 입력하세요.");
		int num1 = scan.nextInt();
		System.out.print("숫자2를 입력하세요.");
		int num2 = scan.nextInt();
		System.out.print("연산자를 입력하세요.");
		char ch = scan.next().charAt(0);
		// num1 = 정수 ch도(문자는 큰 범주에서 정수로 간주된다) 
		// + 는 유니코드표에서 십진수 43에 해당된다.
		// 문자열 + 정수 = 문자열이 된다. 그래서 빈 문자열을 넣어주면 +는 왼쪽에 있는게 우선시된다. 그래서 "" 이 우선순위를 먹게됨.
		System.out.println(""+num1 + ch + num2); //여기서 이렇게 하면 그냥 더하는 결과가 나오고, 산술식이 안나온다... ㅠ 
		
		System.out.println("두 정수와 산술연산자를 입력하세요(예: 1 + 2) : ");
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		char ch1 = scan.next().charAt(0);
		System.out.println(""+num3 + ch1 + num4);
		scan.close();
		// 콘솔에 숫자 넣을때 공백 넣는거 잊지마셈. 순서 유의하세요~~ 순서대로 받아먹나봄... 
	}

}
