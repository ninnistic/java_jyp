package day09;

import java.util.Scanner;

public class Ex1_Method1_Baseball {

	public static void main(String[] args) {
		/*int arr[] = new int[3];
		
		int count = 0;
		
		while (count < 3) {
			int r = (int) (Math.random() * 4 + 1);
			int i = 0;
			for (; i < count; i++) {
				if (r == arr[i]) {
					break;
				}
			}
			if (i == count) {
				arr[count] = r;
				count++;
			}
			
		}
		printArray(arr);*/
		/* 1에서 4사이의 중복되지 않은 3개의 수를 생성하여 배열에 저장하고 출력하는 코드를 작성하세요.
		 * contains와 printArray를 이용.
		 * 
		 * 3개짜리 배열을 생성
		 * 저장된 개수가 3개가 될 떄 까지: count가 3이 아니면 동작 (count가 3보다 작으면 동작)
		 * 1부터 4사이의 랜덤한 수 생성
		 * 배열에 count개 만큼 랜덤한 수와 비교하여 있는지 없는지 확인해서 없으면 배열 count번지에 랜덤한 수 저장하고
		 * count를 1증가
		 * 
		 * 배열값 출력
		 * */
		int com[] = new int[3];
		int min = 1, max = 6;

		for (int count = 0; count < 3;) {
			int r = (int) (Math.random() * (max - min + 1) + min);
			if (!contains(com, count, r)) {
				com[count] = r;
				count++;

			}

		}
		printArray(com);

		
		int user[] = new int [3];
		int strike = 0, ball = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			strike = 0;
			ball = 0;
			//사용자가 1~9사이의 정수 3개를 입력 
			System.out.println("입력 :  ");
			for(int i = 0; i <user.length; i++) {
				user[i] = scan.nextInt();
			}
			//1) 스트라이크 개수 확인
			strike = getStrike(com,user);
			// 2) 볼의 개수 확인
			ball  = getBall(com,user);
			// 3) 결과 출력
			printResult(strike,ball);
			
			
		}while(strike <3);
		scan.close();

	}

	/* 기능 : 정수형 배열에서 처음부터 n개중에서 정수 num이 있는지 없는지 알려주는 메소드
	 * 매개변수 : 정수형 배열, 정수: int arr[], int num, int n
	 * 리턴타입 : boolean
	 * 메소드명 : contains
	 * 메소드 오버로딩
	 */
	public static boolean contains(int arr[], int n, int num) {
		//배열이 잘못되거나 비교개수가 잘못되어서 비교할 필요가 없는 경우르
		if (arr == null || arr.length == 0 || n <= 0) {
			return false;
		}
		if (arr.length < n) {
			n = arr.length; // 배열이 5개짜린데, 7개를 확인하라고 하면 index를 넘어가니까 n을 arr.length로 고쳐라. 
			//숫자 잘못 입력했으면 나가라면 return false도 넣어주면 됨
			// 이거 지우고 n에 11넣으면 예외가 뜰지도.. 예외처리도 정말 중요합니다. ㅠㅠ
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		return false;
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

	/* 기능 : 정수형 배열 2개가 주어지면 스트라이크 개수(같은 자리에서 일치하는 숫자의 개수)를 알려주는 메소드
	 * 매개변수 : 정수형 배열 2개, 개수 = int arr1[], int arr2[]
	 * 리턴타입 : int
	 * 메소드명 : getStrike
	 */
	public static int getStrike(int arr1[], int arr2[]) {
		if (arr1 == null || arr2 == null) {
			return 0;
		}
		int strike = 0;
		int count = arr1.length > arr2.length ? arr2.length : arr1.length;
		for (int i = 0; i < count; i++) {
			if (arr1[i] == arr2[i]) {
				strike++;
			}
		}
		return strike;
	}

	/* 기능 : 정수형 배열 2개가 주어지면 볼 개수(다른 자리에서 일치하는 숫자의 개수)를 알려주는 메소드
	 * 매개변수 : 정수형 배열 2개, 개수 = int arr1[], int arr2[]
	 * 리턴타입 : int 정수
	 * 메소드명 : getBall
	 */
	public static int getBall(int arr1[], int arr2[]) {
		if (arr1 == null || arr2 == null) {
			return 0;
		}
		int ball = 0;
		// 전체 일치하는 개수 = 볼 + 스트라이크의 개수 
		for (int tmp : arr1) {
			if (contains(arr2, arr2.length, tmp)) {
				ball++;
			}
		}
		// 볼의 개수 : 전체 일치하는 개수 - 스트라이크 개수 
		return ball - getStrike(arr1, arr2);

	}

	/* 기능 : 스트라이크와 볼의 개수가 주어지면 결과를 콘솔에 출력하는 메소드
	 * 매개변수 : 스트라이크와 볼의 개수, int s, int b
	 * 리턴타입 : 없음 출력 void
	 * 메소드명 : printResult 
	 */
	public static void printResult(int s, int b) {
		if (s != 0) {
			System.out.println(s + "S");
		}
		if (b != 0) {
			System.out.println(b + "B");
		}
		if (s == 0 && b == 0) {
			System.out.println("O");
		}
		System.out.println();
	}
}
