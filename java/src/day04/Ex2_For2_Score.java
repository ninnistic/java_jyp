package day04;

import java.util.Scanner;

public class Ex2_For2_Score {

	public static void main(String[] args) {
		/*
		 * 세명의 국어 점수를 입력받아 총점과 평균을 구하는 코드를 작성하세요. 반복문 이용 단 총점과 평균만 알면 됩니다.
		 */

		int sum = 0;
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {				//궁금한게 For Loop 안에서는 i가 쓰이지 않는데...멀까...
			System.out.println("성적을 입력하세요.");
			int num = scan.nextInt();
			sum += num;
		}
		

		System.out.println("총합은" + sum + "입니다.");
		System.out.println("평균은" + sum / (double) 3 + "입니다.");

		
		// 선생님 코드;
		/*
		 * int i, num, sum;
		 * double avg;
		 * scanner scan~
		 * 
		 * for(i=1, i<=3, i++) {
		 * num = scan.nextInt();
		 * sum += num;
		 * }
		 * sysout (총점)
		 * avg = sum / 3; (위에 double로 타입지정 선언해도, 실수 = 정수/정수; 안됨. 정수 = (int)(실수/정수); 해도 안됨. 
		 * sysout (평균)
		 * 
		 * scan close().
		 */
		
		
		
	}

}


