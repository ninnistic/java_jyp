package day03;

import java.util.Scanner;

public class Ex4_If1 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수와 산술연산자를 입력하세요(예: 1 + 2) : ");
		
		int num1 = scan.nextInt();
		char op = scan.next().charAt(0);
		int num2 = scan.nextInt();
		System.out.println(""+num1 + op + num2);
		
		if (op == '+') {
			System.out.println(num1 + num2);
		} else if (op == '-') {
			System.out.println(num1 - num2);
		} else if (op == '*') {
			System.out.println(num1 * num2);
		} else if (op == '%') {
			System.out.println(num1 % num2);
		} else if (op == '/') {
			System.out.println(num1 / (double)num2);
		} else {
			System.out.println(op+"는 유효한 산술 연산자가 아닙니다.");		
		}
		
		scan.close();
		
		
	
	
	
	
	}
}
