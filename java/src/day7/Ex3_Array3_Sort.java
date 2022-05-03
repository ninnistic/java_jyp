package day7;

public class Ex3_Array3_Sort {

	public static void main(String[] args) {
		/* 버블 정렬을 이용한 배열 정렬 예제. 효율이 제일 구리다... */
		// 정렬 방식에 따라서 정렬하는 속도가 다르다.
		
		int arr[] = {10, 15, 5, 18, 20, 1};
		
		for(int i=0; i<arr.length-1; i++) {  // 배열을 한번 도는 for문이다. 배열을 한번 돌아서 정렬하면 가장 큰 수가 맞춰진다.
			// i가 0일때 j는 4까지, i가 1일때 j는 3까지, i는 2일때 j는 2까지..
			for(int j=0; j<arr.length-1-i; j++) {
				// 앞 숫자가 크면 두 수를 교환한다.
				if(arr[j] > arr[j+1]) {  // 두 수를 바꾸는 코드. 무조건 기억 ㅠ
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					
				}
				
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
