package day6;

import java.util.Scanner;

public class Ex5_Array3_Sum {

	public static void main(String[] args) {
		/*
		 * 학생 3명의 국어 성적을 입력받고 총점과 평균을 구하는 코드를 작성하세요. 단 학생 3명의 성적을 총점과 평균을 출력 한 다음 출력하세요.
		 */
		int [] arr = new int[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력하세요.");
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "번째 학생 성적 : "); // 0부터 시작하니까 +1을 해줘야 ~번째가 정확하게 나온다.
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		avg = sum / (double)arr.length;
		System.out.println("총합은 " + sum + " 이고"+ " 평균은 "+ avg + " 입니다.");
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+1+"번째 학생의 성적은 "+arr[i]+" 입니다. ");
		}

	}

}
