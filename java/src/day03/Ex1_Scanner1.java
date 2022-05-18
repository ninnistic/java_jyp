package day03;

import java.util.Scanner;

public class Ex1_Scanner1 {

	public static void main(String[] args) {

		/*Scanner scan = new Scanner(System.in); // 연결하려면 마우스를 가져다 대고, import java util.
		System.out.print("정수를 입력하세요 : "); // 같은 줄에서 입력 받기 위해서 ln을 지운다.
		int num = scan.nextInt(); // 입력 받은 값을 num에 저장해주겠다. 
		System.out.println("입력한 정수는 " + num + "입니다.");
		scan.close(); // 없어도 에러는 안나지만 코드에서 노란줄이 뜨니까 써주는게 좋음.*/

		/* 한 학생의 수학, 영어, 국어 성적을 입력받고, 총점과 평균을 구하세요.
		 * 단 성적은 정수로 입력받고 0~100 사이의 정수를 입력해야 합니다. 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("국어 성적을 입력하세요 (0 ~ 100): ");
		int num1 = scan.nextInt();
		System.out.print("수학 성적을 입력하세요 (0 ~ 100): ");
		int num2 = scan.nextInt();
		System.out.print("영어 성적을 입력하세요 (0 ~ 100): ");
		int num3 = scan.nextInt();
		System.out.println("입력한 성적의 총점은 " + (num1 + num2 + num3) + "입니다.");
		System.out.println("입력한 성적의 평균은 " + (num1 + num2 + num3) / 3.0 + "입니다."); // 나는 여기서 나누기할때 주의사항을 빼멱었다.
																							// double을 붙이거나 3.0으로 나누어주면
																							// 된다.
		
		scan.close();
		
		/* 선생님 코드 
		마지막에 int sum = num 1 + num2 + num3;
		sysout 함.abstract
		double avg = sum / 3.0 */
	}
}
 