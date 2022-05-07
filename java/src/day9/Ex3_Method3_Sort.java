package day9;

import java.util.Scanner;

public class Ex3_Method3_Sort {

	public static void main(String[] args) {
		/* 5명의 학생의 성적을 입력받아 오름차순으로 출력하는 코드를 작성하세요.
		 * 단 입력받은 성적은 배열에 저장해야합니다.*/

		// 반복문과 Scanner을 이용하여 성적을 입력받음
		Scanner scan = new Scanner(System.in);
		System.out.println("성적입력 5명");
		int score[] = inputCreateArray(scan, 5);

		//반복문을 이용하여 성적 정렬
		bubbleSort(score, true);
		
		//반복문을 이용하여 배열 값 출력
		printArray(score);
				

		scan.close();

	}

	public static void printArray(int arr[]) {
		if (arr == null || arr.length == 0) {
			System.out.println("출력할 배열이 없습니다.");
			return; // return의 역할은 메소드를 빠져나가거나 종료하는 역할. return;의 의미는 return 값(empty)이기 떄문. void를 쓰더라도 return을 못쓰는건 아니다.
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int[] inputCreateArray(Scanner scan, int n) {
		if (n <= 0) {
			return null;
		}
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}

	/* 기능 : 정수 배열이 주어지면 오름차순 또는 내림차순으로 정렬 하는 method
	 * 매개변수 : 정수 배열, 오름차순 내림차순의 여부; => int arr[], boolean Asc//참이면 오름차순이고 false면 내림차순입니다~~
	 * 리턴타입 : 없음 => void // 참조타입은 원본값이 바뀔 수가 있다... 그래서 return을 안해도 된다고? 
	 * 메소드명 : bubbleSort
	 */
	public static void bubbleSort(int arr[], boolean asc) {
		if (arr == null) {
			return;
		}
		//참조변수인 경우 언제나 배열이 비어있음을 확인해주는게 좋음.
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				// 오름차순인 경우
				if (asc && arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				// 내림차순 인 경우 ( asc가 false면 내림차순이라는 뜻임)
				} else if (!asc && arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;

				}
			}
		}
	}
}
