package day06;

import java.util.Scanner;

public class Ex1_Calculator {

	public static void main(String[] args) {
		/*
		 * 문자를 입력받아 입력 받은 문자를 출력하는 코드를 작성하세요 단 q가 입력 될 때 까지 입력을 계속적으로 받으세요..
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");

		//  방법1
	/*	while (true) { 
	         char A = scan.next().charAt(0); 
	         System.out.println(A); 
	         
			 if (A == 'q') { 
				 break; 
	       } 
			
		 }*/
		 

		// 방법2
		/* char C;
		 do {
			 C = scan.next().charAt(0);
			 System.out.println(C);
			
		 } while ( C != 'q');
		 */

		/*
		 * 메뉴를 선택하면 정수 2개를 입력받아, 입력받은
		 *  입력받은 값에 맞는 산술 연산결과를 출력하는 코드를 작성하세요.
		 */
		
		for (;;) {
			System.out.println("산술 연산자 메뉴");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나머지");
			System.out.println("5. 나누기");
			System.out.println("q. 종료");
			System.out.println("메뉴를 선택하세요 : ");
			char ch = scan.next().charAt(0);
			if (ch == 'q') {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if (ch < '1' || ch > '5') {
				System.out.println("잘못된 연산자입니다.");
				continue;
			}
			System.out.println("두 정수를 입력하세요 : ");
			int A = scan.nextInt();
			int B = scan.nextInt();
			double res = 0.0;
			switch (ch) {
			case '1' : 
				res = A + B;
				System.out.println(""+A+ '+'+ B + "=" + res);
				break;
			case '2' : 
				res = A - B;
				System.out.println(""+A+ '-'+ B + "=" + res);
				break;
			case '3' : 
				res = A * B;
				System.out.println(""+A+ '*'+ B + "=" + res);
				break;
			case '4' : 
				res = A % B;
				System.out.println(""+A+ '%'+ B + "=" + res);
				break;
			case '5' : 
				res = A / B;
				System.out.println(""+A+ '/'+ B + "=" + res);
				break;
			}
		
		}
	}
}

