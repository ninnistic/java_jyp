package day08;

public class Ex8_Method6_Array {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		printArray(arr);
		int num = 11;
		int n = 3;
		System.out.println(contains(arr, num));
		System.out.println(contains(arr,3,num));
	}

	/* 기능 : 정수형 배열이 주어졌을 때, 주어진 배열의 값을 콘솔에 출력하는 메소드
	 * 매개변수 : 정수형 배열, int arr[] 
	 * 리턴타입 : 출력 = void
	 * 메소드명 : printArray
	 */

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

	/* 기능 : 정수형 배열에 정수 num이 있는지 없는지 알려주는 메소드
	 * {1,2,3,4,5}에 6이 있는지 없는지 확인하여 있다 없다를 알려주는 메소드.
	 * 매개변수 : 정수형 배열, 정수 => int arr[], int num
	 * 리턴타입 : boolean (있으면 true / 없으면 false?)
	 * 메소드명 : contains
	 * */

	public static boolean contains(int arr[], int num) {
		if (arr == null || arr.length == 0) {
			return false;
		}
		for (int tmp : arr) {
			if (tmp == num) {
				return true;
			}
		}
		return false;
	}

	/* 기능 : 정수형 배열에서 처음부터 n개중에서 정수 num이 있는지 없는지 알려주는 메소드
	 * 매개변수 : 정수형 배열, 정수: int arr[], int num, int n
	 * 리턴타입 : boolean
	 * 메소드명 : contains
	 * 메소드 오버로딩
	 */
	public static boolean contains(int arr[], int num, int n) {
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

}