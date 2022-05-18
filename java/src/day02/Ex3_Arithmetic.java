package day02;

public class Ex3_Arithmetic {

	public static void main(String[] args) {
		/* 산술 연산자 주의사항
		 * 1. 나누기 할 때 소수점 사라지는 현상 주의 
		 
		 * 정수 연산자 정수 -> 정수 
		 * 5 + 2 = 7
		 * 5 - 2 = 3
		 * 5 * 2 = 10
		 * 5 % 2 = 1
		 * 5 / 2 = 2 ( 2.5가 아니라 ) 
		 * 정수 연산자 실수 -> 실수
		 * 실수 연산자 실수 -> 실수
		 * 실수 연산자 정수 -> 실수
		 * 결과값이 어떠한 수(실수)
		 * 5 / 2 = 2.5 ( 자동 타입변환으로 실수가 됨)
		 * 
		 */
		System.out.println( 5 + 2 );
		System.out.println( 5 - 2 );
		System.out.println( 5 * 2 );
		System.out.println( 5 % 2 );
		System.out.println( 5 / 2 ); 
		System.out.println( 5 / 2.0 ); // 해결방법 2.0을 하면 알아서 실수로 2.5가 계산되어 나옴
		System.out.println( 5 / (double)2 ); // 즉 나눗셈시 소숫점을 살려 결과를 얻고싶다면 실수표현을 잘 하자
		
		// 산술 연산자 주의사항 2 : 0으로 나누는 경우 예외가 발생 할 수 있다. (정수 / 0 인 경우, 정수 % 0인 경우)
		System.out.println( 5 / 0.0 ); // answer : infinity, works
		System.out.println( 5 / 0 ); // exceptions, 예외 발생하면 프로그램이 종료되어 안됨 
		System.out.println( 5 % 0 ); // doesn't work
		
	}

}
