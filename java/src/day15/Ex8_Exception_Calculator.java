package day15;

import java.util.Scanner;

public class Ex8_Exception_Calculator {

	public static void main(String[] args) {
		// 두 정수와 산술 연산자가 주어졌을 때 산술 연산결과를 출력하는 코드를 작성하세요.
		// 단 예외처리는 필수.
		int num1 = 1, num2 = 0;
		char op = '/';
		try {
		switch(op) {
			case '+' :  System.out.println(num1 +num2);   break;
			case '-' :  System.out.println(num1 -num2);   break;
			case '*' :  System.out.println(num1 *num2);   break;
			case '%' :  System.out.println(num1 %num2);   break;
			case '/' :  
				int res = num1 / num2; // 0으로 나눌때 예외를 발생시키기 위해 필요한 코드다...그러면 catch에서 잡는다...? 밑에 double까지 못내려가고..
				System.out.println((double)num1 /num2);   break; // 실수/실수 는 infinit니까 res=num1/num2를 임의로 만들어준다.
			default: System.out.println("잘못된 연산자입니다."); break;
			}
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		


	}

}
