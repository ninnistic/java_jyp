package day06;

public class Ex3_Array1_Declaration {

	public static void main(String[] args) {
		int [] arr1 ;
		int [] arr2 = null;
		//5개짜리 정수 배열을 선언과 동시에 초기화
		int [] arr3 = new int [5];
		int size = 5;
		// 5개짜리 정수 배열을 선언과 동시에 초기화
		int [] arr4 = new int [size];
		// 5개짜리 정수 배열을 선언과 동시에 초기화
		int arr5[] = new int[5];
		
		int arr6[],arr7[]; // arr6은 배열 arr7은 변수
		
		int []arr8, arrg; // arr8은 배열 arr9도 배열
		
		int []arr10 = {1,2,3};
		// arr10 = {4,5,6};
		// {}를 이용한 방법은 초기화 이후에는 사용이 불가능하다.
		int []arr11 = new int[] {1,2,3};
		arr11 = new int[] {1,2,3};
		System.out.println(arr11.length);
		//배열의 길이를 정수로 알려준다.
	}

}
