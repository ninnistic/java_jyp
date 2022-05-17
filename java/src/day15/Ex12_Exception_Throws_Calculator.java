package day15;

import java.util.Scanner;

public class Ex12_Exception_Throws_Calculator {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 0;
		char op = '?';
		double result;

		try {
			result = calculator(num1, op, num2);
			System.out.println(""+num1+op+num2+"="+result);

		} catch (ArithmeticException e) {
			/* getMessage() : 예외 클래스에 저장된 메세지를 가져오는 메소드다. 
			 * printStackTrace() : 예외가 발생한 메소드들의 위치를 찾아서 콘솔에 출력한다.
			 */
			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");

	}
	/* 기능 : 두 정수와 산술 연산자가 주어지면 산술연산 결과를 알려주는 메소드.
	 *  단,연산자가 산술연산자가 아니면 예외가 발생한다.
	 * 매개변수 : 두정수와, 산술연산자 int num1, char op, int num2 
	 * 리턴타입 : 산술 연산 결과 => 실수 => double
	 * 메소드명 : calculator
	 */
 /// Quesiton 어떻게 하면 "산술연산자가 아닙니다" 를 등장시킬 수 있을까??? e.getMessage()를 등장시킨다.
	public static double calculator(int num1, char op, int num2) throws Exception {
		double result = 0;

		switch (op) {
		case '+':
			return num1 + num2;

		case '-':
			return num1 - num2;

		case '*':
			return num1 * num2;

		case '%':
			return num1 % num2;

		case '/':
			if(num2 == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			return num1 / (double) num2;

		default:
			throw new Exception("산술 연산자가 아닙니다.");
		}
	}
}
