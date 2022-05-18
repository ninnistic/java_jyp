package day03;

import java.util.Scanner;

public class Ex9_Switch3 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 switch 문으로 작성하세요.
		 * 산술 연산자가 아닌경우 ??은 산술 연산자가 아닙니다로 출력한다.
		 */

		
		int num1 = 1;
		int num2 = 2;		
		char op = '+';
		
		switch(op) {
		case'+': 
			System.out.println(num1+num2);
		break;
		case'-': 
			System.out.println(num1-num2);
		break;
		case'*': 
			System.out.println(num1*num2);
		break;
		case'%': 
			System.out.println(num1%num2);
		break;
		case'/': 
			System.out.println(num1/(double)num2);
		break;
		default:
			System.out.println("산술 연산자가 아닙니다.");
		}
		
		
		// 선생님 코드
		/*
		 * Scanner scan = new Scanner(System.in);
		System.out.print(두 정수와 산술 연산자를 입력하세요 (예 : 1 / 2) : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		char op = scan.next().charAt(0);
		
		switch(op) {
		case'+': 
			System.out.println(""+num1+op+num2+"="+(num1+num2);
		break;
		case'-': 
			System.out.println(""+num1+op+num2+"="+(num1-num2);
		break;
		case'*': 
			System.out.println(""+num1+op+num2+"="+(num1*num2);
		break;
		case'%': 
			System.out.println(""+num1+op+num2+"="+(num1%num2);
		break;
		case'/': 
			System.out.println(""+num1+op+num2+"="+(num1/(double)num2);
		break;
		default:
			System.out.println(op+"는 산술연산자가 아닙니다.");
		}
		
		scan close();
		
		 */
		
		
		
		
		
	}

}
